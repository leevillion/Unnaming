package com.zlshuo.selenium.nonaming.operation;

import org.testng.Assert;

import com.zlshuo.selenium.nonaming.tools.Log;

/**
 * @author leshuo
 * @version 2014��5��2��
 */
public class AssertOperation implements IAssertOperation{

	/**
	 * @Override
	 * @Description: ����condition�Ƿ�Ϊ��,=true����ִ��,=false�жϲ���
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
	 * @Description: ����condition�Ƿ�Ϊ��
	 * @param condition
	 * @param log
	 * @param isContinue condition=falseʱ�Ƿ����ִ��
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
	 * @Description: ����condition�Ƿ�Ϊ��,flase����ִ��,=true�жϲ���
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
	 * @Description: ����condition�Ƿ�Ϊ��
	 * @param condition
	 * @param log
	 * @param isContinue condition=falseʱ�Ƿ����ִ��
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
	 * @Description: int�������Ƿ����
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
	 * @Description: float�������Ƿ����
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
	 * @Description: double�������Ƿ����
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
	 * @Description: �ַ�������ж�
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
	 * @Description: �Ƿ�Ϊ��
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
	 * @Description: �ж϶����Ƿ�Ϊnull�����!=null��pass
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
	 * @Description: �ж�actual�Ƿ񲻵���expected����actual!=expected��pass
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
	 * @Description: �ж�actual�Ƿ񲻵���expected����actual!=expected��pass
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
	 * @Description: �ж�actual�Ƿ񲻵���expected����actual!=expected��pass
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
	 * @Description: �ж�actual�Ƿ񲻵���expected����actual!=expected��pass
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
	 * @Description: ��expected����actual��pass
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
	 * @Description: ��expected������actual��pass
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
