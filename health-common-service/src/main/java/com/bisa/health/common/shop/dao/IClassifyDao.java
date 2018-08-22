package com.bisa.health.common.shop.dao;

import java.util.List;

import com.bisa.health.shop.model.Classify;

public interface IClassifyDao {
	
	List<Classify> selectListClassifysBySuperIdAndHighId(Integer highest_super_id, Integer super_id);

	Classify selectSingleGoodsByClassifyId(Integer classify_id); //获取 单品 分类表对象

	Classify selectPackageByClassifyId(Integer classify_id); //判断 套餐 分类表对象

	Classify selectClassifyById(Integer id);  //获得指定类别

	int addClassify(Classify classfy);  //添加类别

}
