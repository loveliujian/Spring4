package com.liu.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.spring.constructor.ConstructorClient;
import com.liu.spring.service.BaseService;

public class SpringTest/* extends AbstractTestSupport*/{
	
	@Test
	public void test1(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-basic.xml"); 
		BaseService service = (BaseService) ctx.getBean("baseServiceImpl");
		BaseService service2 = (BaseService) ctx.getBean("baseServiceImpl");
		System.out.println(service);
		System.out.println(service2);
		service.deal();
	}
	
	@Test
	public void test2(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-basic.xml"); 
		ConstructorClient client = (ConstructorClient) ctx.getBean("constructorClient");
		System.out.println(client);
	}

	public static void main(String[] args) {
		String age = "ss";
		int age_ = Integer.valueOf(age);
		System.out.println(age);
				
	}

}
