package com.bisa.health.common.shop.dao;

import com.bisa.health.shop.model.Goods;

public interface IGoodsDao {
	
	Goods selectGoodsByGoodsNumber(String goods_number); 
	
	Goods selectGoodsByClassifyId(Integer classifyId);

	int addGoods(Goods goods);   

}
