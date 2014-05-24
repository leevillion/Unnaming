package com.zlshuo.selenium.nonaming.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zlshuo.selenium.nonaming.tools.ReadXml;

/**
 * @author leshuo
 * @version 2014年5月24日
 */
public class CreateRemoteWebDriver implements ICreateDriver{
	private WebDriver driver;
	/**
	 * @Description: 远程服务
	 * @return
	 * @throws MalformedURLException 
	 */
	public WebDriver createDriver(){
		String url=ReadXml.getNodeValue("proxy");
		String browser=ReadXml.getNodeValue("proxyBrowser");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		capabilities.setBrowserName(browser.toUpperCase());
		try {
			driver = new RemoteWebDriver(new URL(url),capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}

}
