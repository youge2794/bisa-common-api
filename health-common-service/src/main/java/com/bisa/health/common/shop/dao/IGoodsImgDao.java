package com.bisa.health.common.shop.dao;

import java.util.List;

import com.bisa.health.shop.model.GoodsImg;

public interface IGoodsImgDao {
	
	List<GoodsImg> selectMainImgByGoodsNumber(String goodsNumber);

	GoodsImg loadMainPicByGoodNumber(String goodsNumber);

	int addGoodsImg(GoodsImg goodsImg);

}
