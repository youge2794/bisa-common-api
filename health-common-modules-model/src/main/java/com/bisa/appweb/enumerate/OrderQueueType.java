package com.bisa.appweb.enumerate;
/**
 * 添加到redis和队列的类型
 * @author Administrator
 *
 */
public enum OrderQueueType {
	
	/**
	 * 24小时自动关闭
	 */
	AutoClose(24, "AutoClose"),
	/**
	 * 7天自动收货
	 */
	AutoReceive(7, "AutoReceive"),
	/**
	 * 15天自动评价
	 */
	AutoAppraise(30, "AutoAppraise"),
	/**
	 * 支付未发货
	 */
	PaidUnshipped(8, "PaidUnshipped");
	
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

    private OrderQueueType(int value, String name) {  
        this.setValue(value);  
        this.setName(name);  
    }  
    
    public static OrderQueueType getByValue(int value) {  
        for (OrderQueueType reportType : values()) {  
            if (reportType.getValue() == value) {  
                return reportType;  
            }  
        }  
        return null;  
    }  

}
