package com.bisa.health.common.shop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.shop.model.Classify;

@Repository
public class ClassifyDaoImpl extends BaseDao<Classify> implements IClassifyDao {
	
	@Override
	public Classify selectSingleGoodsByClassifyId(Integer classify_id) {
		String sql = "SELECT id, classify_name, highest_super_id, super_id FROM s_classify WHERE id = ? AND highest_super_id != 6";
		return super.queryObjectBySql(sql, new Object[] { classify_id }, Classify.class);
	}
	
	@Override
	public Classify selectPackageByClassifyId(Integer classify_id) {
		String sql = "SELECT id, classify_name, highest_super_id, super_id FROM s_classify WHERE id = ? AND highest_super_id = 6";
		return super.queryObjectBySql(sql, new Object[] { classify_id }, Classify.class);
	}
	
	@Override
	public List<Classify> selectListClassifysBySuperIdAndHighId(Integer highest_super_id, Integer super_id) {
		String sql = "SELECT id, classify_name, highest_super_id, super_id FROM s_classify WHERE highest_super_id = ? AND super_id = ?";
		return super.listBySql(sql, new Object[]{highest_super_id, super_id}, Classify.class);
	}

	@Override
	public Classify selectClassifyById(Integer id) {
		String sql = "SELECT id, classify_name, highest_super_id, super_id FROM s_classify WHERE id = ?";
		return super.queryObjectBySql(sql, new Object[] { id }, Classify.class);
	}

	@Override
	public int addClassify(Classify classfy) {
		String sql = "INSERT INTO s_classify(id, classify_name, highest_super_id, super_id) VALUES (?, ?, ?, ?)";
		return super.addBySql(sql, new Object[] {classfy.getId(), classfy.getClassifyName(), classfy.getHighestSuperId(), classfy.getSuperId()});
	}
}
