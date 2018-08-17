package com.bisa.health.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="e_service_detail",indexes={@Index(columnList="user_guid")})
public class ServiceDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8620973614906844066L;

	private int id;
	
	private int userGuid;
	
	private int serviceType;  //服务类型 4为计数 5为计时
		
	private Date finishedTime;  //服务到期时间
	
	private int isActive;	//是否有效（1-有效,；2-无效）
	
	private int count;	//剩余次数
	
	private int classifyId;  //商品类别
	
	@Version
    private int version;	//乐观锁，版本控制
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Column(name="service_type")
	public int getServiceType() {
		return serviceType;
	}
	public void setServiceType(int serviceType) {
		this.serviceType = serviceType;
	}
	
	@Column(name="finished_time")
	public Date getFinishedTime() {
		return finishedTime;
	}
	public void setFinishedTime(Date finishedTime) {
		this.finishedTime = finishedTime;
	}
	
	@Column(name="is_active")
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Column(name="classify_id")
	public int getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(int classifyId) {
		this.classifyId = classifyId;
	}
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	public ServiceDetail() {
		super();
	}
	
	public ServiceDetail(int id, int userGuid, int serviceType, Date finishedTime, int isActive, int count,
			int classifyId, int version) {
		super();
		this.id = id;
		this.userGuid = userGuid;
		this.serviceType = serviceType;
		this.finishedTime = finishedTime;
		this.isActive = isActive;
		this.count = count;
		this.classifyId = classifyId;
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "ServiceDetail [id=" + id + ", userGuid=" + userGuid + ", serviceType=" + serviceType + ", finishedTime="
				+ finishedTime + ", isActive=" + isActive + ", count=" + count + ", classifyId=" + classifyId
				+ ", version=" + version + "]";
	}
	
}
