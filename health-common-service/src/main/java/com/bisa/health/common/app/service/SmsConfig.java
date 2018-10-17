package com.bisa.health.common.app.service;

public class SmsConfig {
    // 悉心铃推送的appId和appKey
    public static final int ALARM_APPID = 1400038733;
    public static final String ALARM_APPKEY = "40fe4d68fb40f54a38e5d1a0e485ef10";
    // 短信验证码的appId和appKey
    public static final int VALIDATE_APPID = 1400063030;
    public static final String VALIDATE_APPKEY = "f68b9efb9d3525a9f9c0b923c601b9f3";

    // 国内短信验证码发送模板
    public static final int INTERNAL_VALIDATE_TEMPLATE = 78385;
    // 海外短信验证码发送模板
    public static final int ABROAD_VALIDATE_TEMPLATE = 78387;

    // 国内紧急联系人发送短信模板
    public static final int INTERNAL_CONTACT_TEMPLATE = 75499;
    // 海外紧急联系人发送短信模板
    public static final int ABROAD_CONTACT_TEMPLATE = 75519;

    // 国内紧急联系人心搏停止发送短信模板
    public static final int INTERNAL_STOP_TEMPLATE = 80591;
    // 国外紧急联系人心搏停止发送短信模板
    public static final int ABROAD_STOP_TEMPLATE = 80591;

    // 国内紧急联系人心搏异常发送短信模板
    public static final int INTERNAL_SHORT_STOP_TEMPLATE = 80590;
    // 国外紧急联系人心搏异常发送短信模板
    public static final int ABROAD_SHORT_STOP_TEMPLATE = 80590;

    // 国内报告推送短信模板
    public static final int INTERNAL_REPORT_TEMPLATE = 74056;
    // 海外报告推送短信模板
    public static final int ABROAD_REPORT_TEMPLATE = 74067;

    // 密码发送短信模板
    public static final int PASSWORD = 99285;

    //国内提示用户订单付款短信
    public static final int INTERNAL_ORDER_PAYMENT = 211674;
    //香港提示用户订单付款短信
    public static final int Hongkong_ORDER_PAYMENT = 211676;
    //國外提示用户订单付款短信
    public static final int ABROAD_ORDER_PAYMENT = 211677;

}
