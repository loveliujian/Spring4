package com.liu.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class MoocBeanName implements BeanNameAware{

	@Override
	public void setBeanName(String arg0) {
		System.out.println("MoocBeanName:" + arg0);
		
	}

}
