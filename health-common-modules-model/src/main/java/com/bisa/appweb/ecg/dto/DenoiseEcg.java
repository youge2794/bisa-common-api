package com.bisa.appweb.ecg.dto;

import java.util.List;

public class DenoiseEcg {
	
	private List<DenoiseDataDto> data;
	
	private Status status;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public List<DenoiseDataDto> getData() {
		return data;
	}
	public void setData(List<DenoiseDataDto> data) {
		this.data = data;
	}
	
}
