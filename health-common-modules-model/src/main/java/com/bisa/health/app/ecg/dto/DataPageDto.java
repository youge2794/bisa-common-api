package com.bisa.health.app.ecg.dto;

import java.util.List;


/**
 * 显示zip列表的dto
 * @author Administrator
 *
 */
public class DataPageDto {
	private String pre_index;//上一页索引
	private String cur_index;//当前页索引
	private String next_index;//下一页索引
	private List<DataZipDto>  datazipList;
	
	public String getCur_index() {
		return cur_index;
	}
	public void setCur_index(String cur_index) {
		this.cur_index = cur_index;
	}
	public String getPre_index() {
		return pre_index;
	}
	public void setPre_index(String pre_index) {
		this.pre_index = pre_index;
	}
	public String getNext_index() {
		return next_index;
	}
	public void setNext_index(String next_index) {
		this.next_index = next_index;
	}
	public List<DataZipDto> getDatazipList() {
		return datazipList;
	}
	public void setDatazipList(List<DataZipDto> datazipList) {
		this.datazipList = datazipList;
	}
	
	

}
