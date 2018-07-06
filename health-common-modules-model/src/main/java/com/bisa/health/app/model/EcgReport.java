package com.bisa.health.app.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="e_ecg_report",uniqueConstraints={@UniqueConstraint(columnNames={"report_number"})})
public class EcgReport implements Serializable{
	
	private static final long serialVersionUID = -5173470066830673219L;
	
	private	int	id;   //主键Id
	private String report_number;//报告编码(唯一编码)八位
	private	int user_guid;   //	用户唯一编码
	private	int	report_type;   //	报告类型(10-15min;11-24hour)
	private	int	report_status;   //	报告状态（1-未被查看 2-已被查看  3-报告生成中 4-待上传数据 5-已上传数据 6-失效报告）
	
	private Long start_time;  //起始时间（第一段数据finished_time?
	private	Long end_time;   //	终止时间（最后一段数据finished_time?
	private	String submit_time;   //	报告提交时间
	private String report_id;//报告ID（365合作方的编码）
	private String pdf_bucKey;   //oss pdf 的bucket_key
	
	private String ecg_bucKey;   //oss zip 心电数据的bucket_key
	private String user_no;  //365账号
	private String password;   //365密码
	private String third_user_id;//用户id
	private String name;//用户姓名
	
	private int sex; //性别
	private int age;//年龄
	private String s_time;//测量开始时间，精确到毫秒的时间戳
	private int height;
	private int weight;
	
	private String file_path;//文件地址
	private String _case;//病历号
	private String address;//用户地址
	private String phone;//用户手机号
	private String hos_num;//住院号
	
	private String bed_num;//床号
	private String birthday; //生日
	private String idCard;  //身份证号
	private String dev_no;//仪器编号
	private String dev_version;//固件版本号及固件加载日期
	
	private int lead_num;  //心电通道数(3-三导联，12-十二导联)
	private int ecg_rate;  //心电采样率
	private int ecg_length;  //心电采样字长
	/**
	 * 25=8位有效数据
	 * 51=9位有效数据
	 * 102=10位有效数据
	 * 409=12位有效数据
	 */
	private int ecg_constant;  //心电采样常数
	private int ecg_sensitivity; //心电灵敏度
	
	@Id//设置主键
	@GeneratedValue(strategy = GenerationType.IDENTITY)//设置自增
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getThird_user_id() {
		return third_user_id;
	}

	public void setThird_user_id(String third_user_id) {
		this.third_user_id = third_user_id;
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

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}

	public String getS_time() {
		return s_time;
	}

	public void setS_time(String s_time) {
		this.s_time = s_time;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	
	public int getReport_type() {
		return report_type;
	}
	public String getReport_number() {
		return report_number;
	}
	public void setReport_number(String report_number) {
		this.report_number = report_number;
	}
	
	public void setReport_type(int report_type) {
		this.report_type = report_type;
	}
	public int getReport_status() {
		return report_status;
	}
	public void setReport_status(int report_status) {
		this.report_status = report_status;
	}
	public Long getStart_time() {
		return start_time;
	}
	public void setStart_time(Long start_time) {
		this.start_time = start_time;
	}
	public Long getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Long end_time) {
		this.end_time = end_time;
	}
	public String getSubmit_time() {
		return submit_time;
	}
	public void setSubmit_time(String submit_time) {
		this.submit_time = submit_time;
	}
	public String getReport_id() {
		return report_id;
	}
	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}
	
	
	public String getPdf_bucKey() {
		return pdf_bucKey;
	}
	public void setPdf_bucKey(String pdf_bucKey) {
		this.pdf_bucKey = pdf_bucKey;
	}
	public String getEcg_bucKey() {
		return ecg_bucKey;
	}
	public void setEcg_bucKey(String ecg_bucKey) {
		this.ecg_bucKey = ecg_bucKey;
	}
	public String get_case() {
		return _case;
	}
	public void set_case(String _case) {
		this._case = _case;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHos_num() {
		return hos_num;
	}
	public void setHos_num(String hos_num) {
		this.hos_num = hos_num;
	}
	public String getBed_num() {
		return bed_num;
	}
	public void setBed_num(String bed_num) {
		this.bed_num = bed_num;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getDev_no() {
		return dev_no;
	}
	public void setDev_no(String dev_no) {
		this.dev_no = dev_no;
	}
	public String getDev_version() {
		return dev_version;
	}
	public void setDev_version(String dev_version) {
		this.dev_version = dev_version;
	}
	public int getLead_num() {
		return lead_num;
	}
	public void setLead_num(int lead_num) {
		this.lead_num = lead_num;
	}
	public int getEcg_rate() {
		return ecg_rate;
	}
	public void setEcg_rate(int ecg_rate) {
		this.ecg_rate = ecg_rate;
	}
	public int getEcg_length() {
		return ecg_length;
	}
	public void setEcg_length(int ecg_length) {
		this.ecg_length = ecg_length;
	}
	public int getEcg_constant() {
		return ecg_constant;
	}
	public void setEcg_constant(int ecg_constant) {
		this.ecg_constant = ecg_constant;
	}
	public int getEcg_sensitivity() {
		return ecg_sensitivity;
	}
	public void setEcg_sensitivity(int ecg_sensitivity) {
		this.ecg_sensitivity = ecg_sensitivity;
	}

}
