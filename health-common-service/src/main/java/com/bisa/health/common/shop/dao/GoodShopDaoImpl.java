package com.bisa.health.common.shop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.shop.model.Goods;

@Repository
public class GoodShopDaoImpl extends BaseDao<Goods> implements IGoodShopDao{

	@Override
	public Goods getByNumber(String number) {
		String sql="select * from s_goods where goods_number=?";
		return super.queryObjectBySql(sql, new Object[]{number}, Goods.class);
	}

	@Override
	public List<Goods> listByParent(int pid) {
		String sql="select * from s_goods where parent_id=?";
		return super.listBySql(sql,new Object[]{pid}, Goods.class, true);
	}
	
}
