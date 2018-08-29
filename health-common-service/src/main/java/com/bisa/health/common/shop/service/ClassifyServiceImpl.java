package com.bisa.health.common.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bisa.health.common.shop.dao.IClassifyDao;
import com.bisa.health.shop.enumerate.GoodsClassify;
import com.bisa.health.shop.model.Classify;
@Service
public class ClassifyServiceImpl implements IClassifyService {
	
	@Autowired
	private IClassifyDao classifyDao;

	@Override
	@Cacheable(value="spring-defaultCache",key="'single_classify:'+#classify_id")
	public Classify selectSingleGoodsByClassifyId(Integer classify_id) {
		return classifyDao.selectSingleGoodsByClassifyId(classify_id);
	}

	@Override
	@Cacheable(value="spring-defaultCache",key="'single_classify:'+#classify_id")
	public Classify selectPackageByClassifyId(Integer classify_id) {
		return classifyDao.selectPackageByClassifyId(classify_id);
	}

	@Override
	@Cacheable(value="spring-defaultCache",key="'fitting_classifys:'+#classify_id")
	public List<Classify> selectFittingsClassifys(Integer classify_id) {
		return classifyDao.selectListClassifysBySuperIdAndHighId(GoodsClassify.FITTING.getValue(), classify_id);
	}

	@Override
	@Cacheable(value="spring-defaultCache",key="'fitting_classifys:'+#classify_id")
	public List<Classify> selectPackagesClassifys(Integer classify_id) {
		return classifyDao.selectListClassifysBySuperIdAndHighId(GoodsClassify.PACKAGES.getValue(), classify_id);
	}

	@Override
	@Cacheable(value="spring-defaultCache",key="'single_classify:'+#id")
	public Classify selectClassifyById(Integer id) {
		return classifyDao.selectClassifyById(id);
	}
	/**
	 * 判断是否是虚拟商品
	 * @param classifyId
	 * @return superId 父级类别
	 */
	@Override
	@Cacheable(value="spring-defaultCache",key="'is_vitrual:'+#classifyId")
	public Integer isVirtualClassify(Integer classifyId) {
		Classify classify= classifyDao.selectClassifyById(classifyId);
		Integer superId = classify.getSuperId();	//查出父级类别
		Integer highSuperId = classify.getHighestSuperId();		//超级类别
		
		//次数型或时限型
		if(highSuperId.equals(GoodsClassify.COUNT.getValue()) || highSuperId.equals(GoodsClassify.TIME.getValue())){
			return superId;
		}
		
		if(!superId.equals(0)){	
			classify = classifyDao.selectClassifyById(superId);
			highSuperId = classify.getHighestSuperId();		
		}
		
		//次数型或时限型
		if(highSuperId.equals(GoodsClassify.COUNT.getValue()) || highSuperId.equals(GoodsClassify.TIME.getValue())){
			return superId;
		}
		
		return 0;
	}

	@Override
	public boolean addClassfiy(Classify classfy) {
		int result = classifyDao.addClassify(classfy);
		return result >= 1 ? true : false;
	}

}
