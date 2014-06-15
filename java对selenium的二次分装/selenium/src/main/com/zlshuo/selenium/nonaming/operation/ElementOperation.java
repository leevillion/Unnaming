package com.zlshuo.selenium.nonaming.operation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.zlshuo.selenium.nonaming.element.FindElementInTimeout;
import com.zlshuo.selenium.nonaming.tools.Log;
import com.zlshuo.selenium.nonaming.tools.ReadXml;

/**
 * Ԫ�ز���
 * @author leshuo
 * @version 2014��4��28��
 * 
 * ����������Լ��
 * <p>
 * <ul>
 * @param locator Ԫ�ض�λ��
 * @param timeout ��ʱʱ��
 * @param log ��������
 * <ul>
 * </p>
 */
public class ElementOperation extends FindElementInTimeout implements IElementOperation{
	
	private static final int timeOut=Integer.parseInt(ReadXml.getNodeValue("timeout"));
	/**
	 * ���캯����ʼ��driver
	 * @param driver
	 */
	public ElementOperation(WebDriver driver){
		super(driver);
	}

	/**
	 * @Override
	 * @Description: ���ҳ��Ԫ�أ���ʱʱ��ȡ��config.xml�е�timeout
	 * @param locator Ԫ�ض�λ��
	 */
	public void click(String locator) {
		// TODO Auto-generated method stub
		click(locator,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: ���ҳ��Ԫ��
	 * @param locator Ԫ�ض�λ��
	 * @param timeout ��ʱʱ��
	 */
	public void click(String locator, int timeout) {
		// TODO Auto-generated method stub
		click(locator,timeout,"");
	}

	/**
	 * @Override
	 * @Description: ���ҳ��Ԫ�أ���ʱʱ��ȡ��config.xml�е�timeout
	 * @param locator 
	 * @param log
	 */
	public void click(String locator, String log) {
		// TODO Auto-generated method stub
		click(locator,timeOut,log);
	}

	/**
	 * @Override
	 * @Description: ���ҳ��Ԫ��
	 * @param locator
	 * @param timeout
	 * @param log
	 */
	public void click(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		try{
			element.click();
			Log.info("click"+"��"+locator+"��"+"is Done."+log);
		}catch(Exception e){
			Log.error("click"+"��"+locator+"��"+e.getMessage());
			Assert.fail("click"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: ģ�ⰴ������
	 * @param isClear �Ƿ�������ǰ����������ݣ�true=���
	 * @param timeout
	 * @param log
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear,String locator,int timeout, String log,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		if(isClear){
			clear(locator);
		}
		try{
			element.sendKeys(keysToSend);
			Log.info("��"+locator+"��"+"sendsKeys is Done."+log);
		}catch(Exception e){
			Log.error("sendsKeys"+"��"+locator+"��"+e.getMessage());
			Assert.fail("sendsKeys"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: ģ�ⰴ������
	 * @param isClear �Ƿ�������ǰ����������ݣ�true=���
	 * @param timeout
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator,int timeout,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		sendsKeys(isClear,locator,timeout,"",keysToSend);
	}

	/**
	 * @Override
	 * @Description: ģ�ⰴ������
	 * @param isClear �Ƿ�������ǰ����������ݣ�true=���
	 * @param log
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator,String log,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		sendsKeys(isClear,locator,timeOut,log,keysToSend);
	}

	/**
	 * @Override
	 * @Description: ģ�ⰴ������
	 * @param isClear �Ƿ�������ǰ����������ݣ�true=���
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator,CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		sendsKeys(isClear,locator,timeOut,"",keysToSend);
	}

	/**
	 * @Override
	 * @Description: ģ�ⰴ������,����ǰ�������������
	 * @param log
	 * @param keysToSend
	 */
	public void sendsKeys(String locator,String log, CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		sendsKeys(false,locator,timeOut,log,keysToSend);
	}

	/**
	 * @Override
	 * @Description: ���ҳ��Ԫ���Ƿ���ڣ����ڷ���true�������ڷ���false
	 * @param locator
	 * @param log
	 * @param timeout
	 * @return
	 */
	public Boolean check(String locator, String log, int timeout) {
		// TODO Auto-generated method stub
		Boolean checkElement=null;
		WebElement element=null;
		element=getElement(locator,timeout);
		if(element==null){
			checkElement=false;
		}else
			checkElement=true;
		Log.info("check"+"��"+locator+"��"+"is Done."+log);
		return checkElement;
	}

	/**
	 * @Override
	 * @Description: ���ҳ��Ԫ���Ƿ���ڣ����ڷ���true�������ڷ���false
	 * @param locator
	 * @param log
	 * @return
	 */
	public Boolean check(String locator, String log) {
		// TODO Auto-generated method stub
		return check(locator,log,timeOut);
	}

	/**
	 * @Override
	 * @Description: ���ҳ��Ԫ���Ƿ���ڣ����ڷ���true�������ڷ���false
	 * @param locator
	 * @return
	 */
	public Boolean check(String locator) {
		// TODO Auto-generated method stub
		return check(locator,"",timeOut);
	}

	/**
	 * @Override
	 * @Description: ���ҳ��Ԫ���Ƿ���ڣ����ڷ���true�������ڷ���false
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public Boolean check(String locator, int timeout) {
		// TODO Auto-generated method stub
		return check(locator,"",timeout);
	}

	/**
	 * @Override
	 * @Description: ���Ԫ������ֵ
	 * @param locator
	 * @param attribute ��������
	 * @param timeout
	 * @return
	 */
	public String getAttribute(String locator, String attribute, int timeout) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		String attr=null;
		try{
			attr=element.getAttribute(attribute);
			Log.info("��"+locator+"��"+"getAttribute is Done,the attribute"+attribute+"'s value is"+attr);
		}catch(Exception e){
			Log.error("getAttribute"+"��"+locator+"��"+e.getMessage());
			Assert.fail("getAttribute"+"��"+locator+"��"+e.getMessage());
		}
		return attr;
	}

	/**
	 * @Override
	 * @Description: ���Ԫ������ֵ
	 * @param locator
	 * @param attribute ��������
	 * @return
	 */
	public String getAttribute(String locator, String attribute) {
		// TODO Auto-generated method stub
		return getAttribute(locator,attribute,timeOut);
	}

	/**
	 * @Override
	 * @Description: ���Ԫ��css����ֵ
	 * @param locator
	 * @param css css��������
	 * @return
	 */
	public String getCssValue(String locator, String css) {
		// TODO Auto-generated method stub
		return getCssValue(locator,css,timeOut);
	}

	/**
	 * @Override
	 * @Description: ���Ԫ��css����ֵ
	 * @param locator
	 * @param css css��������
	 * @param timeout
	 * @return
	 */
	public String getCssValue(String locator, String css, int timeout) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		String cssValue=null;
		try{
			cssValue=element.getCssValue(css);
			Log.info("��"+locator+"��"+"getCssValue is Done,the attribute"+css+"'s value is"+cssValue);
		}catch(Exception e){
			Log.error("getCssValue"+"��"+locator+"��"+e.getMessage());
			Assert.fail("getCssValue"+"��"+locator+"��"+e.getMessage());
		}
		return cssValue;
	}

	/**
	 * @Override
	 * @Description: ��ȡԪ������
	 * @param locator
	 * @param timeout
	 * @return �±�0��X���꣬1��Y����
	 */
	@SuppressWarnings("null")
	public int[] getLocation(String locator, int timeout) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		int[] location=null;
		Point p=null;
		try{
			p=element.getLocation();
			location[0]=p.getX();
			location[1]=p.getY();
			Log.info("��"+locator+"��"+"getLocation is Done");
		}catch(Exception e){
			Log.error("getLocation"+"��"+locator+"��"+e.getMessage());
			Assert.fail("getLocation"+"��"+locator+"��"+e.getMessage());
		}
		return location;
	}

	/**
	 * @Override
	 * @Description: ��ȡԪ������
	 * @param locator
	 * @return �±�0��X���꣬1��Y����
	 */
	public int[] getLocation(String locator) {
		// TODO Auto-generated method stub
		return getLocation(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: ��ȡԪ�سߴ��С
	 * @param locator
	 * @param timeout
	 * @return �±�0�ǿ�1�Ǹ�
	 */
	@SuppressWarnings("null")
	public int[] getSize(String locator, int timeout) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		int[] size=null;
		Dimension d=null;
		try{
			d=element.getSize();
			size[0]=d.getWidth();
			size[1]=d.getHeight();
			Log.info("��"+locator+"��"+"getSize is Done");
		}catch(Exception e){
			Log.error("getSize"+"��"+locator+"��"+e.getMessage());
			Assert.fail("getSize"+"��"+locator+"��"+e.getMessage());
		}
		return size;
	}

	/**
	 * @Override
	 * @Description: ��ȡԪ�سߴ��С
	 * @param locator
	 * @return �±�0�ǿ�1�Ǹ�
	 */
	public int[] getSize(String locator) {
		// TODO Auto-generated method stub
		return getSize(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: ��ȡ��ǩ����
	 * @param locator
	 * @return
	 */
	public String getTagName(String locator) {
		// TODO Auto-generated method stub
		return getTagName(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: ��ȡ��ǩ����
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public String getTagName(String locator, int timeout) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		String tagName=null;
		try{
			tagName=element.getTagName();
			Log.info("��"+locator+"��"+"getTagName is Done,the tagName is"+tagName);
		}catch(Exception e){
			Log.error("getTagName"+"��"+locator+"��"+e.getMessage());
			Assert.fail("getTagName"+"��"+locator+"��"+e.getMessage());
		}
		return tagName;
	}

	/**
	 * @Override
	 * @Description: ��ȡ�ı�����
	 * @param locator
	 * @return
	 */
	public String getText(String locator) {
		// TODO Auto-generated method stub
		return getText(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: ��ȡ�ı�����
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public String getText(String locator, int timeout) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		String text=null;
		try{
			text=element.getText();
			Log.info("��"+locator+"��"+"getText is Done,the tagName is"+text);
		}catch(Exception e){
			Log.error("getText"+"��"+locator+"��"+e.getMessage());
			Assert.fail("getText"+"��"+locator+"��"+e.getMessage());
		}
		return text;
	}

	/**
	 * @Override
	 * @Description: ����form�е������ύ
	 * @param locator
	 */
	public void submit(String locator,String log,CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		submit(locator,log,timeOut,keysToSend);
	}

	/**
	 * @Override
	 * @Description: ����form�е������ύ
	 * @param locator
	 * @param timeout
	 */
	public void submit(String locator,String log,int timeout,CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		WebElement element=getElement(locator,timeout);
		try{
			element.sendKeys(keysToSend);
			element.submit();
			Log.info("submit"+"��"+locator+"��"+"is Done");
		}catch(Exception e){
			Log.error("submit"+"��"+locator+"��"+e.getMessage());
			Assert.fail("submit"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: ��ȡԪ�ظ���
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public int getElementCount(String locator, int timeout) {
		// TODO Auto-generated method stub
		int count=0;
		if(!check(locator,"",timeout))
			Assert.fail("Ԫ��"+"��"+locator+"��������");
		else{
			String[] splitLocator=locator.split("\\$");
			if(splitLocator.length>1){
				if(splitLocator[0].equals("id"))
					count=driver.findElements(By.id(splitLocator[1])).size();
				else if(splitLocator[0].equals("name"))
					count=driver.findElements(By.name(splitLocator[1])).size();
				else if(splitLocator[0].equals("class"))
					count=driver.findElements(By.className(splitLocator[1])).size();
				else if(splitLocator[0].equals("css"))
					count=driver.findElements(By.cssSelector(splitLocator[1])).size();
				else if(splitLocator[0].equals("linkText"))
					count=driver.findElements(By.linkText(splitLocator[1])).size();
				else if(splitLocator[0].equals("partialLinkText"))
					count=driver.findElements(By.partialLinkText(splitLocator[1])).size();
				else if(splitLocator[0].equals("tagName"))
					count=driver.findElements(By.tagName(splitLocator[1])).size();
				else{
					Log.error("û������"+"��"+locator+"��"+"Ԫ�ض�λ��");
					Assert.fail("��"+locator+"��"+"���ֶ�λ��ʽ������");	
				}
										
			}else
				count=driver.findElements(By.xpath(splitLocator[1])).size();
		}
			
		return count;
	}

	/**
	 * @Override
	 * @Description: ��ȡԪ�ظ���
	 * @param locator
	 * @return
	 */
	public int getElementCount(String locator) {
		// TODO Auto-generated method stub
		return getElementCount(locator,timeOut);
	}

	/**
	 * @Override
	 * @Description: 
	 * @param locator
	 * @return
	 */
	public Boolean isDisplayed(String locator) {
		// TODO Auto-generated method stub
		Boolean dis=null;
		String[] splitLocator=locator.split("\\$");
		if(splitLocator.length>1){
			if(splitLocator[0].equals("id"))
				dis=driver.findElement(By.id(splitLocator[1])).isDisplayed();
			else if(splitLocator[0].equals("name"))
				dis=driver.findElement(By.name(splitLocator[1])).isDisplayed();
			else if(splitLocator[0].equals("class"))
				dis=driver.findElement(By.className(splitLocator[1])).isDisplayed();
			else if(splitLocator[0].equals("css"))
				dis=driver.findElement(By.cssSelector(splitLocator[1])).isDisplayed();
			else if(splitLocator[0].equals("linkText"))
				dis=driver.findElement(By.linkText(splitLocator[1])).isDisplayed();
			else if(splitLocator[0].equals("partialLinkText"))
				dis=driver.findElement(By.partialLinkText(splitLocator[1])).isDisplayed();
			else if(splitLocator[0].equals("tagName"))
				dis=driver.findElement(By.tagName(splitLocator[1])).isDisplayed();
			else{
				Log.error("û������"+"��"+locator+"��"+"Ԫ�ض�λ��");
				Assert.fail("��"+locator+"��"+"���ֶ�λ��ʽ������");	
			}
									
		}else
			dis=driver.findElement(By.xpath(splitLocator[1])).isDisplayed();
		return dis;
	}

	/**
	 * @Override
	 * @Description: 
	 * @param locator
	 * @return
	 */
	public Boolean isSelected(String locator) {
		// TODO Auto-generated method stub
		Boolean select=null;
		String[] splitLocator=locator.split("\\$");
		if(splitLocator.length>1){
			if(splitLocator[0].equals("id"))
				select=driver.findElement(By.id(splitLocator[1])).isSelected();
			else if(splitLocator[0].equals("name"))
				select=driver.findElement(By.name(splitLocator[1])).isSelected();
			else if(splitLocator[0].equals("class"))
				select=driver.findElement(By.className(splitLocator[1])).isSelected();
			else if(splitLocator[0].equals("css"))
				select=driver.findElement(By.cssSelector(splitLocator[1])).isSelected();
			else if(splitLocator[0].equals("linkText"))
				select=driver.findElement(By.linkText(splitLocator[1])).isSelected();
			else if(splitLocator[0].equals("partialLinkText"))
				select=driver.findElement(By.partialLinkText(splitLocator[1])).isSelected();
			else if(splitLocator[0].equals("tagName"))
				select=driver.findElement(By.tagName(splitLocator[1])).isSelected();
			else{
				Log.error("û������"+"��"+locator+"��"+"Ԫ�ض�λ��");
				Assert.fail("��"+locator+"��"+"���ֶ�λ��ʽ������");	
			}
									
		}else
			select=driver.findElement(By.xpath(splitLocator[1])).isSelected();
		return select;
	}

	/**
	 * @Override
	 * @Description: ����ı�������
	 * @param locator
	 */
	public void clear(String locator) {
		// TODO Auto-generated method stub
		clear(locator,timeOut);
	}
	
	/**
	 * 
	 * @Override
	 * @Description: ����ı�������
	 * @param locator
	 * @param timeout
	 */
	public void clear(String locator,int timeout){
		WebElement element=getElement(locator,timeout);
		try{
			element.clear();
			Log.info("clear"+"��"+locator+"��"+"is Done");
		}catch(Exception e){
			Log.error("clear"+"��"+locator+"��"+e.getMessage());
			Assert.fail("clear"+"��"+locator+"��"+e.getMessage());
		}
	}

}
