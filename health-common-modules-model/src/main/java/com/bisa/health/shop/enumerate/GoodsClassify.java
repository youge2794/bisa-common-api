package com.bisa.health.shop.enumerate;

/**
 * 商品类别
 * @author Administrator
 *
 */
public enum GoodsClassify {
	/**
	 * 主商品
	 */
	MAIN(1, "MAIN"), 
	/**
	 * 配件商品（实体）
	 */
	FITTING(2, "FITTING"), 
	/**
	 * 虚拟商品（服务）
	 */
	VIRTUAL(3, "VIRTUAL"),
	/**
	 * 虚拟商品-次数型
	 */
	COUNT(4, "COUNT"),
	/**
	 * 虚拟商品-时限型
	 */
	TIME(5, "TIME"),
	/**
	 * 套餐
	 */
	PACKAGES(6, "PACKAGES");
	
	//主打商品
	/*
	ECG(100, "ECG"),  //心电仪
	BLUE_SENSOR(101, "BLUE_SENSOR"),   //蓝色电极片
	CAMERA(110, "CAMERA"),  //摄像头
	BLOOD(120, "BLOOD");	//血压计
	*/
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
	
	private GoodsClassify(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static GoodsClassify getByValue(int value) {
		for (GoodsClassify status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}
