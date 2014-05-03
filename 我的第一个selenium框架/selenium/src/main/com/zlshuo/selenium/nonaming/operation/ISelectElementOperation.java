package com.zlshuo.selenium.nonaming.operation;

import java.util.List;

import org.openqa.selenium.WebElement;

/**
 * 下拉框操作接口
 * @author leshuo
 * @version 2014年5月1日
 */
public interface ISelectElementOperation {
	
	public Boolean isMultiple(String locator,int timeout);
	
	public Boolean isMultiple(String locator);
	
	public List<WebElement> getOptions(String locator,int timeout,String log);
	
	public List<WebElement> getOptions(String locator,int timeout);
	
	public List<WebElement> getOptions(String locator);
	
	public List<WebElement> getAllSelectedOptions(String locator,int timeout,String log);
	
	public List<WebElement> getAllSelectedOptions(String locator,int timeout);
	
	public List<WebElement> getAllSelectedOptions(String locator);
	
	public WebElement getFirstSelectedOption(String locator,int timeout,String log);
	
	public WebElement getFirstSelectedOption(String locator,int timeout);
	
	public WebElement getFirstSelectedOption(String locator);
	
	public void selectByVisibleText(String locator,String text,int timeout);
	
	public void selectByVisibleText(String locator,String text);
	
	public void selectByIndex(String locator,int index,int timeout);
	
	public void selectByIndex(String locator,int index);
	
	public void selectByValue(String locator,String value,int timeout);
	
	public void selectByValue(String locator,String value);
	
	public void deselectAll(String locator,int timeout);
	
	public void deselectAll(String locator);
	
	public void deselectByValue(String locator,String value,int timeout);
	
	public void deselectByValue(String locator,String value);
	
	public void deselectByIndex(String locator,int index,int timeout);
	
	public void deselectByIndex(String locator,int index);
	
	public void deselectByVisibleText(String locator,String text,int timeout);
	
	public void deselectByVisibleText(String locator,String text);
}
