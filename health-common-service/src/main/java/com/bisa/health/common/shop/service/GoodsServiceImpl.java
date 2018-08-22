package com.bisa.health.common.shop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bisa.health.common.shop.dao.IClassifyDao;
import com.bisa.health.common.shop.dao.IGoodsDao;
import com.bisa.health.common.shop.dao.IGoodsImgDao;
import com.bisa.health.shop.dto.GoodsPackagesDto;
import com.bisa.health.shop.dto.ShopGoodsJsonDto;
import com.bisa.health.shop.enumerate.GoodsClassify;
import com.bisa.health.shop.model.Classify;
import com.bisa.health.shop.model.Goods;
import com.bisa.health.shop.model.GoodsImg;
@Service
public class GoodsServiceImpl implements IGoodsService{
	
	@Autowired 
	private IClassifyDao classifyDao;
	
	@Autowired
	private IGoodsDao goodsDao;
	
	@Autowired
	private IGoodsImgDao goodsImgDao;
	
	@Override
	@Cacheable(value="spring-defaultCache",key="'goods:'+#classifyId")
	public Goods selectGoodsByClassifyId(Integer classifyId) {
		return goodsDao.selectGoodsByClassifyId(classifyId);
	}
	
	@Override
	@Cacheable(value="spring-defaultCache",key="'goods:'+#goodsNumber")
	public Goods selectGoodsByGoodsNumber(String goodsNumber) {
		Goods goods = goodsDao.selectGoodsByGoodsNumber(goodsNumber);
		return goods;
	}

	@Override
	@Cacheable(value="spring-defaultCache",key="'goodsdto:'+#goodsNumber")
	public GoodsPackagesDto getGoodsPackagesDtoByGoodsNumber(String goodsNumber) {
		//获取主商品的基本信息
		Goods main_goods = goodsDao.selectGoodsByGoodsNumber(goodsNumber);
		GoodsPackagesDto goodsPackagesDto = null;
		if(main_goods != null){
			goodsPackagesDto = new GoodsPackagesDto(main_goods.getId(), main_goods.getGoodsName(),
					main_goods.getGoodsNumber(), main_goods.getGoodsPrice(), main_goods.getGoodsPrice(), 1);
		}
		return goodsPackagesDto;
	}

	@Override
	@Cacheable(value="spring-defaultCache",key="'fitting_goods:'+#classifyId")
	public List<ShopGoodsJsonDto> getListFittingGoods(Integer classifyId) {
		List<ShopGoodsJsonDto> fittingGoodsList = new ArrayList<ShopGoodsJsonDto>();
		
		List<Classify> classifys = classifyDao.selectListClassifysBySuperIdAndHighId(GoodsClassify.FITTING.getValue(), classifyId);
		if(classifys.size() > 0){
			for (Classify classify : classifys) {
				Goods fittingGood = goodsDao.selectGoodsByClassifyId(classify.getId());
				//获取配件的所有图片
				List<GoodsImg> part_goodsImgs = goodsImgDao.selectMainImgByGoodsNumber(fittingGood.getGoodsNumber());
				GoodsPackagesDto fittingGoodsDto = new GoodsPackagesDto(fittingGood.getId(), fittingGood.getGoodsName(),
						fittingGood.getGoodsNumber(), fittingGood.getGoodsPrice(), fittingGood.getGoodsPrice(), 1);
				ShopGoodsJsonDto fittingGoodsJsonDto = new ShopGoodsJsonDto(fittingGoodsDto, fittingGood.getClassifyId(), "", part_goodsImgs.get(0).getImgUrl());
				
				fittingGoodsList.add(fittingGoodsJsonDto);
			}
		}
		return fittingGoodsList;
	}

	@Override
	public boolean addGoods(Goods goods) {
		int result = goodsDao.addGoods(goods);
		return result >= 1 ? true : false;
	}


}
