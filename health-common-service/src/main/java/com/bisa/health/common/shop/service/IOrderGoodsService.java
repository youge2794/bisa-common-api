package com.bisa.health.common.shop.service;

import java.util.List;

import com.bisa.health.shop.model.OrderGoods;

public interface IOrderGoodsService {

	/**
	 * 根据订单的id 查下面的订单详情
	 * @param id
	 */
	List<OrderGoods> selectOrderGoodsListByOrderId(Integer id);

}
