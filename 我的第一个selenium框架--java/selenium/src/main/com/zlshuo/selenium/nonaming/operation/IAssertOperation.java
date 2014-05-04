package com.zlshuo.selenium.nonaming.operation;

/**
 * @author leshuo
 * @version 2014Äê5ÔÂ2ÈÕ
 */
public interface IAssertOperation{
	
	public void assertTrue(Boolean condition,String log);
	
	public void assertTrue(Boolean condition,String log,Boolean isContinue);
	
	public void assertFlase(Boolean condition,String log);
	
	public void assertFlase(Boolean condition,String log,Boolean isContinue);
	
	public void assertEquals(int actual,int expected,String log);
	
	public void assertEquals(float actual,float expected,String log);
	
	public void assertEquals(double actual,double expected,String log);
	
	public void assertEquals(String actual,String expected,String log);
	
	public void assertNull(Object object,String log);
	
	public void assertNotNull(Object object,String log);
	
	public void assertNotEquals(int actual,int expected,String log);
	
	public void assertNotEquals(float actual,float expected,String log);
	
	public void assertNotEquals(double actual,double expected,String log);
	
	public void assertNotEquals(String actual,String expected,String log);
	
	public void assertContains(String actual,String expected,String log);
	
	public void assertNotContains(String actual,String expected,String log);
	
}
