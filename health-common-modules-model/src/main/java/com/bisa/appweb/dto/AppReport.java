package com.bisa.appweb.dto;

import com.bisa.appweb.model.EcgReport;

public class AppReport {
	
	private int id;//		报告ID
	
	private String report_number;//	报告唯一编号
	
	private int report_type;//报告类型(10-15分钟报告；11-24小时报告；)
	
	private int	report_status;//报告状态（1-生成好未查看，2已查看，3正在生成中；4-尚未上传数据；5-已上传数据;6-无效报告）
	
	private Long start_time;  //起始时间（第一段数据finished_time?
	
	private	Long end_time;   //	终止时间（最后一段数据finished_time?
	
	private	int user_guid;   //	用户唯一编码
	
	private EcgReport ecgReport;
	
	public AppReport(EcgReport ecgReport) {
		super();
		this.ecgReport = ecgReport;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReport_number() {
		return report_number;
	}
	public void setReport_number(String report_number) {
		this.report_number = report_number;
	}
	public int getReport_type() {
		return report_type;
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
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	
	
	public AppReport() {
		super();
	}
	public AppReport loadAppReport(){
		AppReport appReport = new AppReport();
		appReport.setId(ecgReport.getId());
		appReport.setReport_number(ecgReport.getReport_number());
		appReport.setStart_time(ecgReport.getStart_time());
		appReport.setReport_status(ecgReport.getReport_status());
		appReport.setEnd_time(ecgReport.getEnd_time());
		appReport.setReport_type(ecgReport.getReport_type());
		appReport.setUser_guid(ecgReport.getUser_guid());
		return appReport;
	}
	@Override
	public String toString() {
		return "AppReport [id=" + id + ", report_number=" + report_number + ", report_type=" + report_type
				+ ", report_status=" + report_status + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", user_guid=" + user_guid + ", ecgReport=" + ecgReport + "]";
	}
	
}
