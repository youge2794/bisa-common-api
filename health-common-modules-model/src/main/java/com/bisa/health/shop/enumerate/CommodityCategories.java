package com.bisa.health.shop.enumerate;


/**
 * 商品分类:1001-心电仪;1002-摄像头;1003-血压计等
 * @author Administrator
 *
 */
public enum CommodityCategories {

	ECG(1001, "ECG"),  //心电仪
	CAMERA(1002, "CAMERA"),  //摄像头
	BLOOD(1003, "BLOOD");	//血压计
	
	
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
	
	private CommodityCategories(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static CommodityCategories getByValue(int value) {
		for (CommodityCategories status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}
