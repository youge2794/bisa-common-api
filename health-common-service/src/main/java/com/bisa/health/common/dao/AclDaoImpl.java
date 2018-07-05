package com.bisa.health.common.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.jdbc.ReturningWork;
import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.common.utils.BasicSysKit;
import com.bisa.health.model.Acl;
import com.bisa.health.model.UserAuths;

@Repository
public class AclDaoImpl extends BaseDao<Acl> implements IAclDao {

	

	/**
	 * 获取权限的拼装字符串
	 * 
	 * @param pid
	 * @param ptype
	 * @param rtype
	 * @return
	 */
	@SuppressWarnings("unused")
	private Map<String, List<String>> listPermissionAllResAndOperByPrin(final Integer pid, final String ptype,final String rtype) {
		
		
		String sql = "select a.acl_state,co.indexPos,cr.cname,co.method_name from sys_acl a,sys_controller_res cr,sys_controller_oper co"
				+ " where a.rid=cr.id and cr.id=co.rid and a.pid=? and a.ptype=? and a.rtype=?";
		return super.getSession().doReturningWork(new ReturningWork<Map<String, List<String>>>() {

			@Override
			public Map<String, List<String>> execute(Connection connection) throws SQLException {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, pid);
				preparedStatement.setString(2, ptype);
				preparedStatement.setString(3, rtype);
                ResultSet rs = preparedStatement.executeQuery();
            	Map<String, List<String>> maps = new HashMap<String, List<String>>();
        		
        		for(int i=0;i<rs.getRow();i++){
        			int aclState= rs.getInt("acl_state");
        			int indexPos =rs.getInt("indexPos");
        			String className =rs.getString("cname");
        			String methodName =rs.getString("method_name");
        			
        			if (Acl.checkPermission(indexPos, aclState)) {
        				if (!maps.containsKey(className)) {
        					maps.put(className, new ArrayList<String>());
        					addAclStateAndMethodToList(maps, className, methodName, aclState);
        				} else {
        					addAclStateAndMethodToList(maps, className, methodName, aclState);
        				}
        			}
        		}
        		return maps;
			}
			
			
		});

	}



	private void addAclStateAndMethodToList(Map<String, List<String>> maps, String className, String methodName,
			Integer aclState) {
		List<String> ms = maps.get(className);
		String[] mns = methodName.split("\\|");
		for (String m : mns) {
			if (!ms.contains(m))
				ms.add(aclState + "+" + m);
		}
	}
	

	@Override
	public Set<String> listAllUserPermission(final Integer userId,final  String rtype) {

		Map<String, List<String>> umaps = listPermissionAllResAndOperByPrin(userId, UserAuths.PRINCIPAL_TYPE, rtype);
		
		final String sql = "select a.acl_state,co.indexPos,cr.cname,co.method_name from sys_acl a,sys_controller_res cr,sys_controller_oper co,sys_role ur"+ 
				" where a.rid=cr.id and cr.id=co.rid and ur.id=a.pid and ur.uid=? and a.ptype=? and a.rtype=?";

		return super.getSession().doReturningWork(new ReturningWork<Set<String>>() {

			@Override
			public Set<String> execute(Connection connection) throws SQLException {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, userId);
				preparedStatement.setString(2, UserAuths.PRINCIPAL_TYPE);
				preparedStatement.setString(3, rtype);
                ResultSet rs = preparedStatement.executeQuery();
                
            	Map<String, List<String>> rmaps = new HashMap<String, List<String>>();
            	for(int i=0;i<rs.getRow();i++){
					int aclState= rs.getInt("acl_state");
					int indexPos =rs.getInt("indexPos");
					String className =rs.getString("cname");
					String methodName =rs.getString("method_name");
					
					if (Acl.checkPermission(indexPos, aclState)) {
						if (!rmaps.containsKey(className)) {
							rmaps.put(className, new ArrayList<String>());
							addAclStateAndMethodToList(rmaps, className, methodName, aclState);
						} else {
							addAclStateAndMethodToList(rmaps, className, methodName, aclState);
						}
					}
				}
            	
            	
        		
        		Set<String> rkeys = rmaps.keySet();
        		for (String rk : rkeys) {
        			if (umaps.containsKey(rk)) {
        				BasicSysKit.mergeList(umaps.get(rk), rmaps.get(rk));
        			} else {
        				umaps.put(rk, rmaps.get(rkeys));
        			}
        		}
        		Set<String> perList = new HashSet<String>();
        		for (Map.Entry<String, List<String>> entry : umaps.entrySet()) {
        			String className = entry.getKey();
        			List<String> listStr = entry.getValue();
        			for (String pstr : listStr) {
        				perList.add(className + "+" + pstr);
        			}

        		}
        		return perList;

			}
			
			
		});
		

	}




}
