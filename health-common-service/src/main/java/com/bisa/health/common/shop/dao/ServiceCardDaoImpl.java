package com.bisa.health.common.shop.dao;

import org.springframework.stereotype.Repository;

import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.shop.model.ServiceCard;
@Repository
public class ServiceCardDaoImpl extends BaseDao<ServiceCard> implements IServiceCardDao {

	@Override
	public ServiceCard getServiceCardServiceByClassifyIdAndStatus(int classifyId, int card_status) {
		String sql = "SELECT id, card_name, card_number, active_code, classify_id, card_type, count, card_status"
				+ " FROM s_service_card WHERE classify_id = ? AND card_status = ? limit 1";
		return super.queryObjectBySql(sql, new Object[]{classifyId, card_status}, ServiceCard.class);
		
	}

	@Override
	public ServiceCard getServiceCardServiceByCardNumber(String cardNumber) {
		String sql = "SELECT id, card_name, card_number, active_code, classify_id, card_type, count, card_status"
				+ " FROM s_service_card WHERE card_number = ?";
		return super.queryObjectBySql(sql, new Object[]{cardNumber}, ServiceCard.class);
	}

	@Override
	public int updateServiceCard(ServiceCard serviceCard) {
		String sql = "UPDATE s_service_card SET card_status=? WHERE card_number=?";
		return super.updateBySql(sql, new Object[]{serviceCard.getCardStatus(), serviceCard.getCardNumber()});
	}

	@Override
	public int addServiceCard(ServiceCard serviceCard) {
		String sql = "INSERT INTO s_service_card(card_name, card_number, active_code, classify_id, card_type, count, card_status)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
		return super.addBySql(sql, new Object[]{serviceCard.getCardName(), serviceCard.getCardNumber(), serviceCard.getActiveCode(), serviceCard.getClassifyId(),
				serviceCard.getCardType(), serviceCard.getCount(), serviceCard.getCardStatus()});
	}

}
