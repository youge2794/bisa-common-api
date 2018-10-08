package com.bisa.health.common.email.utils;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

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
	
	private static final String varify_subject = "悉心医疗验证信息";
	private static final String bind_subject = "悉心医疗绑定账号";
	private static final String alaram_subject = "悉心医疗悉心铃邮件";
	private static final String account_subject = "悉心康健——账户安全";

	/**
	 * 发送收件人邮箱和验证码，发送验证码邮件
	 * 
	 * @param username
	 * @param code
	 * @return
	 */
	public boolean sendCodeByMail(String username, String code) {

		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, username, varify_subject, MailConfig.sentVarifyCodeMail(code));
		if (!result) {
			return false;
		}
		return true;
	}

	public boolean sendUrlByMail(String username, String varify_url) {
		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, username, bind_subject, MailConfig.sentVarifyUrlMail(varify_url));
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
		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, mail, alaram_subject, MailConfig.sentAlarmContentByMail(name, time));
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
		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, mail, alaram_subject, content);
		if (!result) {
			return false;
		}
		return true;
	}

	public boolean sendPassword(String username, String six_password) {

		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, username, account_subject, MailConfig.sentPasswordMail(six_password));
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
	public boolean sendEmailFreeContent(String subject, String email, String content){
		MailUtil mu = new MailUtil();
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, email, subject,content);
		if (!result) {
			return false;
		}
		return true;
	}
	
	/**
	 * 发送账单邮件模板
	 * @param subject 主体
	 * @param email	收件地址
	 * @param nickName	用户昵称，默认“亲爱的悉心康健用户”
	 * @param billMessage	账单提示消息
	 * @param orderNo	订单编号
	 * @param orderTime		订单时间
	 * @param linkHref	订单详情链接
	 * @param orderStatus 邮件类型(1-确认订单/2-订单发货/3-取消订单)
	 * @return
	 */
	public boolean sendBillEmail(String email, String nickName, String orderNo, Date orderTime, String linkHref, int emailType){
		MailUtil mu = new MailUtil();
		if(StringUtils.isEmpty(nickName)) {
			nickName = "悉心康健用户";
		}
		String subject = EmailTemplate.getInstance().getEmailSubject(emailType);
		String billMessage = EmailTemplate.getInstance().getBillMessage(emailType);
		String content = EmailTemplate.getInstance().orderEmailTemplate(nickName, billMessage, orderNo, orderTime, linkHref);
		
		boolean result = mu.sendMailBySSL(MailConfig.ALIDM_SMTP_HOST, MailConfig.ALIDM_SMTP_PORT, MailConfig.FROM,
				MailConfig.PASSWORD, email, subject,content);
		if (!result) {
			return false;
		}
		return true;
	}
	
}
