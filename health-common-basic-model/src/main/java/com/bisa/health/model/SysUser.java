package com.bisa.health.model;



public class SysUser {
	
	
	
	
	/**
	 * Users id
	 */
	private int uid;
	
	/**
	 * UserAuthsId
	 */
	private int uaid;

	/**
	 * 账号
	 */
	private String username;
	/**
	 * 用户guid
	 */
	private int user_guid;
	/**
	 * 用户名字
	 */
	private String name;
	/**
	 * 用户性别
	 */
	private int sex;
	/**
	 * 用户年龄
	 */
	private int age;
	/**
	 * 用户体重
	 */
	private int weight;
	/**
	 * 用户身高
	 */
	private int height;
	/**
	 * 运动类型
	 */
	private int sport_type;
	/**
	 * 用户体型
	 */
	private int shape_type;

	/**
	 * 用户头像
	 */
	private String uri_pic;
	/**
	 * 用户生日
	 */
	private String birthday;

	/**
	 * 地区名称
	 */
	private String area_name;
	/**
	 * 地区编码
	 */
	private String area_code;
	/**
	 *时区
	 */
	private String time_zone;
	/**
	 * 是否启用默认是0
	 */
	private int activate;

	/**
	 * 登入类型
	 */
	private int l_type;

	
	/**
	 * 认证的类型
	 */
	private int verified;
	
	public int getUser_guid() {
		return user_guid;
	}

	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSport_type() {
		return sport_type;
	}

	public void setSport_type(int sport_type) {
		this.sport_type = sport_type;
	}

	public int getShape_type() {
		return shape_type;
	}

	public void setShape_type(int shape_type) {
		this.shape_type = shape_type;
	}

	public String getUri_pic() {
		return uri_pic;
	}

	public void setUri_pic(String uri_pic) {
		this.uri_pic = uri_pic;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public String getTime_zone() {
		return time_zone;
	}

	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}

	public int getActivate() {
		return activate;
	}

	public void setActivate(int activate) {
		this.activate = activate;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getUaid() {
		return uaid;
	}

	public void setUaid(int uaid) {
		this.uaid = uaid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getL_type() {
		return l_type;
	}

	public void setL_type(int l_type) {
		this.l_type = l_type;
	}

	public int getVerified() {
		return verified;
	}

	public void setVerified(int verified) {
		this.verified = verified;
	}

	@Override
	public String toString() {
		return "SysUser [uid=" + uid + ", uaid=" + uaid + ", username=" + username + ", user_guid=" + user_guid
				+ ", name=" + name + ", sex=" + sex + ", age=" + age + ", weight=" + weight + ", height=" + height
				+ ", sport_type=" + sport_type + ", shape_type=" + shape_type + ", uri_pic=" + uri_pic + ", birthday="
				+ birthday + ", area_name=" + area_name + ", area_code=" + area_code + ", time_zone=" + time_zone
				+ ", activate=" + activate + ", l_type=" + l_type + ", verified=" + verified + "]";
	}
	
	

}
