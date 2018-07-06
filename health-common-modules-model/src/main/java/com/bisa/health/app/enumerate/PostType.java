package com.bisa.health.app.enumerate;


/**
 * 是否需要邮递枚举类
 * @author Administrator
 *
 */
public enum PostType {
	
	NoPost(0, "NoPost"),
	NeedPost(1, "NeedPost");
	
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

    private PostType(int value, String name) {  
        this.setValue(value);  
        this.setName(name);  
    }  
    
    public static PostType getByValue(int value) {  
        for (PostType reportType : values()) {  
            if (reportType.getValue() == value) {  
                return reportType;  
            }  
        }  
        return null;  
    }  

}
