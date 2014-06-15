package com.zlshuo.selenium.nonaming.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

/**
 * @author leshuo
 * @version 2014年5月24日
 */
public class CreateHtmlUnitDriver implements ICreateDriver{
	private WebDriver driver;
	/**
	 * @Description: 默认模拟chrome
	 * @return
	 */
	public WebDriver createDriver() {
		driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		return driver;
	}

}
