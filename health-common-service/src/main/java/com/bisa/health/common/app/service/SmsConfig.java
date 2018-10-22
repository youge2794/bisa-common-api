package com.bisa.health.common.app.service;

public class SmsConfig {
    // 悉心铃推送的appId和appKey
    public static final int ALARM_APPID = 1400154555;
    public static final String ALARM_APPKEY = "28912d8c870fc022829e118847783f94";
    
    //国内
    public static final int INTERNAL_ALARM_ERROR_TEMPLATE = 214847;
    public static final int INTERNAL_ALARM_XIXIN_TEMPLATE = 214846;
    public static final int INTERNAL_ALARM_SOS_TEMPLATE = 214829;
    //国际
    public static final int ABROAD_ALARM_ERROR_TEMPLATE = 214823;
    public static final int ABROAD_ALARM_XIXIN_TEMPLATE = 214820;
    public static final int ABROAD_ALARM_SOS_TEMPLATE = 214824;
    
    
    
    public static final int COMM_SMS_APPID = 1400152720;
    public static final String COMM_SMS_APPKEY = "1d2df2197cd04d6921d00124397017e9";
    
    

    //国内提示用户订单付款短信
    public static final int COMM_INTERNAL_ORDER_PAYMENT = 214859;
    //香港提示用户订单付款短信
    public static final int COMM_HONGKONG_ORDER_PAYMENT = 214861;
    //國外提示用户订单付款短信
    public static final int COMM_ABROAD_ORDER_PAYMENT = 214862;
    
    
    //港澳台报告通知
    public static final int COMM_HONGKONG_REOIRT_PAYMENT = 214868;
    public static final int COMM_INTERNAL_REOIRT_PAYMENT = 214856;
    
    
    //默认密码
    public static final int COMM_INTERNAL_PASSWORD_PAYMENT = 214852;
    public static final int COMM_HONGKONG_PASSWORD_PAYMENT = 214863;
    
    
	
    // 短信验证码的appId和appKey
    public static final int VALIDATE_APPID = 1400063030;
    public static final String VALIDATE_APPKEY = "f68b9efb9d3525a9f9c0b923c601b9f3";

    // 国内短信验证码发送模板
    public static final int VALIDATE_INTERNAL_VALIDATE_TEMPLATE = 78385;
    // 港澳台短信验证码发送模板
    public static final int VALIDATE_HONGKONG_VALIDATE_TEMPLATE = 214901;
    // 国际短信验证码发送模板
    public static final int VALIDATE_ABROAD_VALIDATE_TEMPLATE = 214904;
    


}
