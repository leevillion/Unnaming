package com.zlshuo.selenium.nonaming.operation;

/**
 * 页面元素操作接口
 * @author leshuo
 * @version 2014年4月28日
 */
public interface IElementOperation{
	
	public void clear(String locator);
	
	public void clear(String locator,int timeout);
	
	public void click(String locator);
	
	public void click(String locator,int timeout);
	
	public void click(String locator,String log);
	
	public void click(String locator,int timeout,String log);
	
	public void sendsKeys(Boolean isClear,String locator,int timeout,String log,CharSequence... keysToSend);
	
	public void sendsKeys(Boolean isClear,String locator,int timeout,CharSequence... keysToSend);
	
	public void sendsKeys(Boolean isClear,String locator,String log,CharSequence... keysToSend);
	
	public void sendsKeys(Boolean isClear,String locator,CharSequence... keysToSend);
	
	public void sendsKeys(String locator,String log,CharSequence... keysToSend);
	
	public Boolean check(String locator,String log,int timeout);
	
	public Boolean check(String locator,String log);
	
	public Boolean check(String locator);
	
	public Boolean check(String locator,int timeout);
	
	public String getAttribute(String locator,String attribute,int timeout);
	
	public String getAttribute(String locator,String attribute);
	
	public String getCssValue(String locator,String css);
	
	public String getCssValue(String locator,String css,int timeout);
	
	public int[] getLocation(String locator,int timeout);
	
	public int[] getLocation(String locator);
	
	public int[] getSize(String locator,int timeout);
	
	public int[] getSize(String locator);
	
	public String getTagName(String locator);
	
	public String getTagName(String locator,int timeout);
	
	public String getText(String locator);
	
	public String getText(String locator,int timeout);
	
	public void submit(String locator,String log,CharSequence... keysToSend);
	
	public void submit(String locator,String log,int timeout,CharSequence... keysToSend);
	
	public int getElementCount(String locator,int timeout);
	
	public int getElementCount(String locator);
	
	public Boolean isDisplayed(String locator);
	
	public Boolean isSelected(String locator);
	
}
