package com.liu.spring.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class JsrServic {
	
	//@Resource
	private JsrDao jsrDao;
	
	@Resource
	public void setJsrDao(JsrDao jsrDao) {
		this.jsrDao = jsrDao;
	}


	public void save()
	{
		jsrDao.save();
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy");
	}

}
