package com.zlshuo.selenium.nonaming.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.zlshuo.selenium.nonaming.tools.Log;

/**
 * 解析定位器，使用相应的by方法获取元素
 * @author leshuo
 * @version 2014年5月1日
 */
public class FindElementInTimeout {
	
	public WebDriver driver=null;
	private WebElement element=null;
	
	public FindElementInTimeout(WebDriver driver){
		this.driver=driver;
	}
	/**
	 * @Description: 解析定位器，使用相应的by方法获取元素
	 * @param driver
	 * @param locator 定位字符串
	 * @return WebElement 页面元素
	 */
	public WebElement getElement(String locator,int timeout){
		String[] splitLocator=locator.split("\\$");
		if(splitLocator.length>1){
			if(splitLocator[0].equals("id"))
				element=waitElement(By.id(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("name"))
				element=waitElement(By.name(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("class"))
				element=waitElement(By.className(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("css"))
				element=waitElement(By.cssSelector(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("linkText"))
				element=waitElement(By.linkText(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("partialLinkText"))
				element=waitElement(By.partialLinkText(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("tagName"))
				element=waitElement(By.tagName(splitLocator[1]),timeout);
			else{
				Log.error("没有这种"+"【"+locator+"】"+"元素定位器");
				Assert.fail("【"+locator+"】"+"这种定位方式不存在");	
			}
									
		}else
			element=waitElement(By.xpath(splitLocator[0]),timeout);
		
		if(element==null){
			Log.error("元素【"+locator+"】未找到");
			//Assert.fail("元素【"+locator+"】未找到");
		}

		return element;
	}
	
	/**
	 * @Description: 在规定时间内每隔1S检查元素是否存在，若存在则返回元素
	 * @param by
	 * @param timeout 超时时间
	 * @return
	 * @return WebElement 页面元素
	 */
	public WebElement waitElement(By by,int timeout){
		WebDriverWait wait=new WebDriverWait(driver,timeout,1000);
		WebElement e=null;
		try{
			e=wait.until(ExpectedConditions.presenceOfElementLocated(by));
		}catch(Exception e1){
			Log.error("在"+timeout+"S内未找到元素");
		}
		return e;
	
	}
}
