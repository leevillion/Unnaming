package com.zlshuo.selenium.nonaming.operation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.zlshuo.selenium.nonaming.element.FindElementInTimeout;
import com.zlshuo.selenium.nonaming.tools.Log;
import com.zlshuo.selenium.nonaming.tools.ReadXml;

/**
 * ���������
 * @author leshuo
 * @version 2014��5��1��
 */
public class SelectElementOperation extends FindElementInTimeout implements ISelectElementOperation{
	
	private static final int timeOut=Integer.parseInt(ReadXml.getNodeValue("timeout"));
	
	/**
	 * ���캯����ʼ��driver
	 * @param driver
	 */
	public SelectElementOperation(WebDriver driver){
		super(driver);
	}

	/**
	 * @Override
	 * @Description: ����Ƿ�Ϊ��ѡ��
	 * @param locator
	 * @param timeout
	 * @return ��ѡ�򷵻�true
	 */
	public Boolean isMultiple(String locator, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		return select.isMultiple();
	}

	/**
	 * @Override
	 * @Description: ����Ƿ�Ϊ��ѡ�򣬳�ʱʱ��ȡconfig.xml��timeout����ֵ
	 * @param locator
	 * @return ��ѡ�򷵻�true
	 */
	public Boolean isMultiple(String locator) {
		// TODO Auto-generated method stub
		return isMultiple(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: ��ȡ�������е�����Ԫ��
	 * @param locator
	 * @param timeout
	 * @param log
	 * @return
	 */
	public List<WebElement> getOptions(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		Log.info("getOptions��"+locator+"��is Done"+log);
		return select.getOptions();
	}

	/**
	 * @Override
	 * @Description: ��ȡ�������е�����Ԫ��
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
	 * @Description: ��ȡ�������е�����Ԫ��
	 * @param locator
	 * @return
	 */
	public List<WebElement> getOptions(String locator) {
		// TODO Auto-generated method stub
		return getOptions(locator,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: ��ȡ����ѡ�е�Ԫ��
	 * @param locator
	 * @param timeout
	 * @param log
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator, int timeout,
			String log) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		Log.info("getAllSelectedOptions��"+locator+"��is Done"+log);
		return select.getAllSelectedOptions();
	}

	/**
	 * @Override
	 * @Description: ��ȡ����ѡ�е�Ԫ��
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
	 * @Description: ��ȡ����ѡ�е�Ԫ��
	 * @param locator
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator) {
		// TODO Auto-generated method stub
		return getAllSelectedOptions(locator,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: ��ȡ��һ�����ߵ�ǰѡ�е�ѡ��
	 * @param locator
	 * @param timeout
	 * @param log
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator, int timeout,
			String log) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		Log.info("getFirstSelectedOption��"+locator+"��is Done"+log);
		return select.getFirstSelectedOption();
	}

	/**
	 * @Override
	 * @Description: ��ȡ��һ�����ߵ�ǰѡ�е�ѡ��
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
	 * @Description: ��ȡ��һ�����ߵ�ǰѡ�е�ѡ��
	 * @param locator
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator) {
		// TODO Auto-generated method stub
		return getFirstSelectedOption(locator,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: ѡ���textƥ���ѡ��
	 * @param locator
	 * @param text
	 * @param timeout
	 */
	public void selectByVisibleText(String locator, String text, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.selectByVisibleText(text);
		Log.info("selectByVisibleText��"+locator+"��is Done");
		
		
	}

	/**
	 * @Override
	 * @Description: ѡ���textƥ���ѡ��
	 * @param locator
	 * @param text
	 */
	public void selectByVisibleText(String locator, String text) {
		// TODO Auto-generated method stub
		selectByVisibleText(locator,text,timeOut);
		
	}

	/**
	 * @Override
	 * @Description: ����indexѡ��option
	 * @param locator
	 * @param index
	 * @param timeout
	 */
	public void selectByIndex(String locator, int index, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.selectByIndex(index);
		Log.info("selectByIndex��"+locator+"��is Done");
		
	}

	/**
	 * @Override
	 * @Description: ����indexѡ��option
	 * @param locator
	 * @param index
	 */
	public void selectByIndex(String locator, int index) {
		// TODO Auto-generated method stub
		selectByIndex(locator,index,timeOut);
	}

	/**
	 * @Override
	 * @Description: ����valueѡ��option
	 * @param locator
	 * @param value
	 * @param timeout
	 */
	public void selectByValue(String locator, String value, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.selectByValue(value);
		Log.info("selectByValue��"+locator+"��is Done");
		
	}

	/**
	 * @Override
	 * @Description: ����valueѡ��option
	 * @param locator
	 * @param value
	 */
	public void selectByValue(String locator, String value) {
		// TODO Auto-generated method stub
		selectByValue(locator,value,timeOut);
	}

	/**
	 * @Override
	 * @Description: ��ո�ѡ������ѡ��
	 * @param locator
	 * @param timeout
	 */
	public void deselectAll(String locator, int timeout) {
		//// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.deselectAll();
		Log.info("deselectAll��"+locator+"��is Done");
	}

	/**
	 * @Override
	 * @Description: ��ո�ѡ������ѡ��
	 * @param locator
	 */
	public void deselectAll(String locator) {
		// TODO Auto-generated method stub
		deselectAll(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: ��ո�ѡ������ƥ��value��ѡ��
	 * @param locator
	 * @param value
	 * @param timeout
	 */
	public void deselectByValue(String locator, String value, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.deselectByValue(value);
		Log.info("deselectByValue��"+locator+"��is Done");
	}

	/**
	 * @Override
	 * @Description:��ո�ѡ������ƥ��value��ѡ��
	 * @param locator
	 * @param value
	 */
	public void deselectByValue(String locator, String value) {
		// TODO Auto-generated method stub
		deselectByValue(locator,value,timeOut);
	}

	/**
	 * @Override
	 * @Description: �����ѡ���index��ѡ��
	 * @param locator
	 * @param index
	 * @param timeout
	 */
	public void deselectByIndex(String locator, int index, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.deselectByIndex(index);
		Log.info("deselectByIndex��"+locator+"��is Done");
	}

	/**
	 * @Override
	 * @Description: �����ѡ���index��ѡ��
	 * @param locator
	 * @param index
	 */
	public void deselectByIndex(String locator, int index) {
		// TODO Auto-generated method stub
		deselectByIndex(locator,index,timeOut);
	}

	/**
	 * @Override
	 * @Description: �ո�ѡ������ƥ��text��ѡ��
	 * @param locator
	 * @param text
	 * @param timeout
	 */
	public void deselectByVisibleText(String locator, String text, int timeout) {
		// TODO Auto-generated method stub
		Select select=new Select(getElement(locator,timeout));
		select.deselectByVisibleText(text);
		Log.info("deselectByIndex��"+locator+"��is Done");
	}

	/**
	 * @Override
	 * @Description: �ո�ѡ������ƥ��text��ѡ��
	 * @param locator
	 * @param text
	 */
	public void deselectByVisibleText(String locator, String text) {
		// TODO Auto-generated method stub
		deselectByVisibleText(locator,text,timeOut);
	}
	
	
}
