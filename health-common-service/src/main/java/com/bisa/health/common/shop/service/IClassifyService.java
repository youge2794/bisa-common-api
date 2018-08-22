package com.bisa.health.common.shop.service;

import java.util.List;

import com.bisa.health.shop.model.Classify;

public interface IClassifyService {
	
	/**
	 * 获取 指定类别
	 * @param classify_id
	 * @return
	 */
	Classify selectClassifyById(Integer id); 
	
	/**
	 * 查询主商品下所有配件商品
	 * @param classify_id
	 * @return
	 */
	List<Classify> selectFittingsClassifys(Integer classify_id);

	/**
	 * 获取 单品 分类表对象
	 * @param classify_id
	 * @return
	 */
	Classify selectSingleGoodsByClassifyId(Integer classify_id); 

	/**
	 * 判断 套餐 分类表对象
	 * @param classify_id
	 * @return
	 */
	Classify selectPackageByClassifyId(Integer classify_id); 
	
	/**
	 * 获取 主商品下所有套餐 
	 * @param classify_id
	 * @return
	 */
	List<Classify> selectPackagesClassifys(Integer classify_id);
	
	/**
	 * 判断是否是虚拟商品
	 * @param classifyId
	 * @return superId 父级类别
	 */
	Integer isVirtualClassify(Integer classifyId);

	/**
	 * 添加类别
	 * @param classfiy
	 * @return
	 */
	boolean addClassfiy(Classify classfy);

}
