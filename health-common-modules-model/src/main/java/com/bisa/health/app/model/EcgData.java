package com.bisa.health.app.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.bisa.health.entity.bind.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name="e_ecg_data",indexes={@Index(columnList="reportId")})
public class EcgData {
	
	private	int	id;
	
	private String deviceName;
	
	private	String datFilename; //文件名
	
	private int reportId;
	
	private int eventType;
	
	private	byte[] ecgDat;  //心电数据

	private Date dataTime;  //心电数据文件名上的数据时间
	
	private	Date upTime;  //心电数据上传到数据库的时间
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="device_name")
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	@Column(name="dat_filename")
	public String getDatFilename() {
		return datFilename;
	}
	public void setDatFilename(String datFilename) {
		this.datFilename = datFilename;
	}
	
	@Column(name="reportid")
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	
	@Column(name="event_type")
	public int getEventType() {
		return eventType;
	}
	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
	
	@Column(name="ecg_dat")
	public byte[] getEcgDat() {
		return ecgDat;
	}
	public void setEcgDat(byte[] ecgDat) {
		this.ecgDat = ecgDat;
	}
	
	@Column(name="data_time")
	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getDataTime() {
		return dataTime;
	}
	public void setDataTime(Date dataTime) {
		this.dataTime = dataTime;
	}
	
	@Column(name="up_time",columnDefinition="timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP")
	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getUpTime() {
		return upTime;
	}
	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}
	

	public EcgData() {
		super();
	}

}
