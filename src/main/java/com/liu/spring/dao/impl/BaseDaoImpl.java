package com.liu.spring.dao.impl;

import com.liu.spring.dao.BaseDao;

public class BaseDaoImpl implements BaseDao{

	@Override
	public void save() {
		System.out.println("dao层save方法被调用");
	}

	@Override
	public int count() {
		System.out.println("dao层count方法被调用");
		return 0;
	}

}
