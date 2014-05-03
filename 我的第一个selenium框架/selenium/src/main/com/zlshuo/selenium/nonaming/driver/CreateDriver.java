package com.zlshuo.selenium.nonaming.driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.zlshuo.selenium.nonaming.tools.Log;

/**
 * @author leshuo
 * @version 2014��4��20��
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
			Log.error("�����"+browser+"������");
			Assert.fail("�����"+browser+"������");
		}
			
		
		return driver;
	}
}
