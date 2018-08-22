package com.bisa.health.common.shop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.shop.model.GoodsImg;
@Repository
public class GoodsImgDaoImpl extends BaseDao<GoodsImg> implements IGoodsImgDao {

	@Override
	public List<GoodsImg> selectMainImgByGoodsNumber(String goods_number) {
		String sql = "SELECT id, goods_number, img_url, position FROM s_goods_img WHERE goods_number = ?";
		return super.listBySql(sql, new Object[]{goods_number}, GoodsImg.class);
	}

	@Override
	public GoodsImg loadMainPicByGoodNumber(String goodsNumber) {
		String sql = "SELECT id, goods_number, img_url, position FROM s_goods_img WHERE goods_number = ? AND position = 1";
		return super.queryObjectBySql(sql, new Object[]{goodsNumber}, GoodsImg.class);
	}

	@Override
	public int addGoodsImg(GoodsImg goodsImg) {
		String sql = "INSERT INTO s_goods_img(id, goods_number, img_url, position) VALUES (?, ?, ?, ?)";
		return super.addBySql(sql, new Object[]{goodsImg.getId(), goodsImg.getGoodsNumber(), goodsImg.getImgUrl(), goodsImg.getPosition()});
	
	}

}
