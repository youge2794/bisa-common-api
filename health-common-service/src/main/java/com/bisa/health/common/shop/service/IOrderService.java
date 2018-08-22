package com.bisa.health.common.shop.service;

import java.util.List;

import com.bisa.health.basic.entity.Pager;
import com.bisa.health.shop.model.Order;
import com.bisa.health.shop.model.OrderGoods;

/**
 * 订单 操作
 * 
 * @author Administrator
 *
 */

public interface IOrderService {

	/**
	 * 创建一个待付款的新订单
	 * 
	 * @param order
	 */
	boolean insert(Order order);

	/**
	 * 根据商品 编号查询订单
	 * 
	 * @param orderNumber
	 * @return
	 */
	Order selectOrderByOrderNumber(String orderNumber);

	/**
	 * 保存 商品订单明细表
	 * 
	 * @param orderGoods
	 * @return
	 */
	boolean insertOrderGoods(OrderGoods orderGoods);

	/**
	 * 根据订单号，查询对应的一条订单的信息
	 * @param order_no
	 * @return
	 */
	Order selectOrderByOrderNo(String order_no);

	/**
	 * 取消订单
	 * @param order_no
	 */
	boolean updateOrderStatus(String order_no);

	/**
	 * 确认收货
	 * @param order_no
	 * @return
	 */
	boolean updateOrderStatusConfirmDelivery(String order_no);

	/**
	 * 查询用户所有订单，非分页
	 * @param user_guid
	 * @return
	 */
	List<Order> getListOrderByUserGuid(int user_guid);
	
	Pager<Order> getPagerOrderByStatus(int user_guid, Integer order_status);  //根据订单状态，查询订单分页

	Pager<Order> getPagerOrderByUserGuid(int user_guid);  //全部订单分页

	Pager<Order> getPagerOrderByStatus(int user_guid, int value, int value2);//待收货     前台传3   查待收货 (有2中情况,未发货  已发货)

}
