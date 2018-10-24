package com.bisa.health.common.shop.dao;

import java.util.List;

import com.bisa.health.shop.model.Goods;

public interface IGoodShopDao {
	public Goods getByNumber(String number);
	public List<Goods> listByParent(int pid);
}
