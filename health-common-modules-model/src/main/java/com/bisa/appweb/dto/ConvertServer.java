package com.bisa.appweb.dto;

import java.util.List;

public class ConvertServer {
	
	private String version="20171111";
	
	private List<GlobalServerDto> list;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<GlobalServerDto> getList() {
		return list;
	}
	public void setList(List<GlobalServerDto> list) {
		this.list = list;
	}

	
}
