package com.bisa.health.app.ecg.dto;
/**
 * 显示zip列表的dto
 * @author Administrator
 *
 */
public class DataZipDto {

	private int count; //数据总条数
	private String submit_time;
	private int user_guid;
	private String bucket_key;//oss的bucket_key
	private String report_status;//	报告状态（1-未被查看 2-已被查看  3-报告生成中）
	private String report_id;  //可公开的report_id
	
	private int id;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReport_status() {
		return report_status;
	}
	public void setReport_status(String report_status) {
		this.report_status = report_status;
	}
	public String getSubmit_time() {
		return submit_time;
	}
	public void setSubmit_time(String submit_time) {
		this.submit_time = submit_time;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public String getBucket_key() {
		return bucket_key;
	}
	public void setBucket_key(String bucket_key) {
		this.bucket_key = bucket_key;
	}
	public String getReport_id() {
		return report_id;
	}
	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}
}
