package com.bisa.health.common.email.utils;

import java.util.Date;

/**
 * 发送邮件的html模板
 * 需要做国际化！！！
 * @author Administrator
 */

public class EmailTemplate {
	private static final String commit_order_subject="悉心康健-提交訂單";
	private static final String confirm_order_subject = "悉心康健-訂單確認";
	private static final String cancel_order_subject = "悉心康健-訂單取消";
	private static final String shipping_order_subject = "悉心康健-訂單發貨";
	private static final String timeout_order_subject = "悉心康健-訂單取消";
	
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
				+ "<font color=\"#b0a4ae\" style=\"float: right;\">訪問碧沙商城</font></div>"
				+ "<div align=" + "center" + "style=\"width: 600px; min-height: 500px; background-color: rgb(255, 255, 255);\">"
				+ "<div align=\"left\" style=\"width: 500px; min-height: 500px; background-color: rgb(255, 255, 255);\"><br> <br> <span style=" + "font-size: 22px;" 
				+ "> <b>尊敬的" + nickName + "</b></span> <br><br><div style=\" line-height: 1.75; white-space: pre-wrap;\">"
                + "<div style=\"line-height: 1.75;\">"
                + state+"</div></div>"
				+ "<div style=\"line-height: 1.75; white-space: pre-wrap;\"><br></div>"
				+ "您的訂單資訊<br> "
				+ "碧沙商城訂單號碼：" + orderNumber + "<br>"
				+ "訂單日期：" + date
				+ "<br>訂單狀態詳情鏈接<br> "
				+ "<a href="+href+">"+href+"</a>（點開跳商城登陸後顯示訂單詳情）<br>"
				+ "<br> 如有任何疑問，請發送電子郵件或致電香港客戶服務團隊<br> "
				+ "客戶服務郵箱："
				+ "bisapecg@bisa.com.hk</a><br>客戶服務電話：+0755-2688 0962<br> "
				+ "客戶服務傳真：+0755-2681 0833<br>"
				+ "碧莎香港辦事處：碧莎科技(香港)有限司香港新界葵湧健康街18號恒亞中心315室<br>"
				+ "刅倳處棴務溡簡：咯啉媙菭摽痽溡簡仩吘8:00臸芐吘6:30 + 8（淍①臸淍伍） </div> </div>"
				+ "<div align=\"left\" style=\"width: 600px; margin-top: 2px; min-height: 120px; background-color: rgb(255, 255, 255);\" >" 
				+ "<div align=\"left\" style=\"width: 500px; min-height: 120px; background-color: rgb(255, 255, 255);\"><br> "
				+ "<span style=\"color: rgb(176, 176, 176); font-size: 12px;\">"
				+ "本郵件由碧莎系統自動發出，請勿直接回復！"
				+ "<br>因碧莎商城最終頁面的產品或服務的信息（包括但不限於產品型號、價格、促銷等）可能會發生變動，請以您點擊本郵件中的商品鏈接到碧莎商城最終頁面上顯示的該商品或服務的信息為準。"
				+ "</span></div></div> <br> <span style=\"color: rgb(157, 164, 174); font-size: 10px;"
				+ ">Copyright©2015 碧莎科技有限公司 版權所有</span></div>";
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
		}else if (emailType ==4){
			return commit_order_subject;
		}else if (emailType ==5){
			 return timeout_order_subject;
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
			return "感謝您訂購碧莎產品，您的訂單已支付，您可以登入碧莎商城賬戶或點擊下面訂單資訊鏈接查看訂單資訊。";
		}else if(emailType == 2) {
			return "感謝您訂購碧莎產品，您的訂單已發貨，請關註物流信息，您可以登入碧莎商城賬戶或點擊下面訂單資訊鏈接查看訂單資訊。";
		}else if(emailType == 3) {
			return "感謝您訂購碧莎產品，您的訂單已取消，取消原因：（主動取消訂單/缺貨或者無法配送/物流到付賬號有誤），您可以登入碧莎商城賬戶或點擊下面訂單資訊鏈接查看訂單資訊。";
		}else if (emailType==4){
			return "感謝您訂購碧莎產品，您的訂單已提交，請在12小時內支付，您可以登入碧莎商城賬戶或點擊下面訂單資訊鏈接查看訂單資訊。";
		}else if (emailType==5){
			return "感謝您訂購碧莎產品，您的訂單在12小時內未完成付款，系統已自動取消，您可以登入碧莎商城帳護或點擊下面訂單資訊鏈接查看訂單資訊。";
		}
		return "";
	}

}
