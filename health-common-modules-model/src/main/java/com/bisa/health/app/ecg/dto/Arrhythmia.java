package com.bisa.health.app.ecg.dto;

import java.util.List;


public class Arrhythmia {
	
	private List<ArrhythmiaDataDto> data;
	
	private Status status;

	public List<ArrhythmiaDataDto> getData() {
		return data;
	}

	public void setData(List<ArrhythmiaDataDto> data) {
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
