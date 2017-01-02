package com.liu.spring.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocApplicationContext implements ApplicationContextAware{
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
	{
		System.out.println(applicationContext.getBean("moocApplicationContext").hashCode());
	}

}
