package com.bisa.health.common.shop.dao;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.shop.model.Goods;
@Repository
public class GoodsDaoImpl extends BaseDao<Goods> implements IGoodsDao {
	
	//id, classify_id, goods_name, goods_number, title, description, goods_price, store_number, need_post, putaway_time, soldout_time, sales_number, appraise_number
	public Goods selectGoodsByGoodsNumber(String goods_number) {
		String sql = "SELECT id, classify_id, goods_name, goods_number, title, description,"
				+ " goods_price, store_number, need_post, putaway_time, soldout_time, sales_number, appraise_number"
				+ " FROM s_goods WHERE goods_number = ?";
		return super.queryObjectBySql(sql, new Object[] { goods_number }, Goods.class);
	}

	@Override
	public Goods selectGoodsByClassifyId(Integer classifyId) {
		String sql = "SELECT id, classify_id, goods_name, goods_number, title, description,"
				+ " goods_price, store_number, need_post, putaway_time, soldout_time, sales_number, appraise_number"
				+ " FROM s_goods WHERE classify_id = ?";
		return super.queryObjectBySql(sql, new Object[] { classifyId }, Goods.class);
	}

	@Override
	public int addGoods(Goods goods) {
		String sql = "INSERT INTO s_goods(id, classify_id, goods_name, goods_number, title, description,"
				+ " goods_price, store_number, need_post, putaway_time, soldout_time, sales_number, appraise_number)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return super.addBySql(sql, new Object[] { goods.getId(), goods.getClassifyId(), goods.getGoodsName(), goods.getGoodsNumber(), goods.getTitle(), goods.getDescription(),
				goods.getGoodsPrice(), goods.getStoreNumber(), goods.getNeedPost(), goods.getPutawayTime(), goods.getSoldoutTime(), goods.getSalesNumber(), goods.getAppraiseNumber()});
	}

}
