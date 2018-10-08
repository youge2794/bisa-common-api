package com.bisa.health.common.email.utils;

import java.util.Date;

/**
 * 发送邮件的html模板
 * 需要做国际化！！！
 * @author Administrator
 */

public class EmailTemplate {
	
	private static final String confirm_order_subject = "悉心康健-订单确认";
	private static final String cancel_order_subject = "悉心康健-订单取消";
	private static final String shipping_order_subject = "悉心康健-订单发货";
	
	private static EmailTemplate instance;

	private EmailTemplate() {
	}

	public static synchronized EmailTemplate getInstance() {
		if (instance == null) {
			instance = new EmailTemplate();
		}
		return instance;
	}
	
	/**
	 * 发送邮件的html模板
	 * @param nickName 用户名
	 * @param state 
	 * @param orderNumber 订单号
	 * @param date 订单时间
	 * @param href
	 * @return
	 */
	public String orderEmailTemplate(String nickName, String state, String orderNumber,Date date,String href){
		String html = 
				 "<div><br><br>" 
				+ "<img style=\"border: currentColor; width: 100px; min-height: auto; float: left;\"> " 
				+ "<font color=\"#b0a4ae\" style=\"float: right;\">访问碧沙商城</font></div>"
				+ "<div align=" + "center" + "style=\"width: 600px; min-height: 500px; background-color: rgb(255, 255, 255);\">"
				+ "<div align=\"left\" style=\"width: 500px; min-height: 500px; background-color: rgb(255, 255, 255);\"><br> <br> <span style=" + "font-size: 22px;" 
				+ "> <b>尊敬的" + nickName + "</b></span> <br><br><div style=\" line-height: 1.75; white-space: pre-wrap;\">"
                + "<div style=\"line-height: 1.75;\">"
                + state+"</div></div>"
				+ "<div style=\"line-height: 1.75; white-space: pre-wrap;\"><br></div>"
				+ "您的订单资讯<br> "
				+ "碧沙商城订单号码：" + orderNumber + "<br>"
				+ "订单日期：" + date 
				+ "<br>订单状态详情链接<br> "
				+ "<a href="+href+">"+href+"</a>（点开跳商城登陆后显示订单详情）<br>"
				+ "<br> 如有任何疑问，请发送电子邮件或致电香港客户服务团队<br> "
				+ "客户服务邮箱："
				+ "xx@xx.com</a><br>客户服务电话：+123456789<br> "
				+ "客户服务传真：+123456789<br>"
				+ "碧莎香港办事处：碧莎科技(香港)有限司香港新界葵涌健康街18號恒亞中心315室<br>"
				+ "办事处服务时间：格林威治标准时间上午8:00至下午6:30 + 8（周一至周五） </div> </div>"
				+ "<div align=\"left\" style=\"width: 600px; margin-top: 2px; min-height: 120px; background-color: rgb(255, 255, 255);\" >" 
				+ "<div align=\"left\" style=\"width: 500px; min-height: 120px; background-color: rgb(255, 255, 255);\"><br> "
				+ "<span style=\"color: rgb(176, 176, 176); font-size: 12px;\">"
				+ "本邮件由碧莎系统自动发出，请勿直接回复！"
				+ "<br>因碧莎商城最终页面的产品或服务的信息（包括但不限于产品型号、价格、促销等）可能会发生变动，请以您点击本邮件中的商品链接到碧莎商城最终页面上显示的该商品或服务的信息为准。"
				+ "</span></div></div> <br> <span style=\"color: rgb(157, 164, 174); font-size: 10px;"
				+ ">Copyright©2015 碧莎科技有限公司 版权所有</span></div>";
		return html;
	}

	/**
	 * 根据邮件类型获取主题
	 * @param emailType
	 * @return
	 */
	public String getEmailSubject(int emailType) {
		if(emailType == 1) {
			return confirm_order_subject;
		}else if(emailType == 2) {
			return shipping_order_subject;
		}else if(emailType == 3) {
			return cancel_order_subject;
		}
		return "";
	}

	/**
	 * 根据邮件类型获取邮件提醒内容
	 * @param emailType
	 * @return
	 */
	public String getBillMessage(int emailType) {
		if(emailType == 1) {
			return "感谢您订购碧莎产品，您的订单已支付，您可以登入碧莎商城账户或点击下面订单资讯链接查看订单资讯。";
		}else if(emailType == 2) {
			return "感谢您订购碧莎产品，您的订单已发货，请关注物流信息，您可以登入碧莎商城账户或点击下面订单资讯链接查看订单资讯。";
		}else if(emailType == 3) {
			return "感谢您订购碧莎产品，您的订单已取消，取消原因：（主动取消订单/缺货或者无法配送/物流到付账号有误），您可以登入碧莎商城账户或点击下面订单资讯链接查看订单资讯。";
		}
		return "";
	}

}
