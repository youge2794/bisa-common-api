package com.bisa.health.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 服务激活卡
 * 后期可扩展成其他卡劵
 * @author Administrator
 *
 */
@Entity
@Table(name="s_service_card",indexes={@Index(columnList="card_number")})
public class ServiceCard {
	
	private int id;
	private String cardName; //卡名称
	private String cardNumber; //BHA+年月日+递增+CN，共20位，如"BISA20180810100000CN"
	private String activeCode; //激活码8位  随机数字
	private Integer classifyId; //卡类型（次数型；时限型）
	private String goodsNumber; //商品编号（24小时报告；悉心铃）
	private int count; //（面值）次数/月份
	private int cardStatus; //是否使用；0-未使用；1-已使用
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="card_number")
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Column(name="active_code")
	public String getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}
	@Column(name="card_status")
	public int getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(int cardStatus) {
		this.cardStatus = cardStatus;
	}
	
	@Column(name="count")
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Column(name="card_name")
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	@Column(name="classify_id")
	public Integer getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}
	
	@Column(name="goods_number")
	public String getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	
	public ServiceCard() {
		super();
	}
	public ServiceCard(int id, String cardName, String cardNumber, String activeCode, Integer classifyId,
			String goodsNumber, int count, int cardStatus) {
		super();
		this.id = id;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.activeCode = activeCode;
		this.classifyId = classifyId;
		this.goodsNumber = goodsNumber;
		this.count = count;
		this.cardStatus = cardStatus;
	}
	@Override
	public String toString() {
		return "ServiceCard [id=" + id + ", cardName=" + cardName + ", cardNumber=" + cardNumber + ", activeCode="
				+ activeCode + ", classifyId=" + classifyId + ", goodsNumber=" + goodsNumber + ", count=" + count
				+ ", cardStatus=" + cardStatus + "]";
	}
	
}
