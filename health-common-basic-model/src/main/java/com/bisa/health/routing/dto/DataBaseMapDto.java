package com.bisa.health.routing.dto;

public class DataBaseMapDto {
	private String database;
	private boolean isOptStatus;

	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public boolean isOptStatus() {
		return isOptStatus;
	}
	public void setOptStatus(boolean isOptStatus) {
		this.isOptStatus = isOptStatus;
	}
	public DataBaseMapDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataBaseMapDto(String database, boolean isOptStatus) {
		super();
		this.database = database;
		this.isOptStatus = isOptStatus;
	}
	
	
	
}
