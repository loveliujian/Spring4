package com.liu.spring;

import org.junit.Test;

import com.imooc.test.base.UnitTestBase;

public class TestAware extends UnitTestBase{

	@Test
	public void textMoocApplicationContext()
	{
		System.out.println("" + super.getBean("moocApplicationContext").hashCode());
	}
}
