package com.zlshuo.selenium.nonaming.driver;
/**
 * @author leshuo
 * @version 2014年4月20日
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.zlshuo.selenium.nonaming.tools.ReadXml;
import com.zlshuo.selenium.nonaming.tools.Tools;

public class CreateIEDriver implements ICreateDriver{
	private WebDriver driver;
	public WebDriver createDriver() {
		// TODO Auto-generated method stub
		System.setProperty ( InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY , 
				Tools.getPath()+"\\src\\resource\\IEDriverServer.exe");
		
		DesiredCapabilities capabilities =DesiredCapabilities.internetExplorer();
		
		//读取config.xml中ie设置
		for(int i=0;i<ReadXml.getChildNodes("ie").size();i++){
			String node=ReadXml.getChildNodes("ie").get(i);
			capabilities.setCapability(node,ReadXml.getNodeValue(node));
		}
		driver = new InternetExplorerDriver(capabilities);
		return driver;
	}
	

}
