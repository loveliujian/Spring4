package com.liu.spring;

import org.junit.Test;

import com.imooc.test.base.UnitTestBase;

public class TestBeanName extends UnitTestBase {
	
	@Test
	public void textMoocBeanName()
	{
		System.out.println("" +super.getBean("moocBeanName"));
	}

}
