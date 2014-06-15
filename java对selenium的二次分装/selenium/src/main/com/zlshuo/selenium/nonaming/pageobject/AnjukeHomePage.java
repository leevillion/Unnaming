package com.zlshuo.selenium.nonaming.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author leshuo
 * @version 2014Äê5ÔÂ14ÈÕ
 */
public class AnjukeHomePage extends BasePage{
	
	private WebDriver driver;
	
	AnjukeHomePage(WebDriver driver){
		this.driver=driver;
	}
	
	public AnjukeSaleListPage serachKeyWords(String words){
		driver.findElement(By.xpath("//input[@id='glb_search0']")).sendKeys(words);
		driver.findElement(By.xpath("//input[@id='glb_search0']")).submit();
		return new AnjukeSaleListPage(driver);
	}
	
}
