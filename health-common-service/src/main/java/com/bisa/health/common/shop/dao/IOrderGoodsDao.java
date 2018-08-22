package com.bisa.health.common.shop.dao;

import java.util.List;

import com.bisa.health.shop.model.OrderGoods;

public interface IOrderGoodsDao {
	
	List<OrderGoods> selectOrderDetailByOrderId(Integer id);//根据订单的id，获取下面的所有订单的明细
	
}
