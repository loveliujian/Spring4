package com.liu.spring;

import org.junit.Test;
import org.springframework.stereotype.Component;

import com.imooc.test.base.UnitTestBase;
import com.liu.spring.beanannotation.BeanAnnotation;

public class TestBeanAnnotation extends UnitTestBase{
	
	public TestBeanAnnotation()
	{
		super("classpath*:spring-bean2.xml");
	}
	
	@Test
	public void testSay()
	{
		
		//BeanAnnotation bean = super.getBean("beanAnnotation");
		//bean.say("aaaa");
		
		//@Component 加 ("bean")
		BeanAnnotation bean1 = super.getBean("bean");
		bean1.say("aaaa");	

	}
	
	@Test
	public void myScope()
	{
		BeanAnnotation bean = super.getBean("bean");
		bean.myhashCode();
		
		//@Component 加 ("bean")
		BeanAnnotation bean1 = super.getBean("bean");
		bean1.myhashCode();;
	}

}
