package com.bisa.hkshop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bisa.hkshop.model.BuyerItem;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 购物车
 * 未登录保存到cookie
 * 已登录保存到数据库和redis
 * @author Administrator
 *
 */
public class BuyerCart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8825319520178180326L;
	
	/**
	 * 商品结果集
	 */
	private List<BuyerItem> items = new ArrayList<BuyerItem>();
	

	public List<BuyerItem> getItems() {
		return items;
	}

	public void setItems(List<BuyerItem> items) {
		this.items = items;
	}

	/**
	 * 添加购物车
	 * @param item
	 */
	public void addItem(BuyerItem item){
		//是否同款
		if(items.contains(item))
		{
			//追加数量
			for(BuyerItem buyerItem : items){
				if(buyerItem.equals(item)){
					buyerItem.setAmount(item.getAmount() + buyerItem.getAmount());
				}
			}
		}
	}
	
	/**
	 * 计算商品数量
	 * @return
	 */
	@JsonIgnore
	public Integer getProductAmount(){
		Integer result = 0;
		for(BuyerItem buyerItem : items){
			result += buyerItem.getAmount();
		}
		return result;
	}
	
	/**
	 * 购物车商品总价
	 * @return
	 */
	@JsonIgnore
	public Double getProductPrice(){
		Double result = 0.00;
		for(BuyerItem buyerItem : items){
			result += buyerItem.getAmount() * buyerItem.getPrice();
		}
		return result;
	}
	
	/**
	 * 获得需要邮递商品数量
	 * @return
	 */
	@JsonIgnore
	public Integer getPostAmount(){
		Integer result = 0;
		for(BuyerItem buyerItem : items){
			if(buyerItem.getNeed_post() == 1){
				result += 1;
			}
		}
		return result;
	}
	
	/**
	 * 运费
	 * @return
	 */
	@JsonIgnore
	public Double getPostFee(){
		Double result = 0.00;
		//低于免邮额度且需要邮递
		if(getProductPrice() < 350.00 && getPostAmount() != 0){
			result = 30.00;
		}
		return result;
	}
	
	/**
	 * 购物车总价
	 * @return
	 */
	@JsonIgnore
	public Double getTotalPrice(){
		return getProductPrice() + getPostFee();
	}
	
}
