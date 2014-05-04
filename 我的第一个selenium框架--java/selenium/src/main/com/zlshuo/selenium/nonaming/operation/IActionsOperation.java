package com.zlshuo.selenium.nonaming.operation;

import org.openqa.selenium.Keys;

/**
 * @author leshuo
 * @version 2014Äê5ÔÂ2ÈÕ
 */
public interface IActionsOperation {
	
	public void keyDown(String locator,Keys theKey,int timeout,String log);
	
	public void keyDown(String locator,Keys theKey,int timeout);
	
	public void keyDown(String locator,Keys theKey);
	
	public void keyUp(String locator,Keys theKey,int timeout,String log);
	
	public void keyUp(String locator,Keys theKey,int timeout);
	
	public void keyUp(String locator,Keys theKey);
	
	public void clickAndHold(String locator,int timeout);
	
	public void release(String locator,int timeout);
	
	public void doubleClick(String locator,int timeout);
	
	public void moveToElement(String locator,int timeout,String log);
	
	public void moveToElement(String locator);
	
	public void moveToElement(String locator, int xOffset, int yOffset,int timeout);
	
	public void moveToElement(String locator, int xOffset, int yOffset);
	
	public void dragAndDrop(String locator1,String locator2,int timeout,String log);
	
	public void dragAndDropBy(String locator,int xOffset,int yOffset,int timeout,String log);
}
