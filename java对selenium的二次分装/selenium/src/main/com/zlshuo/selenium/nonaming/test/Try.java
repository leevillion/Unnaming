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
		//生成chrome的driverInstance
		driver=CreateDriverInstance.getDriverInstance("chrome");
	}
	
	//是否正确执行搜索功能
	@Test
	public void test1() throws InterruptedException{
		
		driver.get("http://www.baidu.com");
		driver.submit("id$kw","搜索selenium",10,"selenium");
		driver.assertContains("selenium", driver.getTitle(), "判断title中是否含有selenium");
		Thread.sleep(3000);
	}
	
	//搜索selenium点击第一条结果并判断title是否等于预期值
	@Test
	public void test2() throws InterruptedException{
		
		driver.get("http://www.baidu.com");
		driver.submit("id$kw","搜索selenium",10,"selenium");
		driver.click("//div[@id='1']/h3/a[1]");
		driver.switchToWindow(2);
		driver.assertEquals("Selenium - Web Browser Automation", driver.getTitle(), "title是否等于预期");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void quit(){
		driver.quit();
	}
}
