package com.bisa.health.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.model.UserAuths;

@Repository
public class UserAuthsDaoImpl extends BaseDao<UserAuths> implements IUserAuthsDao {

	@Override
	public UserAuths getUserAuthsByUsername(String username) {
		String sql = "SELECT * FROM sys_user_auths WHERE USERNAME=?";
		return super.queryObjectBySql(sql, new Object[]{username}, UserAuths.class);
	}

	@Override
	public List<UserAuths> getUserAuthsByGuid(int user_guid) {
		String sql = "SELECT * FROM sys_user_auths WHERE USER_GUID=?";
		return super.listBySql(sql, new Object[]{user_guid}, UserAuths.class,true);
	}

	@Override
	public int addUserAuths(UserAuths userAuths) {
		String sql = "INSERT INTO sys_user_auths(USER_GUID,L_TYPE,USERNAME,PASSWORD,VERIFIED, ROLE_ID,SALT,ARCHIVED,CREATE_TIME) VALUES(?,?,?,?,?, ?,?,?,?)";
		return super.addBySql(sql, new Object[]{userAuths.getUser_guid(),userAuths.getL_type(),userAuths.getUsername(),userAuths.getPassword(),userAuths.getVerified(),
				userAuths.getRole_id(),userAuths.getSalt(),userAuths.getArchived(),userAuths.getCreate_time()});
	}

	@Override
	public int updateUserAuths(UserAuths userAuths) {
		String sql = "UPDATE sys_user_auths SET L_TYPE=?,USERNAME=?,PASSWORD=?,VERIFIED=?,"
				+ "ROLE_ID=?,ARCHIVED=? WHERE id=?";
		return super.updateBySql(sql, new Object[]{userAuths.getL_type(),userAuths.getUsername(),userAuths.getPassword(),userAuths.getVerified(),
				userAuths.getRole_id(),userAuths.getArchived(),userAuths.getId()});
	}

	@Override
	public int updatePwd(int user_guid,String password) {
		String sql = "UPDATE sys_user_auths SET PASSWORD=? WHERE USER_GUID=?";
		return super.updateBySql(sql, new Object[]{password,user_guid});
	}

	@Override
	public int deleteUserAuths(String username) {
		String sql = "DELETE FROM sys_user_auths WHERE USERNAME=?";
		return super.deleteBySql(sql, new Object[]{username});
	}

	@Override
	public UserAuths getUserAuthsByType(int user_guid, int l_type) {
		String sql = "SELECT * FROM sys_user_auths WHERE USER_GUID=? AND L_TYPE=?";
		return super.queryObjectBySql(sql, new Object[]{user_guid,l_type}, UserAuths.class);
	}

	@Override
	public int updateVerified(int user_guid, int value) {
		String sql = "UPDATE sys_user_auths SET VERIFIED=? WHERE USER_GUID=?";
		return super.updateBySql(sql, new Object[]{value,user_guid});
	}



}
