package com.zlshuo.selenium.nonaming.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author leshuo
 * @version 2014Äê5ÔÂ14ÈÕ
 */
public class AnjukeSalePropPage extends BasePage{
	
	private WebDriver driver;
	
	public AnjukeSalePropPage(WebDriver driver){
		this.driver=driver;
	}
	
	public String getTelephoneNum(){
		return driver.findElement(By.xpath("//div[@class='A-fangyuan-call']/p[@class='number']")).
				getText();
	}
}
