package com.bisa.health.app.enumerate;


public enum ReportStatus {
	//0-待上传数据 1-未被查看 2-已被查看  3-报告生成中 5-已上传数据 6-失效报告
	NEED_DATA(0, "NEED_DATA"),
	UNREAD(1, "UNREAD"),
	READ(2, "READ"),
	GENERATED(3, "GENERATED"),
	HAS_DATA(5, "HAS_DATA"),
	INVALID(6, "INVALID"),
	WRONGDATA(7, "WRONGDATA");
	
	private int value;
	private String name;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private ReportStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static ReportStatus getByValue(int value){
		for(ReportStatus rs : values()){
			if(rs.getValue() == value){
				return rs;
			}
		}
		return null;
	}

}
