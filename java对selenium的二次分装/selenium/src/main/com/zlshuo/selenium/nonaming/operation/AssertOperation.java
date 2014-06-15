package com.zlshuo.selenium.nonaming.operation;

import org.testng.Assert;

import com.zlshuo.selenium.nonaming.tools.Log;

/**
 * @author leshuo
 * @version 2014年5月2日
 */
public class AssertOperation implements IAssertOperation{

	/**
	 * @Override
	 * @Description: 断言condition是否为真,=true继续执行,=false中断操作
	 * @param condition
	 * @param log
	 */
	public void assertTrue(Boolean condition, String log) {
		// TODO Auto-generated method stub
		Log.info("assertTrue:"+condition+log);
		Assert.assertTrue(condition);
	}
	
	/**
	 * 
	 * @Override
	 * @Description: 断言condition是否为真
	 * @param condition
	 * @param log
	 * @param isContinue condition=false时是否继续执行
	 */
	public void assertTrue(Boolean condition,String log,Boolean isContinue){
		if(!isContinue)
			assertTrue(condition,log);
		else{
			if(condition)
				Log.info("assertTrue:"+condition+"is true.");
			else
				Log.warning("assertTrue:"+condition+"is false.");
		}
			
	}
	/**
	 * @Override
	 * @Description: 断言condition是否为假,flase继续执行,=true中断操作
	 * @param condition
	 * @param log
	 */
	public void assertFlase(Boolean condition, String log) {
		// TODO Auto-generated method stub
		Log.info("assertFlase:"+condition+log);
		Assert.assertFalse(condition);
	}
	
	/**
	 * 
	 * @Override
	 * @Description: 断言condition是否为假
	 * @param condition
	 * @param log
	 * @param isContinue condition=false时是否继续执行
	 */
	public void assertFlase(Boolean condition,String log,Boolean isContinue){
		if(!isContinue)
			assertFlase(condition,log);
		else{
			if(condition)
				Log.info("assertFlase:"+condition+"is false.");
			else
				Log.warning("assertFlase:"+condition+"is true.");
		}
	}

	/**
	 * @Override
	 * @Description: int型数据是否相等
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertEquals(int actual, int expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertEquals:actual:"+actual+",expected:"+expected+log);
		Assert.assertEquals(actual, expected, log);
	}

	/**
	 * @Override
	 * @Description: float型数据是否相等
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertEquals(float actual, float expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertEquals:actual:"+actual+",expected:"+expected+log);
		Assert.assertEquals(actual, expected, log);
	}

	/**
	 * @Override
	 * @Description: double型数据是否相等
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertEquals(double actual, double expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertEquals:actual:"+actual+",expected:"+expected+log);
		Assert.assertEquals(actual, expected);
	}

	/**
	 * @Override
	 * @Description: 字符串相等判断
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertEquals(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertEquals:actual:"+actual+",expected:"+expected+log);
		Assert.assertEquals(actual, expected);
	}

	/**
	 * @Override
	 * @Description: 是否为空
	 * @param object
	 * @param log
	 */
	public void assertNull(Object object, String log) {
		// TODO Auto-generated method stub
		Log.info("assertNull:"+log);
		Assert.assertNull(object);
	}

	/**
	 * @Override
	 * @Description: 判断对象是否不为null，如果!=null则pass
	 * @param object
	 * @param log
	 */
	public void assertNotNull(Object object, String log) {
		// TODO Auto-generated method stub
		Log.info("assertNull:"+log);
		Assert.assertNotNull(object);
	}

	/**
	 * @Override
	 * @Description: 判断actual是否不等于expected，若actual!=expected则pass
	 * @param actual
	 * @param actexpectedual
	 * @param log
	 */
	public void assertNotEquals(int actual, int expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertNotEquals:actual:"+actual+",expected:"+expected+log);
		if(actual==expected)
			Assert.fail(log);
	}

	/**
	 * @Override
	 * @Description: 判断actual是否不等于expected，若actual!=expected则pass
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertNotEquals(float actual, float expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertNotEquals:actual:"+actual+",expected:"+expected+log);
		if(actual==expected)
			Assert.fail(log);
	}

	/**
	 * @Override
	 * @Description: 判断actual是否不等于expected，若actual!=expected则pass
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertNotEquals(double actual, double expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertNotEquals:actual:"+actual+",expected:"+expected+log);
		if(actual==expected)
			Assert.fail(log);
	}

	/**
	 * @Override
	 * @Description: 判断actual是否不等于expected，若actual!=expected则pass
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertNotEquals(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertNotEquals:actual:"+actual+",expected:"+expected+log);
		if(actual.equals(expected))
			Assert.fail(log);
	}

	/**
	 * @Override
	 * @Description: 若expected包含actual则pass
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertContains(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertContains:actual:"+actual+",expected:"+expected+log);
		if(!expected.contains(actual))
			Assert.fail(log);
	}

	/**
	 * @Override
	 * @Description: 若expected不包含actual则pass
	 * @param actual
	 * @param expected
	 * @param log
	 */
	public void assertNotContains(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		Log.info("assertNotContains:actual:"+actual+",expected:"+expected+log);
		if(expected.contains(actual))
			Assert.fail(log);
	}

	

}
