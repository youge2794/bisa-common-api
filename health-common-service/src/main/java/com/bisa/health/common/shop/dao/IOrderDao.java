package com.bisa.health.common.shop.dao;

import java.util.List;

import com.bisa.health.basic.entity.Pager;
import com.bisa.health.shop.model.Order;
import com.bisa.health.shop.model.OrderGoods;

public interface IOrderDao {

	boolean insert(Order order);//创建一个订单

	Order selectOrderByOrderNumber(String orderNumber);//根据商品 编号查询订单

	boolean insertOrderGoods(OrderGoods orderGoods);//保存 商品订单明细表

	List<Order> selectOrdersByUserId(int user_guid);//获取该 用户下的所有订单详细

	List<Order> selectOrdersReceiveGoodsByUserIdAndStatus(int user_guid);//查待收货的订单

	List<Order> selectOrdersByUserIdAndStatus(int user_guid, String status);//获取该 用户下的所有订单详细(根据状态查询)

	boolean updateOrderStatus(String order_no);//取消订单

	boolean updateOrderStatusConfirmDelivery(String order_no);//收货

	Pager<Order> getPagerOrderByStatus(int user_guid, Integer order_status);  //根据订单状态，查询订单分页

	Pager<Order> getPagerOrderByUserGuid(int user_guid);  //全部订单分页

	Pager<Order> getPagerOrderByStatus(int user_guid, int value, int value2);//待收货     前台传3   查待收货 (有2中情况,未发货  已发货)

}
