package com.bisa.health.common.app.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.qcloud.sms.SmsSingleSender;
import com.qcloud.sms.SmsSingleSenderResult;

@Service
public class SmsServiceImpl implements ISmsService{

	//请根据实际 appid 和 appkey 进行开发，以下只作为演示 sdk 使用
	//appid,appkey,templId申请方式可参考接入指南 https://www.qcloud.com/document/product/382/3785#5-.E7.9F.AD.E4.BF.A1.E5.86.85.E5.AE.B9.E9.85.8D.E7.BD.AE
	
	// 悉心铃紧急联系人发送短信的appid
	int alarm_appid = SmsConfig.ALARM_APPID;
	String alarm_appkey = SmsConfig.ALARM_APPKEY;
	// 短信验证码的短信appid和appkey
	int validate_appid = SmsConfig.VALIDATE_APPID;
	String validate_appkey = SmsConfig.VALIDATE_APPKEY;
	
	// 国内短信验证码发送模板
    int internal_validate_template = SmsConfig.INTERNAL_VALIDATE_TEMPLATE;
	// 海外短信验证码发送模板
	int abroad_validate_template = SmsConfig.ABROAD_VALIDATE_TEMPLATE;
		
	// 国内紧急联系人主动求救发送短信模板
	int internal_contact_template = SmsConfig.INTERNAL_CONTACT_TEMPLATE;
	// 海外紧急联系人主动求救发送短信模板
	int abroad_contact_template = SmsConfig.ABROAD_CONTACT_TEMPLATE;
	
	// 国内紧急联系人心搏停止发送短信模板
	int internal_stop = SmsConfig.INTERNAL_STOP_TEMPLATE;
	// 国外紧急联系人心搏停止发送短信模板
	int abroad_stop = SmsConfig.ABROAD_STOP_TEMPLATE;
	
	// 国内紧急联系人心搏异常发送短信模板
	int internal_short_stop = SmsConfig.INTERNAL_SHORT_STOP_TEMPLATE;
    // 国外紧急联系人心搏异常发送短信模板
	int abroad_short_stop = SmsConfig.ABROAD_SHORT_STOP_TEMPLATE;
	
	// 国内报告推送短信模板
	int internal_report_template = SmsConfig.INTERNAL_REPORT_TEMPLATE;
	// 海外报告推送短信模板
	int abroad_report_template = SmsConfig.ABROAD_REPORT_TEMPLATE;
	
	// 密码发送短信
	int PASSWORD = SmsConfig.PASSWORD;
	
	/*
	 * 短信验证码
	 */
	public SmsSingleSenderResult verification_Code(String area_code, String phone, String veri_code) {
		try {
			//短信模板
    		int tmplId =0;
    		if(area_code == "86"){
    			tmplId = internal_validate_template;
    		}else{
    			tmplId = abroad_validate_template;
    		}
    		 //初始化单发
	    	SmsSingleSender singleSender = new SmsSingleSender(validate_appid, validate_appkey);
	    	SmsSingleSenderResult singleSenderResult;
	    	 //指定模板单发
	    	 //假设短信模板 id 为 1，模板内容为：测试短信，{1}，{2}，{3}，上学。
	    	ArrayList params = new ArrayList();
	    	params.add(veri_code);
	    	params.add(5);
	    	singleSenderResult = singleSender.sendWithParam(area_code, phone, tmplId, params, "", "", "");
	    	return singleSenderResult;
    	} catch (Exception e) {
    		return null;
		}
	}
	
	/*
	 * 发送给紧急联系人的短信
	 */
	public SmsSingleSenderResult addcontact_messege(String contact_phone, String contact_name,String time,int tempLate,String timeZ) {
		SmsSingleSenderResult singleSenderResult = null;
	    try {	
	    		String[] phone = contact_phone.split("-");
	    		//短信模板
	    		int tmplId =0;
	    		if(phone.length<2){
	    			return null;
	    		}
	    		
	    		if(phone[0]=="86"){
	    			switch(tempLate){
	    			case 1 : 
	    				tmplId = internal_contact_template;
	    				break;
	    			case 2 : 
	    				tmplId = internal_short_stop;
	    				break;
	    			case 3 : 
	    				tmplId = internal_stop;
	    				break;
	    			}
	    			
	    		}else{
	    			switch(tempLate){
	    			case 1 : 
	    				tmplId = abroad_contact_template;
	    				break;
	    			case 2 : 
	    				tmplId = abroad_short_stop;
	    				break;
	    			case 3 : 
	    				tmplId = abroad_stop;
	    				break;
	    			}
	    		}
	    		
	    		TimeZone timeZone = TimeZone.getTimeZone(timeZ);
	    		Calendar calendar = Calendar.getInstance(Locale.getDefault());
	    		calendar.setTimeZone(timeZone);
	    		calendar.setTimeInMillis(Long.valueOf(time));
	    		int zoneOffset = calendar.get(Calendar.ZONE_OFFSET);
	    		int dstOffset = calendar.get(Calendar.DST_OFFSET);
	    		calendar.add(Calendar.MILLISECOND, +(zoneOffset + dstOffset));
	    		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    		 //初始化单发
		    	SmsSingleSender singleSender = new SmsSingleSender(alarm_appid, alarm_appkey);
		    	 //指定模板单发
		    	 //假设短信模板 id 为 1，模板内容为：测试短信，{1}，{2}，{3}，上学。
		    	ArrayList<String> params = new ArrayList<String>();
		    	params.add(contact_name);
		    	params.add(df.format(calendar.getTime()));
		    	singleSenderResult = singleSender.sendWithParam(phone[0], phone[1], tmplId, params, "", "", "");
		    	return singleSenderResult;
	    	} catch (Exception e) {
	    		return null;
			}
	}

	/*
	 * 发送报告生成短信
	 * 
	 */
	public SmsSingleSenderResult smsReminding(String area_code,String phone,String reportType, String healthUrl) {
		try {
			//短信模板
    		int tmplId =0;
    		if(area_code == "86"){
    			//国内短信
    			tmplId = internal_report_template; 
    		}else{
    			//国外短信
    			tmplId = abroad_report_template;
    		}
    		 //初始化单发
	    	SmsSingleSender singleSender = new SmsSingleSender(alarm_appid, alarm_appkey);
	    	SmsSingleSenderResult singleSenderResult;
	    	 // 指定模板单发
	    	 // 短信内容：尊敬的用户，您好！您的{1}心电报告已生成，请在悉心APP或者前往{2}查看报告。如非本人操作，请忽略本短信。
	    	ArrayList<String> params = new ArrayList<String>();
	    	params.add(reportType);
	    	params.add(healthUrl);
	    	singleSenderResult = singleSender.sendWithParam(area_code, phone, tmplId, params, "", "", "");
	    	return singleSenderResult;
    	} catch (Exception e) {
    		return null;
		}
	}

	/**
	 * 发送密码
	 */
	public SmsSingleSenderResult sendPassword(String area_code, String phone, String passWord) {
		try {
			//短信模板
    		int tmplId =0;
    		if(area_code == "86"){
    			//国内短信
    			tmplId = PASSWORD; 
    		}else{
    			//国外短信
    			tmplId = PASSWORD;
    		}
    		 //初始化单发
	    	SmsSingleSender singleSender = new SmsSingleSender(alarm_appid, alarm_appkey);
	    	SmsSingleSenderResult singleSenderResult;
	    	ArrayList<String> params = new ArrayList<String>();
	    	params.add(passWord);
	    	singleSenderResult = singleSender.sendWithParam(area_code, phone, tmplId, params, "", "", "");
	    	return singleSenderResult;
    	} catch (Exception e) {
    		return null;
		}
	}
}
