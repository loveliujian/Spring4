package com.liu.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean")
//@Component

//@Scope("prototype")
@Scope
public class BeanAnnotation {
	
	public void say(String arg)
	{
		System.out.println("BeanAnnotation:" + arg);
	}
	
	public void myhashCode()
	{
		System.out.println("BeanAnnotation:" + this.hashCode());
	}

}
