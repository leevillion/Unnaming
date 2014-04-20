package myfirst.selenium.nonaming.driver;

import org.openqa.selenium.WebDriver;

/**
 * @author leshuo
 * @version 2014Äê4ÔÂ20ÈÕ
 */
public class CreateDriver {
	
	private ICreateDriver driver;
	
	public WebDriver getDriver(String browser){
		ICreateDriver driver=getDriverMethod(browser);
		return driver.createDriver();
	}
	private ICreateDriver getDriverMethod(String browser){
		if(browser.equals("chrome"))
			driver=new CreateChromeDriver();
		else if(browser.equals("firefox"))
			driver=new CreateFireFoxDriver();
		else if(browser.equals("ie"))
			driver=new CreateIEDriver();
		
		return driver;
	}
}
