package com.bisa.health.common.email.utils;
/**
 * 编辑封装邮件内容的类
 * @author Administrator
 *
 */
public class MailContent {
	
	public static final String FROM = "v1.bisa.email@bisahealth.com";
	
	public static final String PASSWORD = "BISAhk2017";

	public static final String ALIDM_SMTP_HOST = "smtpdm-ap-southeast-1.aliyun.com";//阿里国际版

	public static final String ALIDM_SMTP_PORT =  "80";
	
	/**
	 * 编辑发送验证码的邮件
	 * @param code 验证码
	 * @return
	 */
	public static String sentVarifyCodeMail(String code){
		String content = "尊敬的悉心用户，您好！\n您的验证码为：" + code + "\n" + "请在有效时间内输入验证码进行验证。\n本邮件由系统自动发出，切勿直接回复！\n悉心呵护您的健康！";
		return content;
	}

	public static String sentVarifyUrlMail(String varify_url) {
		String content = "尊敬的悉心用户，您好！\n您正在执行绑定邮箱操作，请点击以下这个链接：\n" +"<a href='"+varify_url+"'>验证邮箱</a>" + "\n" + "请在有效时间内点击链接进行邮箱绑定。\n本邮件由系统自动发出，切勿直接回复！\n悉心呵护您的健康！";
		return content;
	}
	
	public static String sentAlarmContentByMail(String name,String time){
		String alarm_content = "尊敬的悉心用户监护人["+name+"]，您好！\n悉心心电仪使用者呼叫了紧急求助，求助发生时间为：(北京时间)"+time+"。\n请及时和使用者通话联系，确认使用者的健康状态。\n"
				+ "\n碧沙康健团队";
		return alarm_content;
	}

	public static String sentPasswordMail(String six_password) {
		String content = "尊敬的悉心用户，您好！\n您账号当前默认密码为[" + six_password + "]。\n" + "\n本邮件由系统自动发出，切勿直接回复！\n悉心呵护您的健康！";
		return content;
	}

}
