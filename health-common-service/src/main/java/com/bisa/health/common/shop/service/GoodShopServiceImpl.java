package com.bisa.health.common.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.health.common.shop.dao.IGoodShopDao;
import com.bisa.health.shop.model.Goods;

@Service
public class GoodShopServiceImpl implements IGoodShopService{
	
	@Autowired
	private IGoodShopDao goodShopDao;

	@Override
	public Goods getByNumber(String number) {
		return goodShopDao.getByNumber(number);
	}

	@Override
	public List<Goods> listByParent(int pid) {
		return goodShopDao.listByParent(pid);
	}
	
}
