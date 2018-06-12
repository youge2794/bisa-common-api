package com.bisa.hkshop.enumerate;

/**
 * 商品分类
 * com.bisa.hkshop.enumerate.CommodityType
 * @author Administrator
 *
 */
public enum CommodityType {
	/**
	 * 主商品
	 */
	MAIN(99, "MAIN"), 
	/**
	 * 附属商品
	 */
	FITTING(98, "FITTING"), 
	/**
	 * 服务
	 */
	SERVICE(97, "SERVICE"),
	/**
	 * 单品
	 */
	SINGLE(0, "SINGLE"),
	/**
	 * 套餐
	 */
	Package(1, "Package");
	
	
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
	
	private CommodityType(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static CommodityType getByValue(int value) {
		for (CommodityType status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}
