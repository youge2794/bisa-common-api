package com.bisa.health.common.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.health.basic.entity.Pager;
import com.bisa.health.common.shop.dao.IOrderDao;
import com.bisa.health.shop.model.Order;
import com.bisa.health.shop.model.OrderGoods;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderDao orderDao;
	
	@Override
	public boolean updateOrderStatusConfirmDelivery(String order_no) {
		return orderDao.updateOrderStatusConfirmDelivery(order_no);
	}

	@Override
	public boolean updateOrderStatus(String order_no) {
		return orderDao.updateOrderStatus(order_no);
	}

	@Override
	public boolean insert(Order order) {
		return orderDao.insert(order);
	}

	@Override
	public Order selectOrderByOrderNumber(String orderNumber) {
		Order order = orderDao.selectOrderByOrderNumber(orderNumber);
		return order;
	}

	@Override
	public boolean insertOrderGoods(OrderGoods orderGoods) {
		return orderDao.insertOrderGoods(orderGoods);
	}

	@Override
	public Order selectOrderByOrderNo(String order_no) {
		Order order = orderDao.selectOrderByOrderNumber(order_no);
		return order;
	}

	@Override
	public List<Order> getListOrderByUserGuid(int user_guid) {
		return orderDao.selectOrdersByUserId(user_guid);
	}

	@Override
	public Pager<Order> getPagerOrderByStatus(int user_guid, Integer order_status) {
		return orderDao.getPagerOrderByStatus(user_guid, order_status);
	}

	@Override
	public Pager<Order> getPagerOrderByUserGuid(int user_guid) {
		return orderDao.getPagerOrderByUserGuid(user_guid);
	}

	@Override
	public Pager<Order> getPagerOrderByStatus(int user_guid, int value, int value2) {
		return orderDao.getPagerOrderByStatus(user_guid, value, value2);
	}
	
}
