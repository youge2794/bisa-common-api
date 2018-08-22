package com.bisa.health.common.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bisa.health.common.shop.dao.IOrderGoodsDao;
import com.bisa.health.shop.model.OrderGoods;

@Service
public class OrderGoodsServiceImpl implements IOrderGoodsService {

	@Autowired
	private IOrderGoodsDao orderGoodsDao;

	@Override
	@Cacheable(value="spring-defaultCache",key="'order_goods:'+#orderId")
	public List<OrderGoods> selectOrderGoodsListByOrderId(Integer orderId) {
		List<OrderGoods> list = orderGoodsDao.selectOrderDetailByOrderId(orderId);
		return list;
	}

}
