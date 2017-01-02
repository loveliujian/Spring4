package com.liu.spring;

import org.junit.Test;

import com.imooc.test.base.UnitTestBase;
import com.liu.spring.beanannotation.jsr.JsrServic;

public class TestJsr extends UnitTestBase{
	
	public TestJsr()
	{
		super("classpath*:spring-bean2.xml");
	}
	
	@Test
	public void testSave()
	{
		JsrServic service = getBean("jsrServic");
		service.save();
	}

}
