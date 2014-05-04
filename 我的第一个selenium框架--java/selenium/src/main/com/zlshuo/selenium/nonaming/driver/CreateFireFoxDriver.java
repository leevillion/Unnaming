package com.zlshuo.selenium.nonaming.driver;
/**
 * @author leshuo
 * @version 2014Äê4ÔÂ20ÈÕ
 */
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.zlshuo.selenium.nonaming.tools.ReadXml;

public class CreateFireFoxDriver implements ICreateDriver{
	private WebDriver driver;
	public WebDriver createDriver() {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.firefox.bin" , ReadXml.getNodeValue("path"));
		if(!ReadXml.getNodeValue("profile").isEmpty()){
			File profileDir = new File(ReadXml.getNodeValue("profile"));  
			FirefoxProfile profile = new FirefoxProfile(profileDir);  
			driver = new FirefoxDriver(profile);
		}else
			driver = new FirefoxDriver();
		return driver;
	}
	
}
