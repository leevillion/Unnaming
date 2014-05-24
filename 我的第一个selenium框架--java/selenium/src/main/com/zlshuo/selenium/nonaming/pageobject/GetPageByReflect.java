package com.zlshuo.selenium.nonaming.pageobject;

import org.openqa.selenium.WebDriver;

/**
 * @author leshuo
 * @version 2014��5��24��
 */
public class GetPageByReflect {
	
	private  WebDriver driver;
	
	public AnjukeHomePage getAnjukeHomePage(WebDriver driver){
		return new AnjukeHomePage(driver);
	}
	
	public AnjukeSaleListPage getAnjukeSaleListPage(WebDriver driver){
		return new AnjukeSaleListPage(driver);
	}
}
