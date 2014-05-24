package com.zlshuo.selenium.nonaming.pageobject;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author leshuo
 * @version 2014Äê5ÔÂ14ÈÕ
 */
public class BasePage {
			
	private static WebDriver driver;
	
	@SuppressWarnings("unchecked")
	public static <page> page get(String url){
		System.setProperty ( "webdriver.chrome.driver" , 
			       "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get(url);
		
		
		return getP(url);
	}
	
	private static <page> page getP(String url){
		Url urlObject=new Url();
		String str=urlObject.getUrl(url);
		Class<?> getPage=null;
		try {
			getPage=Class.forName("com.zlshuo.selenium.nonaming.pageobject.GetPageByReflect");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
        	Method method=getPage.getMethod(str, WebDriver.class);
        	return (page) method.invoke(getPage.newInstance(), driver);
        }catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
	public static void quit(){
		driver.quit();
	}
	
}
