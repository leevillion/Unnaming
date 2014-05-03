package com.zlshuo.selenium.nonaming.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.zlshuo.selenium.nonaming.tools.Log;

/**
 * ������λ����ʹ����Ӧ��by������ȡԪ��
 * @author leshuo
 * @version 2014��5��1��
 */
public class FindElementInTimeout {
	
	public WebDriver driver=null;
	private WebElement element=null;
	
	public FindElementInTimeout(WebDriver driver){
		this.driver=driver;
	}
	/**
	 * @Description: ������λ����ʹ����Ӧ��by������ȡԪ��
	 * @param driver
	 * @param locator ��λ�ַ���
	 * @return WebElement ҳ��Ԫ��
	 */
	public WebElement getElement(String locator,int timeout){
		String[] splitLocator=locator.split("\\$");
		if(splitLocator.length>1){
			if(splitLocator[0].equals("id"))
				element=waitElement(By.id(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("name"))
				element=waitElement(By.name(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("class"))
				element=waitElement(By.className(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("css"))
				element=waitElement(By.cssSelector(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("linkText"))
				element=waitElement(By.linkText(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("partialLinkText"))
				element=waitElement(By.partialLinkText(splitLocator[1]),timeout);
			else if(splitLocator[0].equals("tagName"))
				element=waitElement(By.tagName(splitLocator[1]),timeout);
			else{
				Log.error("û������"+"��"+locator+"��"+"Ԫ�ض�λ��");
				Assert.fail("��"+locator+"��"+"���ֶ�λ��ʽ������");	
			}
									
		}else
			element=waitElement(By.xpath(splitLocator[0]),timeout);
		
		if(element==null){
			Log.error("Ԫ�ء�"+locator+"��δ�ҵ�");
			//Assert.fail("Ԫ�ء�"+locator+"��δ�ҵ�");
		}

		return element;
	}
	
	/**
	 * @Description: �ڹ涨ʱ����ÿ��1S���Ԫ���Ƿ���ڣ��������򷵻�Ԫ��
	 * @param by
	 * @param timeout ��ʱʱ��
	 * @return
	 * @return WebElement ҳ��Ԫ��
	 */
	public WebElement waitElement(By by,int timeout){
		WebDriverWait wait=new WebDriverWait(driver,timeout,1000);
		WebElement e=null;
		try{
			e=wait.until(ExpectedConditions.presenceOfElementLocated(by));
		}catch(Exception e1){
			Log.error("��"+timeout+"S��δ�ҵ�Ԫ��");
		}
		return e;
	
	}
}
