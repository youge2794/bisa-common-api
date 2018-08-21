package com.bisa.health.common.email.utils;

/**
 * 这是 一个邮件发送的组件
 * @author Administrator
 *
 */
public class SendMailUtils {
	
	
	 private static SendMailUtils instance;
	    private SendMailUtils() {}
	    public static synchronized SendMailUtils getInstance() {
	        if (instance == null) {
	            instance = new SendMailUtils();
	        }
	        return instance;
	    }
	/**
	 * 发送收件人邮箱和验证码，发送验证码邮件
	 * @param username
	 * @param code
	 * @return
	 */
	public boolean sendCodeByMail(String username,String code){
		String subject = "悉心医疗验证信息";
		
		MailUtil mu = new MailUtil(); 
		boolean result = mu.sendMailBySSL(MailContent.ALIDM_SMTP_HOST,MailContent.ALIDM_SMTP_PORT,MailContent.FROM,MailContent.PASSWORD, username,subject,MailContent.sentVarifyCodeMail(code));
		if (!result)
		{ 
		  return false; 
		 }
		return true;
	}

	public boolean sendUrlByMail(String username, String varify_url) {
		String subject = "悉心医疗绑定账号";
		MailUtil mu = new MailUtil(); 
		boolean result = mu.sendMailBySSL(MailContent.ALIDM_SMTP_HOST,MailContent.ALIDM_SMTP_PORT,MailContent.FROM,MailContent.PASSWORD, username,subject,MailContent.sentVarifyUrlMail(varify_url));
		if (!result)
		{ 
		  return false; 
		 }
		return true;
	}
	/**
	 * 
	 * @param mail联系人邮箱
	 * @param time警报发生时间2018/1/16 16:07:12
	 * @return
	 */
	public boolean sendAlarmByMail(String name,String mail,String time){
		String subject = "悉心医疗悉心铃邮件";
		MailUtil mu = new MailUtil(); 
		boolean result = mu.sendMailBySSL(MailContent.ALIDM_SMTP_HOST,MailContent.ALIDM_SMTP_PORT,MailContent.FROM,MailContent.PASSWORD, mail,subject,MailContent.sentAlarmContentByMail(name,time));
		if (!result)
		{ 
		  return false; 
		 }
		return true;
	}
	
	/**
	 * 
	 * @param mail联系人邮箱
	 * @param time警报发生时间2018/1/16 16:07:12
	 * @return
	 */
	public boolean sendAlarmByContent(String mail,String content){
		String subject = "悉心康健——悉心铃邮件";
		MailUtil mu = new MailUtil(); 
		boolean result = mu.sendMailBySSL(MailContent.ALIDM_SMTP_HOST,MailContent.ALIDM_SMTP_PORT,MailContent.FROM,MailContent.PASSWORD, mail,subject,content);
		if (!result)
		{ 
		  return false; 
		 }
		return true;
	}
	
	public boolean sendPassword(String username, String six_password) {
		String subject = "悉心康健——账户信息";
		
		MailUtil mu = new MailUtil(); 
		boolean result = mu.sendMailBySSL(MailContent.ALIDM_SMTP_HOST,MailContent.ALIDM_SMTP_PORT,MailContent.FROM,MailContent.PASSWORD, username,subject,MailContent.sentPasswordMail(six_password));
		if (!result)
		{ 
		  return false; 
		 }
		return true;
	}
	
}
