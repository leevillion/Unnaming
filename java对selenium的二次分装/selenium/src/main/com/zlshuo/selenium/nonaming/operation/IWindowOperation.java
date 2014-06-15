package com.zlshuo.selenium.nonaming.operation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * window操作接口，继承WebDriver
 * 
 * @author leshuo
 * @version 2014年4月28日
 * 
 * @see org.openqa.selenium.WebDriver
 */
public interface IWindowOperation extends WebDriver{
	
	public void get();
	
	public List<String> getWindowHandlesList();
	
	public void addCookie(Cookie cookie);
	
	public void deleteCookie(Cookie cookie);
	
	public void deleteAllCookies();
	
	public Set<Cookie> getCookies();
	
	public Cookie getCookieNamed(String name);
	
	public void deleteCookieNamed(String name);
	
	public void pageLoadTimeout(int time);
	
	public void setScriptTimeout(int time);
	
	public void implicitlyWait(int time);
	
	public void switchToFrame(int index);
	
	public void switchToFrame(String nameOrId);
	
	public void switchToFrame(WebElement frameElement);
	
	public void switchToWindow(String name);
	
	public void switchToWindow(int index);
	
	public void forward();
	
	public void back();
	
	public void to(String url);
	
	public void refresh();
	
	public void refresh(int time,int count);
	
	public void setSize(int width,int height);
	
	public void setPosition(int x,int y);
	
	public int[] getSize();
	
	public int[] getPosition();
	
	public void maximize();
	
	public void runJs(String jsCode,WebElement element);
	
	public void runJs(String jsCode);
	
	public Object runJsReturn(String jsCode);
	
	public Object runJsReturn(String jsCode,WebElement element);
	
	public WebElement findElement(String locator,int timeout);
	
	public WebElement findElement(String locator);
	
	public void exitAllFrame();
}
