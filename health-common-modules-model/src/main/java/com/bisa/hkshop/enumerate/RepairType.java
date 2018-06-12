package com.bisa.hkshop.enumerate;

/**
 * 维修类型
 * @author Administrator
 *
 */
public enum RepairType {
	//类型:
	UNCONNECTED(1,"UNCONNECTED"),  //1.无法连接手机
	NOPOWER(2,"NOPOWER"),   //2.不通电
	DAMAGED(3,"DAMAGED"),   // 3.破损
	OTHER(4,"OTHER");   //4.其他
	
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

	private RepairType(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static RepairType getByValue(int value) {
		for (RepairType status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}
