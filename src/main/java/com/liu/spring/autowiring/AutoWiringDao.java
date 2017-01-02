package com.liu.spring.autowiring;

public class AutoWiringDao {
	
	private AutoWiringDao autoWiringDao;

	public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
		this.autoWiringDao = autoWiringDao;
	}
	
	public void say(String word)
	{
		this.autoWiringDao.say(word);
	}

}
