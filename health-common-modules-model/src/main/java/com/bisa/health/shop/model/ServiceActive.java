package com.bisa.health.shop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 服务激活卡
 * @author Administrator
 *
 */
@Entity
@Table(name="s_service_active",indexes={@Index(columnList="user_guid")})
public class ServiceActive {
	
	private int id;
	private int userGuid;   //拥有者的user_guid
	private String cardNumber; //激活卡号20位(BHS+时间+3位随机数）   前期可以生成随机卡号；后期有需要可以改成批量顺序卡号
	private String activeCode; //激活码8位  随机数字
	private int status; //是否使用；0-未使用；1-已使用（已激活）
	private int count; //服务次数（激活卡面值）
	private int time; //充值时间，最低单位/月（如1个月，6个月等）
	private String serviceName; //服务名称
	private int classifyId; //服务的分类id
	private int remark;  //备注类型
	private String account;//激活账号（服务使用者的账号，手机号或邮箱）
	private Date activeTime;  //使用时间
	
	//private Date creatTime; //创建时间
	//private int cardType;  //卡的类型，后期可扩展，多类卡型。
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="user_guid")
	public int getUserGuid() {
		return userGuid;
	}
	public void setUserGuid(int userGuid) {
		this.userGuid = userGuid;
	}
	@Column(name="card_number")
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Column(name="active_code")
	public String getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}
	@Column(name="status")
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Column(name="count")
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Column(name="time")
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Column(name="service_name")
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	@Column(name="classify_id")
	public int getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(int classifyId) {
		this.classifyId = classifyId;
	}
	@Column(name="remark")
	public int getRemark() {
		return remark;
	}
	public void setRemark(int remark) {
		this.remark = remark;
	}
	@Column(name="account")
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Column(name="active_time")
	public Date getActiveTime() {
		return activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}
	public ServiceActive() {
		super();
	}
	public ServiceActive(int id, int userGuid, String cardNumber, String activeCode, int status, int count, int time,
			String serviceName, int classifyId, int remark, String account, Date activeTime) {
		super();
		this.id = id;
		this.userGuid = userGuid;
		this.cardNumber = cardNumber;
		this.activeCode = activeCode;
		this.status = status;
		this.count = count;
		this.time = time;
		this.serviceName = serviceName;
		this.classifyId = classifyId;
		this.remark = remark;
		this.account = account;
		this.activeTime = activeTime;
	}
	@Override
	public String toString() {
		return "ServiceActive [id=" + id + ", userGuid=" + userGuid + ", cardNumber=" + cardNumber + ", activeCode="
				+ activeCode + ", status=" + status + ", count=" + count + ", time=" + time + ", serviceName="
				+ serviceName + ", classifyId=" + classifyId + ", remark=" + remark + ", account=" + account
				+ ", activeTime=" + activeTime + "]";
	}
	
	
	
}
