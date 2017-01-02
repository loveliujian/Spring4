 package com.liu.spring;

import org.junit.Test;

import com.imooc.test.base.UnitTestBase;
import com.liu.spring.autowiring.AutoWiringService;

public class TestAutowiring extends UnitTestBase{
	
	public TestAutowiring()
	{
		super("classpath:spring-basic.xml");
	}

	@Test
	public void testSay()
	{
		AutoWiringService service=super.getBean("autoWiringService");
		service.say("this is test");
	}
}
