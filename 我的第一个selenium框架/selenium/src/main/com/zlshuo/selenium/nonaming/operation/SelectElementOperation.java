package com.zlshuo.selenium.nonaming.operation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.zlshuo.selenium.nonaming.element.FindElementInTimeout;
import com.zlshuo.selenium.nonaming.tools.Log;
import com.zlshuo.selenium.nonaming.tools.ReadXml;

/**
 * 下拉框操作
 * @author leshuo
 * @version 2014年5月1日
 */
public class SelectElementOperation extends FindElementInTimeout implements ISelectElementOperation{
	
	private static final int timeOut=Integer.parseInt(ReadXml.getNodeValue("timeout"));
	
	/**
	 * 构造函数初始化driver
	 * @param driver
	 */
	public SelectElementOperation(WebDriver driver){
		super(driver);
	}

	/**
	 * @Override
	 * @Description: 检查是否为复选框
	 * @param locator
	 * @param timeout
	 * @return 复选框返回true
	 */
	public Boolean isMultiple(String locator, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		return select.isMultiple();
	}

	/**
	 * @Override
	 * @Description: 检查是否为复选框，超时时间取config.xml中timeout的数值
	 * @param locator
	 * @return 复选框返回true
	 */
	public Boolean isMultiple(String locator) {
		// TODO Auto-generated method stub
		return isMultiple(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: 获取下拉框中的所有元素
	 * @param locator
	 * @param timeout
	 * @param log
	 * @return
	 */
	public List<WebElement> getOptions(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		Log.info("getOptions【"+locator+"】is Done"+log);
		return select.getOptions();
	}

	/**
	 * @Override
	 * @Description: 获取下拉框中的所有元素
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public List<WebElement> getOptions(String locator, int timeout) {
		// TODO Auto-generated method stub
		return getOptions(locator,timeout,"");
	}

	/**
	 * @Override
	 * @Description: 获取下拉框中的所有元素
	 * @param locator
	 * @return
	 */
	public List<WebElement> getOptions(String locator) {
		// TODO Auto-generated method stub
		return getOptions(locator,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: 获取所有选中的元素
	 * @param locator
	 * @param timeout
	 * @param log
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator, int timeout,
			String log) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		Log.info("getAllSelectedOptions【"+locator+"】is Done"+log);
		return select.getAllSelectedOptions();
	}

	/**
	 * @Override
	 * @Description: 获取所有选中的元素
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator, int timeout) {
		// TODO Auto-generated method stub
		return getAllSelectedOptions(locator,timeout,"");
	}

	/**
	 * @Override
	 * @Description: 获取所有选中的元素
	 * @param locator
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator) {
		// TODO Auto-generated method stub
		return getAllSelectedOptions(locator,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: 获取第一个或者当前选中的选项
	 * @param locator
	 * @param timeout
	 * @param log
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator, int timeout,
			String log) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		Log.info("getFirstSelectedOption【"+locator+"】is Done"+log);
		return select.getFirstSelectedOption();
	}

	/**
	 * @Override
	 * @Description: 获取第一个或者当前选中的选项
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator, int timeout) {
		// TODO Auto-generated method stub
		return getFirstSelectedOption(locator,timeout,"");
	}

	/**
	 * @Override
	 * @Description: 获取第一个或者当前选中的选项
	 * @param locator
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator) {
		// TODO Auto-generated method stub
		return getFirstSelectedOption(locator,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: 选择和text匹配的选项
	 * @param locator
	 * @param text
	 * @param timeout
	 */
	public void selectByVisibleText(String locator, String text, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.selectByVisibleText(text);
		Log.info("selectByVisibleText【"+locator+"】is Done");
		
		
	}

	/**
	 * @Override
	 * @Description: 选择和text匹配的选项
	 * @param locator
	 * @param text
	 */
	public void selectByVisibleText(String locator, String text) {
		// TODO Auto-generated method stub
		selectByVisibleText(locator,text,timeOut);
		
	}

	/**
	 * @Override
	 * @Description: 根据index选择option
	 * @param locator
	 * @param index
	 * @param timeout
	 */
	public void selectByIndex(String locator, int index, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.selectByIndex(index);
		Log.info("selectByIndex【"+locator+"】is Done");
		
	}

	/**
	 * @Override
	 * @Description: 根据index选择option
	 * @param locator
	 * @param index
	 */
	public void selectByIndex(String locator, int index) {
		// TODO Auto-generated method stub
		selectByIndex(locator,index,timeOut);
	}

	/**
	 * @Override
	 * @Description: 根据value选择option
	 * @param locator
	 * @param value
	 * @param timeout
	 */
	public void selectByValue(String locator, String value, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.selectByValue(value);
		Log.info("selectByValue【"+locator+"】is Done");
		
	}

	/**
	 * @Override
	 * @Description: 根据value选择option
	 * @param locator
	 * @param value
	 */
	public void selectByValue(String locator, String value) {
		// TODO Auto-generated method stub
		selectByValue(locator,value,timeOut);
	}

	/**
	 * @Override
	 * @Description: 清空复选框所有选项
	 * @param locator
	 * @param timeout
	 */
	public void deselectAll(String locator, int timeout) {
		//// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.deselectAll();
		Log.info("deselectAll【"+locator+"】is Done");
	}

	/**
	 * @Override
	 * @Description: 清空复选框所有选项
	 * @param locator
	 */
	public void deselectAll(String locator) {
		// TODO Auto-generated method stub
		deselectAll(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: 清空复选框所有匹配value的选项
	 * @param locator
	 * @param value
	 * @param timeout
	 */
	public void deselectByValue(String locator, String value, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.deselectByValue(value);
		Log.info("deselectByValue【"+locator+"】is Done");
	}

	/**
	 * @Override
	 * @Description:清空复选框所有匹配value的选项
	 * @param locator
	 * @param value
	 */
	public void deselectByValue(String locator, String value) {
		// TODO Auto-generated method stub
		deselectByValue(locator,value,timeOut);
	}

	/**
	 * @Override
	 * @Description: 清除复选框第index个选项
	 * @param locator
	 * @param index
	 * @param timeout
	 */
	public void deselectByIndex(String locator, int index, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.deselectByIndex(index);
		Log.info("deselectByIndex【"+locator+"】is Done");
	}

	/**
	 * @Override
	 * @Description: 清除复选框第index个选项
	 * @param locator
	 * @param index
	 */
	public void deselectByIndex(String locator, int index) {
		// TODO Auto-generated method stub
		deselectByIndex(locator,index,timeOut);
	}

	/**
	 * @Override
	 * @Description: 空复选框所有匹配text的选项
	 * @param locator
	 * @param text
	 * @param timeout
	 */
	public void deselectByVisibleText(String locator, String text, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.deselectByVisibleText(text);
		Log.info("deselectByIndex【"+locator+"】is Done");
	}

	/**
	 * @Override
	 * @Description: 空复选框所有匹配text的选项
	 * @param locator
	 * @param text
	 */
	public void deselectByVisibleText(String locator, String text) {
		// TODO Auto-generated method stub
		deselectByVisibleText(locator,text,timeOut);
	}
	
	
}
