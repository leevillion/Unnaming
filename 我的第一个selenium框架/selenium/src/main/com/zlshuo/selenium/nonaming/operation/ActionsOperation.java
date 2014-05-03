package com.zlshuo.selenium.nonaming.operation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.zlshuo.selenium.nonaming.element.FindElementInTimeout;
import com.zlshuo.selenium.nonaming.tools.Log;
import com.zlshuo.selenium.nonaming.tools.ReadXml;

/**
 * ģ����������˫������ק��
 * @author leshuo
 * @version 2014��5��2��
 */
public class ActionsOperation extends FindElementInTimeout implements IActionsOperation{
	
	private static final int timeOut=Integer.parseInt(ReadXml.getNodeValue("timeout"));
	/**
	 * @param driver
	 */
	public ActionsOperation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Override
	 * @Description: ���¼����ϵİ���
	 * @param locator
	 * @param theKey theKey=Keys.SHIFT��Ϊ����shift��
	 * @param timeout
	 * @param log
	 */
	public void keyDown(String locator, Keys theKey, int timeout, String log) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element=getElement(locator,timeout);
		try{
			actions.keyDown(element, theKey).perform();
			Log.info("keyDown"+"��"+locator+"��"+"is Done."+log);
		}catch(Exception e){
			Log.error("keyDown"+"��"+locator+"��"+e.getMessage());
			Assert.fail("keyDown"+"��"+locator+"��"+e.getMessage());
		}
		
	}

	/**
	 * @Override
	 * @Description: ���¼����ϵİ���
	 * @param locator
	 * @param theKey
	 * @param timeout
	 */
	public void keyDown(String locator, Keys theKey, int timeout) {
		// TODO Auto-generated method stub
		keyDown(locator,theKey,timeout,"");
	}

	/**
	 * @Override
	 * @Description: ���¼����ϵİ���
	 * @param locator
	 * @param theKey
	 */
	public void keyDown(String locator, Keys theKey) {
		// TODO Auto-generated method stub
		keyDown(locator,theKey,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: ȡ��keyDown������״̬
	 * @param locator
	 * @param theKey
	 * @param timeout
	 * @param log
	 */
	public void keyUp(String locator, Keys theKey, int timeout, String log) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element=getElement(locator,timeout);
		try{
			actions.keyUp(element, theKey).perform();
			Log.info("keyUp"+"��"+locator+"��"+"is Done."+log);
		}catch(Exception e){
			Log.error("keyUp"+"��"+locator+"��"+e.getMessage());
			Assert.fail("keyUp"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: ȡ��keyDown������״̬
	 * @param locator
	 * @param theKey
	 * @param timeout
	 */
	public void keyUp(String locator, Keys theKey, int timeout) {
		// TODO Auto-generated method stub
		keyUp(locator,theKey,timeout,"");
	}

	/**
	 * @Override
	 * @Description: ȡ��keyDown������״̬
	 * @param locator
	 * @param theKey
	 */
	public void keyUp(String locator, Keys theKey) {
		// TODO Auto-generated method stub
		keyUp(locator,theKey,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: ���������
	 * @param locator
	 * @param timeout
	 */
	public void clickAndHold(String locator, int timeout) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element=getElement(locator,timeout);
		try{
			actions.clickAndHold(element).perform();
			Log.info("clickAndHold"+"��"+locator+"��"+"is Done.");
		}catch(Exception e){
			Log.error("clickAndHold"+"��"+locator+"��"+e.getMessage());
			Assert.fail("clickAndHold"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: �ͷ����������Ч��
	 * @param locator
	 * @param timeout
	 */
	public void release(String locator, int timeout) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element=getElement(locator,timeout);
		try{
			actions.release(element).perform();
			Log.info("release"+"��"+locator+"��"+"is Done.");
		}catch(Exception e){
			Log.error("release"+"��"+locator+"��"+e.getMessage());
			Assert.fail("release"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: ������˫��
	 * @param locator
	 * @param timeout
	 */
	public void doubleClick(String locator, int timeout) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element=getElement(locator,timeout);
		try{
			actions.doubleClick(element).perform();
			Log.info("doubleClick"+"��"+locator+"��"+"is Done.");
		}catch(Exception e){
			Log.error("doubleClick"+"��"+locator+"��"+e.getMessage());
			Assert.fail("doubleClick"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: �ƶ���굽Ԫ���м�
	 * @param locator
	 * @param timeout
	 * @param log
	 */
	public void moveToElement(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element=getElement(locator,timeout);
		try{
			actions.moveToElement(element).perform();
			Log.info("moveToElement"+"��"+locator+"��"+"is Done."+log);
		}catch(Exception e){
			Log.error("moveToElement"+"��"+locator+"��"+e.getMessage());
			Assert.fail("moveToElement"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: �ƶ���굽Ԫ���м�
	 * @param locator
	 */
	public void moveToElement(String locator) {
		// TODO Auto-generated method stub
		moveToElement(locator,timeOut,"");
	}

	/**
	 * @Override
	 * @Description: �ƶ���굽ָ������λ��
	 * @param locator
	 * @param xOffset
	 * @param yOffset
	 * @param timeout
	 */
	public void moveToElement(String locator, int xOffset, int yOffset,
			int timeout) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element=getElement(locator,timeout);
		try{
			actions.moveToElement(element, xOffset, yOffset).perform();
			Log.info("moveToElement"+"��"+locator+"��"+"is Done.");
		}catch(Exception e){
			Log.error("moveToElement"+"��"+locator+"��"+e.getMessage());
			Assert.fail("moveToElement"+"��"+locator+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: �ƶ���굽ָ������λ��
	 * @param locator
	 * @param xOffset
	 * @param yOffset
	 */
	public void moveToElement(String locator, int xOffset, int yOffset) {
		// TODO Auto-generated method stub
		moveToElement(locator,xOffset,yOffset,timeOut);
	}

	/**
	 * @Override
	 * @Description: ��ק���ͷŵ��״̬
	 * @param locator1
	 * @param locator2
	 * @param timeout
	 * @param log
	 */
	public void dragAndDrop(String locator1, String locator2, int timeout,
			String log) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element1=getElement(locator1,timeout);
		WebElement element2=getElement(locator2,timeout);
		try{
			actions.dragAndDrop(element1, element2).perform();
			Log.info("drag"+"��"+locator1+"��to��"+locator2+"��"+"is Done.");
		}catch(Exception e){
			Log.error("drag"+"��"+locator1+"��to��"+locator2+"��"+e.getMessage());
			Assert.fail("drag"+"��"+locator1+"��to��"+locator2+"��"+e.getMessage());
		}
	}

	/**
	 * @Override
	 * @Description: ��ק
	 * @param locator1
	 * @param xOffset
	 * @param yOffset
	 * @param timeout
	 * @param log
	 */
	public void dragAndDropBy(String locator, int xOffset, int yOffset,
			int timeout, String log) {
		// TODO Auto-generated method stub
		Actions actions=new Actions(driver);
		WebElement element=getElement(locator,timeout);
		try{
			actions.dragAndDropBy(element, xOffset, yOffset).perform();
			Log.info("dragAndDropBy"+"��"+locator+"��to"+xOffset+yOffset+"is Done.");
		}catch(Exception e){
			Log.error("dragAndDropBy"+"��"+locator+"��to"+xOffset+yOffset+e.getMessage());
			Assert.fail("dragAndDropBy"+"��"+locator+"��to"+xOffset+yOffset+e.getMessage());
		}
	}

}
