package com.bisa.health.common.tool.service;

import com.qcloud.sms.SmsSingleSenderResult;

public interface ISmsService {

	/*
	 * 短信验证码
	 */
	public SmsSingleSenderResult verification_Code(String area_code,String phone,String veri_code);
	
	/*
	 * 推送报告生成提醒短信
	 */
	public SmsSingleSenderResult smsReminding(String area_code,String phone,String reportType,String healthUrl);
	
	/*
	 * 发送给紧急联系人的短信
	 */
	public SmsSingleSenderResult addcontact_messege(String contact_phone,String contact_name,String time,int tempLate,String timeZ);
	
	/*
	 * 发送密码短信
	 */
	public SmsSingleSenderResult sendPassword(String area_code,String phone,String passWord);
	
}
