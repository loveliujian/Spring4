package com.liu.spring.service.impl;

import com.liu.spring.dao.BaseDao;
import com.liu.spring.service.BaseService;

public class BaseServiceImpl implements BaseService {
	
	private BaseDao baseDao;
	
	@Override
	public void deal() {
		System.out.println("--------------service层方法调用开始--------------");
		baseDao.count();
		baseDao.save();
		System.out.println("--------------service层方法调用结束--------------");
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
}
