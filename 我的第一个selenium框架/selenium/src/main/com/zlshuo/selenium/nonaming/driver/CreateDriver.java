package com.zlshuo.selenium.nonaming.driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.zlshuo.selenium.nonaming.tools.Log;

/**
 * @author leshuo
 * @version 2014年4月20日
 */
public class CreateDriver {
	
	private static ICreateDriver driver;
	
	public static WebDriver getDriver(String browser){
		ICreateDriver driver=getDriverMethod(browser);
		return driver.createDriver();
	}
	
	public WebDriver getDriver(){
		ICreateDriver driver=getDriverMethod("chrome");
		return driver.createDriver();
	}
	
	private static ICreateDriver getDriverMethod(String browser){
		if(browser.equals("chrome"))
			driver=new CreateChromeDriver();
		else if(browser.equals("firefox"))
			driver=new CreateFireFoxDriver();
		else if(browser.equals("ie"))
			driver=new CreateIEDriver();
		else{
			Log.error("浏览器"+browser+"不存在");
			Assert.fail("浏览器"+browser+"不存在");
		}
			
		
		return driver;
	}
}
