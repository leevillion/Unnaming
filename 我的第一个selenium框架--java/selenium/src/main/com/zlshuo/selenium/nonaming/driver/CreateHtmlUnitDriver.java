package com.zlshuo.selenium.nonaming.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

/**
 * @author leshuo
 * @version 2014��5��24��
 */
public class CreateHtmlUnitDriver implements ICreateDriver{
	private WebDriver driver;
	/**
	 * @Description: Ĭ��ģ��chrome
	 * @return
	 */
	public WebDriver createDriver() {
		driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		return driver;
	}

}
