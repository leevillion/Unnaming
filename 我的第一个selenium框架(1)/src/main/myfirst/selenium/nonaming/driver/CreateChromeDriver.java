package myfirst.selenium.nonaming.driver;
/**
 * @author leshuo
 * @version 2014Äê4ÔÂ20ÈÕ
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateChromeDriver implements ICreateDriver{
	private WebDriver driver;
	
	public WebDriver createDriver() {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.chrome.driver" , 
				"D:\\workspace\\selenium\\src\\resource\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	/*
	public WebDriver createDriver(String[] chromeOptions) {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.chrome.driver" , 
				"D:\\workspace\\selenium\\src\\resource\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments(chromeOptions);
		driver = new ChromeDriver();
		return driver;
	}
	*/
}
