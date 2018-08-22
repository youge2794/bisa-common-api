package com.bisa.health.common.shop.service;

import java.util.List;

import com.bisa.health.shop.dto.GoodsPackagesDto;
import com.bisa.health.shop.dto.ShopGoodsJsonDto;
import com.bisa.health.shop.model.Goods;

public interface IGoodsService {
	
	/**
	 * 根据classifyId 获取goods对象
	 * @param classifyId
	 * @return
	 */
	Goods selectGoodsByClassifyId(Integer classifyId);
	
	/**
	 * 根据商品的编号   获取商品的对象
	 * @param goods_number_id
	 * @return
	 */
	Goods selectGoodsByGoodsNumber(String goods_number_id);

	GoodsPackagesDto getGoodsPackagesDtoByGoodsNumber(String goodsNumber);

	List<ShopGoodsJsonDto> getListFittingGoods(Integer classify_id);

	/**
	 * 添加商品
	 * @param goods
	 */
	boolean addGoods(Goods goods);


}
