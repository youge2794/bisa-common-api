package com.bisa.appweb.dto;

import com.bisa.appweb.model.EcgReport;

public class PCReportDto {
	
	private int id;//		报告ID
	
	private String report_number;//	报告唯一编号
	
	private int report_type;//报告类型(10-15分钟报告；11-24小时报告；)
	
	private int	report_status;//报告状态（1-生成好未查看，2已查看，3正在生成中；4-尚未上传数据；5-已上传数据;6-无效报告）
	
	private Long start_time;  //起始时间（第一段数据finished_time?
	
	private	Long end_time;   //	终止时间（最后一段数据finished_time?
	
	private	int user_guid;   //	用户唯一编码
	
	private	String submit_time;   //	上传时间
	
	private String down_url; //下载url
	
	private EcgReport ecgReport;
	
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
	public String getSubmit_time() {
		return submit_time;
	}
	public void setSubmit_time(String submit_time) {
		this.submit_time = submit_time;
	}
	public String getDown_url() {
		return down_url;
	}
	public void setDown_url(String down_url) {
		this.down_url = down_url;
	}
	public PCReportDto(EcgReport ecgReport) {
		this.ecgReport = ecgReport;
	}
	
	public PCReportDto() {
		super();
	}
	public PCReportDto loadPCReportDto(String down_url){
		PCReportDto pcReportDto= new PCReportDto();
		pcReportDto.setId(ecgReport.getId());
		pcReportDto.setReport_number(ecgReport.getReport_number());
		pcReportDto.setReport_type(ecgReport.getReport_type());
		pcReportDto.setSubmit_time(ecgReport.getSubmit_time());
		pcReportDto.setUser_guid(ecgReport.getUser_guid());
		pcReportDto.setStart_time(ecgReport.getStart_time());
		pcReportDto.setEnd_time(ecgReport.getEnd_time());
		pcReportDto.setDown_url(down_url);
		pcReportDto.setReport_status(ecgReport.getReport_status());
		return pcReportDto;
	}
	
	
}
