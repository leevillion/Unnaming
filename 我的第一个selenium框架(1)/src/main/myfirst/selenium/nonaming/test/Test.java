package myfirst.selenium.nonaming.test;

import org.openqa.selenium.WebDriver;
import myfirst.selenium.nonaming.driver.*;

public class Test {
	public static void main(String[] args) throws InterruptedException {

		CreateDriver create=new CreateDriver();
		WebDriver driver=create.getDriver("chrome");
		
		driver.get("http://www.baidu.com");
		Thread.sleep(3000);
		driver.quit();
       
	
    	}
}
