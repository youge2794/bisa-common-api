package com.bisa.health.common.shop.service;

import java.util.List;

import com.bisa.health.shop.model.Goods;

public interface IGoodShopService {
	public Goods getByNumber(String number);
	public List<Goods> listByParent(int pid);
}
