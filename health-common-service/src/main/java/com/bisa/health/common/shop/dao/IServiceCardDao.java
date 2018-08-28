package com.bisa.health.common.shop.dao;

import com.bisa.health.shop.model.ServiceCard;

public interface IServiceCardDao {
	/**
	 * 根据classifyId和status获取未使用的第一张卡
	 * @param classifyId
	 * @param status
	 * @return
	 */
	public ServiceCard getServiceCardServiceByClassifyIdAndStatus(int classifyId, int status);
	
	/**
	 * 根据卡号获取卡
	 * @param cardNumber
	 * @return
	 */
	public ServiceCard getServiceCardServiceByCardNumber(String cardNumber);
	
	/**
	 * 更新卡信息-主要修改状态
	 * @param serviceCard
	 * @return
	 */
	public int updateServiceCard(ServiceCard serviceCard);
	
	/**
	 * 批量生成卡
	 * @param serviceCard
	 * @return
	 */
	public int addServiceCard(ServiceCard serviceCard);
}