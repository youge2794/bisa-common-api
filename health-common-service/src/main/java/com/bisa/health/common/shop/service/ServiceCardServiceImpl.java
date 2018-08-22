package com.bisa.health.common.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.health.common.shop.dao.IServiceCardDao;
import com.bisa.health.shop.model.ServiceCard;
@Service
public class ServiceCardServiceImpl implements IServiceCardService {
	
	@Autowired
	private IServiceCardDao serviceCardDao;

	@Override
	public ServiceCard getServiceCardServiceByClassifyIdAndStatus(int classifyId, int status) {
		return serviceCardDao.getServiceCardServiceByClassifyIdAndStatus(classifyId, status);
	}

	@Override
	public ServiceCard getServiceCardServiceByCardNumber(String cardNumber) {
		return serviceCardDao.getServiceCardServiceByCardNumber(cardNumber);
	}

	@Override
	public boolean updateServiceCard(ServiceCard serviceCard) {
		int result = serviceCardDao.updateServiceCard(serviceCard);
		return result >= 1 ? true : false;
	}

	@Override
	public boolean addServiceCard(ServiceCard serviceCard) {
		int result = serviceCardDao.addServiceCard(serviceCard);
		return result >= 1 ? true : false;
	}

}
