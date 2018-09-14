package com.bisa.health.common.email.utils;

/**
 * 这是 一个邮件发送的组件
 * 
 * @author Administrator
 *
 */
public class SendMailUtils {

	private static SendMailUtils instance;

	private SendMailUtils() {
	}

	public static synchronized SendMailUtils getInstance() {
		if (instance == null) {
			instance = new SendMailUtils();
		}
		return instance;
	}

	/**
	 * 发送收件人邮箱和验证码，发送验证码邮件
	 * 
	 * @param username
	 * @param code
	 * @return
	 */
	public boolean sendCodeByMail(String username, String code) {
		String subject = "悉心医疗验证信息";

		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, username, subject, MailConfig.sentVarifyCodeMail(code));
		if (!result) {
			return false;
		}
		return true;
	}

	public boolean sendUrlByMail(String username, String varify_url) {
		String subject = "悉心医疗绑定账号";
		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, username, subject, MailConfig.sentVarifyUrlMail(varify_url));
		if (!result) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param mail联系人邮箱
	 * @param time警报发生时间2018/1/16
	 *            16:07:12
	 * @return
	 */
	public boolean sendAlarmByMail(String name, String mail, String time) {
		String subject = "悉心医疗悉心铃邮件";
		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, mail, subject, MailConfig.sentAlarmContentByMail(name, time));
		if (!result) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param mail联系人邮箱
	 * @param time警报发生时间2018/1/16
	 *            16:07:12
	 * @return
	 */
	public boolean sendAlarmByContent(String mail, String content) {
		String subject = "悉心康健——悉心铃邮件";
		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, mail, subject, content);
		if (!result) {
			return false;
		}
		return true;
	}

	public boolean sendPassword(String username, String six_password) {
		String subject = "悉心康健——账户信息";

		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, username, subject, MailConfig.sentPasswordMail(six_password));
		if (!result) {
			return false;
		}
		return true;
	}
	
	/**
	 * 自由邮件内容格式，发送邮件
	 * @param subject	邮件主题
	 * @param content  邮件内容
	 * @param email 收件地址
	 * @return
	 */
	public boolean sendEmailFreeContent(String subject, String content, String email){
		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, email, subject,content);
		if (!result) {
			return false;
		}
		return true;
	}
	
}
