package com.bisa.health.common.dao;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.model.Users;
@Repository
public class UsersDaoImpl extends BaseDao<Users> implements IUsersDao {

	@Override
	public Users getUsersByGuid(int user_guid) {
		String sql = "SELECT * FROM sys_users WHERE USER_GUID=?";
		return super.queryObjectBySql(sql, new Object[]{user_guid}, Users.class);
	}

	@Override
	public int updateUsers(Users users) {
		String sql = "UPDATE sys_users SET NAME=?,SEX=?,AGE=?,WEIGHT=?,HEIGHT=?,"
				+ "SPORT_TYPE=?,SHAPE_TYPE=?,URI_PIC=?,BIRTHDAY=?,ACTIVATE=? WHERE USER_GUID=?";
		return super.updateBySql(sql, new Object[]{users.getName(),users.getSex(),users.getAge(),users.getWeight(),users.getHeight(),
				users.getSport_type(),users.getShape_type(),users.getUri_pic(),users.getBirthday(),users.getActivate(),users.getUser_guid()});
	}

	@Override
	public int addUsersBasic(Users users) {
		String sql = "INSERT INTO sys_users(USER_GUID,AREA_NAME,AREA_CODE,TIME_ZONE,ACTIVATE) VALUES(?,?,?,?,?)";
		return super.addBySql(sql, new Object[]{users.getUser_guid(),users.getArea_name(),users.getArea_code(),users.getTime_zone(),users.getActivate()});
	}

	@Override
	public int deleteUsers(int user_guid) {
		String sql = "DELETE FROM sys_users WHERE USER_GUID=?";
		return super.deleteBySql(sql, new Object[]{user_guid});
	}

	@Override
	public int updateUsersBasic(Users users) {
		String sql = "UPDATE sys_users SET AREA_NAME=?,AREA_CODE=?,TIME_ZONE=? WHERE USER_GUID=?";
		return super.updateBySql(sql, new Object[]{users.getArea_name(),users.getArea_code(),users.getTime_zone(),users.getUser_guid()});
	}

	@Override
	public int addUsers(Users users) {
		String sql = "INSERT INTO sys_users(USER_GUID,AREA_NAME,AREA_CODE,TIME_ZONE,ACTIVATE,NAME,URI_PIC,SEX) VALUES(?,?,?,?,?,?,?,?)";
		return super.addBySql(sql, new Object[]{users.getUser_guid(),users.getArea_name(),users.getArea_code(),users.getTime_zone(),users.getActivate(),users.getName(),users.getUri_pic(),users.getSex()});
	}

}
