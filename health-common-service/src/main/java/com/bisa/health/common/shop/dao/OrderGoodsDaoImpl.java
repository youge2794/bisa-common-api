package com.bisa.health.common.shop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.shop.model.OrderGoods;
@Repository
public class OrderGoodsDaoImpl extends BaseDao<OrderGoods> implements IOrderGoodsDao {

	@Override
	public List<OrderGoods> selectOrderDetailByOrderId(Integer id) {
		String sql = "SELECT * FROM s_order_goods WHERE order_id = ?";
		return super.listBySql(sql, new Object[] { id }, OrderGoods.class);
	}

}
