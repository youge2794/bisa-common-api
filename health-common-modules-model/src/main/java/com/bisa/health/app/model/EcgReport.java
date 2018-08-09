package com.bisa.health.app.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.bisa.health.app.enumerate.ReportStatus;
import com.bisa.health.app.enumerate.ReportType;
import com.bisa.health.app.enumerate.SexTypeEnum;
import com.bisa.health.entity.bind.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name="e_ecg_report",uniqueConstraints={@UniqueConstraint(columnNames={"report_number"})})
public class EcgReport implements Serializable{
	
	private static final long serialVersionUID = -5173470066830673219L;
	
	private	int	id;   //主键Id
	private String report_number;//报告编码(唯一编码)八位
	private	int user_guid;   //	用户唯一编码
	private	ReportType	report_type;   //	报告类型(10-15min;11-24hour)
	private	ReportStatus report_status;   //0-待上传数据 1-未被查看 2-已被查看  3-报告生成中 5-已上传数据 6-失效报告
	private Date start_time;  //起始时间（第一段数据finished_time?
	private	Date create_time;   //	报告创建时间
	private String pdf_bucKey;   //oss pdf 的bucket_key
	private String ecg_bucKey;   //oss zip 心电数据的bucket_key
	private int pre_consume; //预消费数量
	private String name;   //姓名
	private SexTypeEnum sex;
	private int age;
	private int height;
	private int weight;
	private String address;
	private String phone;
	private String hou_num;  //病房号
	private String bed_num;  //病床号
	private String birthday;   //生日
	private String idCard;  //身份证号
	private String dev_no;  //设备号
	
	@Id//设置主键
	@GeneratedValue(strategy = GenerationType.IDENTITY)//设置自增
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPre_consume() {
		return pre_consume;
	}
	public void setPre_consume(int pre_consume) {
		this.pre_consume = pre_consume;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	
	
	public String getReport_number() {
		return report_number;
	}
	public void setReport_number(String report_number) {
		this.report_number = report_number;
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
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	
	@Column(name="create_time",columnDefinition="timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP")
	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getHou_num() {
		return hou_num;
	}
	public void setHou_num(String hou_num) {
		this.hou_num = hou_num;
	}
	public String getBed_num() {
		return bed_num;
	}
	public void setBed_num(String bed_num) {
		this.bed_num = bed_num;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
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
	
	@Enumerated(EnumType.ORDINAL)
	public SexTypeEnum getSex() {
		return sex;
	}
	public void setSex(SexTypeEnum sex) {
		this.sex = sex;
	}
	@Enumerated(EnumType.ORDINAL)
	public ReportType getReport_type() {
		return report_type;
	}
	public void setReport_type(ReportType report_type) {
		this.report_type = report_type;
	}
	@Enumerated(EnumType.ORDINAL)
	public ReportStatus getReport_status() {
		return report_status;
	}
	public void setReport_status(ReportStatus report_status) {
		this.report_status = report_status;
	}
	public int year(){
		Calendar cal = Calendar.getInstance();
	 	cal.setTime(this.getStart_time());
        int year = cal.get(Calendar.YEAR);//获取年份
        return year;
	}
	public int month(){
		Calendar cal = Calendar.getInstance();
	 	cal.setTime(this.getStart_time());
        int month=cal.get(Calendar.MONTH)+1;//获取月份
        return month;
	}
	public int day(){
		Calendar cal = Calendar.getInstance();
	 	cal.setTime(this.getStart_time());
        int day=cal.get(Calendar.DATE);//获取日
        return day;
	}
	@Override
	public String toString() {
		return "EcgReport [id=" + id + ", report_number=" + report_number + ", user_guid=" + user_guid
				+ ", report_type=" + report_type + ", report_status=" + report_status + ", start_time=" + start_time
				+ ", create_time=" + create_time + ", pdf_bucKey=" + pdf_bucKey + ", ecg_bucKey=" + ecg_bucKey
				+ ", pre_consume=" + pre_consume + ", name=" + name + ", sex=" + sex + ", age=" + age + ", height="
				+ height + ", weight=" + weight + ", address=" + address + ", phone=" + phone + ", hou_num=" + hou_num
				+ ", bed_num=" + bed_num + ", birthday=" + birthday + ", idCard=" + idCard + ", dev_no=" + dev_no + "]";
	}
	
	

}
