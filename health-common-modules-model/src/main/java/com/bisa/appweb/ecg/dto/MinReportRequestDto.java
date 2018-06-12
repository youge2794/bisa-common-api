package com.bisa.appweb.ecg.dto;

public class MinReportRequestDto {
	
	private String raw_ecg;
	
	private int multiplier;
	
	private int frequency;
	
	private int gender;
	
	private String developer_id;

	public String getRaw_ecg() {
		return raw_ecg;
	}

	public void setRaw_ecg(String raw_ecg) {
		this.raw_ecg = raw_ecg;
	}

	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getDeveloper_id() {
		return developer_id;
	}

	public void setDeveloper_id(String developer_id) {
		this.developer_id = developer_id;
	}

}
