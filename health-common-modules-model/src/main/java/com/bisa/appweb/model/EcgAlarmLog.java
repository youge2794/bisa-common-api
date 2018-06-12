package com.bisa.appweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 平安钟 发送警报记录类
 * @author Administrator
 *
 */
@Entity
@Table(name="e_ecg_alarmlog",indexes={@Index(columnList="user_guid")})
public class EcgAlarmLog {
	private int id;
	private int user_guid;
	private String event_name;//联系人姓名
	private String event_num;//联系人手机号
	private String event_mail;//联系人邮箱
	private int event_type;//事件类型 1-主动求救; 2-短暂停搏; 3-持续停搏
	private String send_time;//发送时间
	private int sms_code;//短信发送返回码（200/400)
	private String sms_msg;//短信发送返回异常信息
	private int mail_code;//邮箱发送返回码（200/400)
	private String mail_msg;//邮箱发送返回异常信息
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	@Column(length=24,nullable=false)
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	@Column(length=20,nullable=false)
	public String getEvent_num() {
		return event_num;
	}
	public void setEvent_num(String event_num) {
		this.event_num = event_num;
	}
	@Column(nullable=true)
	public int getEvent_type() {
		return event_type;
	}
	public void setEvent_type(int event_type) {
		this.event_type = event_type;
	}
	@Column(length=50,nullable=false)
	public String getSend_time() {
		return send_time;
	}
	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}
	
	public String getEvent_mail() {
		return event_mail;
	}
	public void setEvent_mail(String event_mail) {
		this.event_mail = event_mail;
	}
	
	public int getSms_code() {
		return sms_code;
	}
	public void setSms_code(int sms_code) {
		this.sms_code = sms_code;
	}
	public String getSms_msg() {
		return sms_msg;
	}
	public void setSms_msg(String sms_msg) {
		this.sms_msg = sms_msg;
	}
	public int getMail_code() {
		return mail_code;
	}
	public void setMail_code(int mail_code) {
		this.mail_code = mail_code;
	}
	public String getMail_msg() {
		return mail_msg;
	}
	public void setMail_msg(String mail_msg) {
		this.mail_msg = mail_msg;
	}
	public EcgAlarmLog() {
		super();
	}
	
}
