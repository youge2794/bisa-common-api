package com.bisa.health.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_shop_cart")
public class GoodsShopcar {
	private Integer id;
	private Integer userGuid;		//用户唯一编码
	private Integer classifyId;  //商品编号
	private Integer count;			// 商品的数量
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="user_guid")
	public Integer getUserGuid() {
		return userGuid;
	}
	public void setUserGuid(Integer userGuid) {
		this.userGuid = userGuid;
	}
	@Column(name="classify_id")
	public Integer getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public GoodsShopcar() {
		super();
	}
	public GoodsShopcar(Integer id, Integer userGuid, Integer classifyId, Integer count) {
		super();
		this.id = id;
		this.userGuid = userGuid;
		this.classifyId = classifyId;
		this.count = count;
	}
	@Override
	public String toString() {
		return "GoodsShopcar [id=" + id + ", userGuid=" + userGuid + ", classifyId=" + classifyId + ", count=" + count
				+ "]";
	}
	
}