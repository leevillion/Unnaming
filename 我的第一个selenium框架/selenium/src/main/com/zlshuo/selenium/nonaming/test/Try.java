package com.zlshuo.selenium.nonaming.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zlshuo.selenium.nonaming.driverinstance.CreateDriverInstance;
import com.zlshuo.selenium.nonaming.driverinstance.DriverInstance;


public class Try {
	
	private DriverInstance driver=null;
	
	@BeforeMethod
	public void setUp(){
		//����chrome��driverInstance
		driver=CreateDriverInstance.getDriverInstance("chrome");
	}
	
	//�Ƿ���ȷִ����������
	@Test
	public void test1() throws InterruptedException{
		
		driver.get("http://www.baidu.com");
		driver.submit("id$kw","����selenium",10,"selenium");
		driver.assertContains("selenium", driver.getTitle(), "�ж�title���Ƿ���selenium");
		Thread.sleep(3000);
	}
	
	//����selenium�����һ��������ж�title�Ƿ����Ԥ��ֵ
	@Test
	public void test2() throws InterruptedException{
		
		driver.get("http://www.baidu.com");
		driver.submit("id$kw","����selenium",10,"selenium");
		driver.click("//div[@id='1']/h3/a[1]");
		driver.switchToWindow(2);
		driver.assertEquals("Selenium - Web Browser Automation", driver.getTitle(), "title�Ƿ����Ԥ��");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void quit(){
		driver.quit();
	}
}
