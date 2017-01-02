package com.liu.spring.constructor;

public class ConstructorClient {
	
	private int age;
	
	private String name;
	
	private boolean flag;
	
	public int getAge() {
		return age;
	}
	
	public ConstructorClient() {
		super();
	}

	public ConstructorClient(int age, String name, boolean flag) {
		super();
		this.age = age;
		this.name = name;
		this.flag = flag;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public String toString() {
		return "age:"+age+"->name:"+name+"->flag:"+flag;
	}
}
