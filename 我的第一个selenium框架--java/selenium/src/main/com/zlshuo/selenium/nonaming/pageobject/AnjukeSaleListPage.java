package com.zlshuo.selenium.nonaming.pageobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * @author leshuo
 * @version 2014年5月14日
 */
public class AnjukeSaleListPage extends BasePage{
	
	private WebDriver driver;
	
	public AnjukeSaleListPage(WebDriver driver){
		this.driver=driver;
	}
	
	public AnjukeSalePropPage clickPorpByindex(int index){
		driver.findElement(By.xpath("//a[@id='prop_name_qt_prop_"+index+"']")).click();
		//切换到新开的窗口
		driver=switchToWindow(2);
		return new AnjukeSalePropPage(driver);
	}
	
	private List<String> getWindowHandlesList() {
		Set<String> handles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		for (String s : handles){
			list.add(s);
		}
		return list;
	}
	
	private WebDriver switchToWindow(int index) {
		try {  
			int windowNumber=getWindowHandlesList().size();
			if(windowNumber<=0){
				Assert.fail("窗口数为0");
			}else if(windowNumber==1)
				;
			else{  
				return driver.switchTo().window(getWindowHandlesList().get(index-1));  
		        } 
 
	    } catch (NoSuchWindowException e) {  
	        e.printStackTrace(); 
	    }
		return driver;  
		
	}
}
