package com.zlshuo.selenium.nonaming.pageobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author leshuo
 * @version 2014年5月14日
 */
public class AT1 {
	
	private static WebDriver driver;
	public static void main(String[] args){
		
		System.setProperty ( "webdriver.chrome.driver" , 
			       "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://shanghai.anjuke.com");
		driver.findElement(By.xpath("//input[@id='glb_search0']")).sendKeys("上海别墅");
		driver.findElement(By.xpath("//input[@id='glb_search0']")).submit();
		driver.findElement(By.xpath("//a[@id='prop_name_qt_prop_1']")).click();
		driver=switchToWindow(2);
		String telephoneNum=driver.
				findElement(By.xpath("//div[@class='A-fangyuan-call']/p[@class='number']")).
					getText();
		System.out.println(telephoneNum);
		driver.quit();
	
	}
	
	public static List<String> getWindowHandlesList() {
		Set<String> handles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		for (String s : handles){
			list.add(s);
		}
		return list;
	}
	
	public static WebDriver switchToWindow(int index) {
		try {  
			int windowNumber=getWindowHandlesList().size();
			if(windowNumber<=0){
				Assert.fail("窗口数为0");
			}else if(windowNumber==1)
				;
			else{  
				return driver.switchTo().window(getWindowHandlesList().get(index-1));  
		        } 
 
	    } catch (NoSuchWindowException e) {  
	        e.printStackTrace(); 
	    }
		return driver;  
		
	}
}
