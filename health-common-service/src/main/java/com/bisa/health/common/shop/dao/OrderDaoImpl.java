package com.bisa.health.common.shop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.basic.entity.Pager;
import com.bisa.health.shop.model.Order;
import com.bisa.health.shop.model.OrderGoods;

@Repository
public class OrderDaoImpl extends BaseDao<Order> implements IOrderDao {

	@Override
	public boolean insert(Order order) {
		String sql = "INSERT INTO s_order(order_no, user_id,consignee ,phone ,detail_address ,tra_status, total_price, post_price, preferential_price, actual_payment, create_time) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		int result = super.addBySql(sql,
				new Object[] { order.getOrder_no(), order.getUser_id(), order.getConsignee(), order.getPhone(), order.getDetail_address(),
						order.getTra_status(), order.getTotal_price(), order.getPost_price(), order.getPreferential_price(),
						order.getActual_payment(), order.getCreate_time() });
		return result >= 1 ? true : false;
	}

	@Override
	public Order selectOrderByOrderNumber(String orderNumber) {
		String sql = "SELECT * FROM s_order WHERE order_no = ?";
		return super.queryObjectBySql(sql, new Object[] { orderNumber }, Order.class);
	}

	@Override
	public boolean insertOrderGoods(OrderGoods orderGoods) {
		String sql = "INSERT INTO s_order_goods(order_id ,goods_number_id, count, goods_price, preferential_price ) VALUES(?,?,?,?,?)";
		int result = super.addBySql(sql, new Object[] { orderGoods.getOrder_id(), orderGoods.getGoods_number_id(), orderGoods.getCount(),
				orderGoods.getGoods_price(), orderGoods.getPreferential_price() });
		return result >= 1 ? true : false;
	}

	@Override
	public List<Order> selectOrdersByUserId(int user_guid) {
		String sql = "SELECT * FROM s_order WHERE user_id = ?";
		return super.listBySql(sql, new Object[] { user_guid }, Order.class);
	}

	@Override
	public List<Order> selectOrdersReceiveGoodsByUserIdAndStatus(int user_guid) {
		String sql = "SELECT * FROM s_order WHERE user_id = ? AND (tra_status between 2 and 3)";
		return super.listBySql(sql, new Object[] { user_guid }, Order.class);
	}

	@Override
	public List<Order> selectOrdersByUserIdAndStatus(int user_guid, String status) {
		String sql = "SELECT * FROM s_order WHERE user_id = ? AND tra_status = ?";
		return super.listBySql(sql, new Object[] { user_guid, status }, Order.class);
	}

	@Override
	public boolean updateOrderStatus(String order_no) {
		String sql = "UPDATE s_order SET tra_status = 0 WHERE order_no = ?";
		int result = super.updateBySql(sql, new Object[] { order_no });
		return result >= 1 ? true : false;
	}

	@Override
	public boolean updateOrderStatusConfirmDelivery(String order_no) {
		String sql = "UPDATE s_order SET tra_status = 4,receive_goods_time = NOW() WHERE order_no = ?";
		int result = super.updateBySql(sql, new Object[] { order_no });
		return result >= 1 ? true : false;
	}

	@Override
	public Pager<Order> getPagerOrderByStatus(int user_guid, Integer tra_status) {
		String sql = "SELECT * FROM s_order WHERE user_id=? AND tra_status=?";
		return super.findBySql(sql, new Object[] { user_guid, tra_status }, Order.class, true);
	}

	@Override
	public Pager<Order> getPagerOrderByUserGuid(int user_guid) {
		String sql = "SELECT * FROM s_order WHERE user_id=?";
		return super.findBySql(sql, new Object[] { user_guid }, Order.class, true);
	}

	@Override
	public Pager<Order> getPagerOrderByStatus(int user_guid, int value, int value2) {
		String sql = "SELECT * FROM s_order WHERE user_id=? AND tra_status in (?,?)";
		return super.findBySql(sql, new Object[] { user_guid, value, value2 }, Order.class, true);
	}

}
