package com.zlshuo.selenium.nonaming.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.zlshuo.selenium.nonaming.element.FindElementInTimeout;
import com.zlshuo.selenium.nonaming.tools.Log;
import com.zlshuo.selenium.nonaming.tools.ReadXml;

/**
 * 浏览器操作
 * @author leshuo
 * @version 2014年4月27日
 */
public class WindowOperation extends FindElementInTimeout implements IWindowOperation{
	
	private static final int timeOut=Integer.parseInt(ReadXml.getNodeValue("timeout"));
	
	/**
	 * 构造函数初始化driver
	 * @param driver
	 */
	public WindowOperation(WebDriver driver){
		super(driver);
	}
	
	/**
	 * 访问url指定链接
	 */
	public void get(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
		Log.info("get url:"+url);
		
	}
	
	/**
	 * 访问config.xml中url指定的连接
	 */
	public void get() {
		// TODO Auto-generated method stub
		driver.get(ReadXml.getNodeValue("url"));	
	}
	
	/**
	 * 获取当前窗口url
	 */
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}
	
	/**
	 * 获取当前窗口title
	 */
	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	/**
	 * 返回页面元素列表
	 */
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return driver.findElements(by);
	}
	
	/**
	 * 返回页面元素
	 */
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return driver.findElement(by);
	}
	
	/**
	 * 获取页面源码
	 */
	public String getPageSource() {
		// TODO Auto-generated method stub
		return driver.getPageSource();
	}
	
	/**
	 * 关闭当前窗口
	 */
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
		Log.info("窗口"+getTitle()+"关闭");
		
	}
	
	/**
	 * 退出driver
	 */
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
		Log.info("退出driver");
	}
	
	/**
	 * 获取所有窗口handles
	 */
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return driver.getWindowHandles();
	}
	
	/**
	 * 获取所有窗口handles,返回list字符串列表
	 */
	public List<String> getWindowHandlesList() {
		// TODO Auto-generated method stub
		Set<String> handles = getWindowHandles();
		List<String> list=new ArrayList<String>();
		for (String s : handles){
			list.add(s);
		}
		return list;
	}
	
	/**
	 * 获取当前窗口handle
	 */
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return driver.getWindowHandle();
	}
	
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return driver.switchTo();
	}
	
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return driver.navigate();
	}
	
	public Options manage() {
		// TODO Auto-generated method stub
		return driver.manage();
	}
	
	
	/**
	 * 增加cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#addCookie(org.openqa.selenium.Cookie)
	 */
	public void addCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		manage().addCookie(cookie);
	}
	
	/** 
	 * 删除指定cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#deleteCookie(org.openqa.selenium.Cookie)
	 */
	public void deleteCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		manage().deleteCookie(cookie);
	}
	
	/**
	 * 删除所有cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#deleteAllCookies()
	 */
	public void deleteAllCookies() {
		// TODO Auto-generated method stub
		manage().deleteAllCookies();
		Log.info("删除所有cookie");
	}
	
	/**
	 * 获取所有cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#getCookies()
	 */
	public Set<Cookie> getCookies() {
		// TODO Auto-generated method stub
		return manage().getCookies();
	}
	
	/**
	 * 获取名称为name的cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#getCookieNamed(java.lang.String)
	 */
	public Cookie getCookieNamed(String name) {
		// TODO Auto-generated method stub
		return manage().getCookieNamed(name);
	}
	
	/**
	 * 删除name指定的cookie
	 */
	public void deleteCookieNamed(String name) {
		// TODO Auto-generated method stub
		manage().deleteCookieNamed(name);
	}
	
	/**
	 * @Description: 设置页面完全加载时间
	 * @param time 超时时间单位是S
	 * @return void
	 */
	public void pageLoadTimeout(int time) {
		// TODO Auto-generated method stub
		manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		
	}
	
	/**
	 * @Description: 设置异步脚本完全加载时间
	 * @param time 超时时间单位是S
	 * @return void
	 */
	public void setScriptTimeout(int time) {
		// TODO Auto-generated method stub
		manage().timeouts().setScriptTimeout(time, TimeUnit.SECONDS);
		
	}
	
	/**
	 * @Description: 识别页面元素的超时时间,一般去config.xml中的超时时间
	 * @param time 超时时间单位是S
	 * @return void
	 */
	public void implicitlyWait(int time) {
		// TODO Auto-generated method stub
		manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	/**
	 * @Description: 根据index值切换frame
	 * @param index frame在页面中的index
	 * @return void
	 */
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(index);
		
	}
	
	/**
	 * @Description: 根据name或者id切换frame
	 * @param nameOrId 
	 * @return void
	 */
	public void switchToFrame(String nameOrId) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(nameOrId);
		
	}
	
	/**
	 * @Description: 根据元素切换frame
	 * @param frameElement 
	 * @return void
	 */
	public void switchToFrame(WebElement frameElement) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(frameElement);
		
	}
	
	/**
	 * @Description: 根据窗口名称切换窗口
	 * @param name 窗口名称，可以是窗口title一部分但必须是唯一标识 
	 * @return void
	 */
	public void switchToWindow(String name) {
		try {  
	        String currentHandle = getWindowHandle();  
	        Set<String> handles = getWindowHandles();  
	        for (String s : handles) {  
	            if (s.equals(currentHandle))  
	                continue;  
	            else {  
	                driver.switchTo().window(s);  
	                if (getTitle().contains(name)) {  
	                	Log.info("Switch to window: "+ getTitle() + " successfully!");
	                    break;  
	                } else  
	                    continue;  
	            }  
	        }  
	    } catch (NoSuchWindowException e) {  
	        Log.error("Window: " + name + " cound not found!");  
	    }  
	}

	/**
	 * @Description: 根据窗口的创建顺序来切换窗口
	 * @param index 从1开始，新开的窗口index=2，再次新开=3 
	 * @return void
	 */
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {  
			int windowNumber=getWindowHandlesList().size();
			if(windowNumber<=0){
				Assert.fail("窗口数为0");
				Log.error("窗口数为0");
			}else if(windowNumber==1)
				Log.warning("只有一个窗口无需切换");
			else{  
				switchToWindow(getWindowHandlesList().get(index-1));  
		        } 
 
	    } catch (NoSuchWindowException e) {  
	        Log.error("Window: " + index + " cound not found!");  
	    }  
		
	}
	
	/**
	 * 前进浏览器
	 */
	public void forward() {
		// TODO Auto-generated method stub
		driver.navigate().forward();
		
	}

	/**
	 * 后退浏览器
	 */
	public void back() {
		// TODO Auto-generated method stub
		driver.navigate().back();
		
	}

	/**
	 * 跳转页面，同get
	 */
	public void to(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
		
	}
	
	/**
	 * 刷新页面
	 */
	public void refresh() {
		// TODO Auto-generated method stub
		driver.navigate().refresh();
		
	}
	
	/**
	 * @Description: 间断重复刷新
	 * @param time 间隔时间单位是毫秒
	 * @param count 刷新次数
	 * @return void
	 */
	public void refresh(int time,int count){
		// TODO Auto-generated method stub
		for(int i=1;i<=count;i++){
			refresh();
			try {
				Thread.sleep(time);
				Log.info("刷新"+i+"次");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @Description: 设置窗口高宽
	 * @param width 宽度
	 * @param height 高度
	 * @return void
	 */
	public void setSize(int width, int height) {
		// TODO Auto-generated method stub
		Dimension dimension=new Dimension(width,height);
		try{
			driver.manage().window().setSize(dimension);
			Log.info("设置窗口高:"+height+",宽:"+width);
		}catch(Exception e){
			e.printStackTrace();
			Log.error(e.toString());
		}
	}
	
	/**
	 * @Description: 设置窗口相对于屏幕左上角的坐标
	 * @param x 
	 * @param y 
	 * @return void
	 */
	public void setPosition(int x, int y) {
		// TODO Auto-generated method stub
		Point point=new Point(x,y);
		try{
			driver.manage().window().setPosition(point);
			Log.info("坐标x:"+x+",y:"+y);
		}catch(Exception e){
			e.printStackTrace();
			Log.error(e.toString());
		}
		
	}
	
	/**
	 * @Description: 获得窗口大小
	 * @return int数组
	 */
	@SuppressWarnings("null")
	public int[] getSize() {
		// TODO Auto-generated method stub
		int[] string=null;
		try{
			Dimension dimension=driver.manage().window().getSize();
			string[0]=dimension.getHeight();
			string[1]=dimension.getWidth();
			Log.info("窗口高:"+string[0]+",宽:"+string[1]);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return string;
	}
	
	/**
	 * @Description: 获得窗口位置坐标
	 * @return int数组
	 */
	@SuppressWarnings("null")
	public int[] getPosition() {
		// TODO Auto-generated method stub
		int[] string=null;
		try{
			Point point=driver.manage().window().getPosition();
			string[0]=point.getX();
			string[1]=point.getY();
			Log.info("窗口x:"+string[0]+",y:"+string[1]);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return string;
	}
	
	/**
	 * 最大化窗口
	 */
	public void maximize() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}

	/**
	 * @Description: 在元素element上执行js代码,例如:高亮元素
	 * @param jsCode js代码
	 * @param element 页面元素
	 * @return void
	 */
	public void runJs(String jsCode, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(jsCode, element);
		
	}

	/**
	 * @Description: 执行js代码
	 * @param jsCode js代码
	 * @return void
	 */
	public void runJs(String jsCode) {
		// TODO Auto-generated method stub
		Log.info("执行js代码:"+jsCode);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(jsCode);
	}

	/**
	 * @Description: 执行有返回的js代码
	 * @param jsCode js代码
	 * @return Object
	 */
	public Object runJsReturn(String jsCode) {
		// TODO Auto-generated method stub
		Log.info("执行js代码:"+jsCode);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript(jsCode);
	}
	
	/**
	 * @Description: 在元素element上执行有返回的js代码
	 * @param jsCode js代码
	 * @param element 页面元素
	 * @return Object
	 */
	public Object runJsReturn(String jsCode,WebElement element){
		// TODO Auto-generated method stub
		Log.info("执行js代码:"+jsCode);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        Object object=js.executeScript(jsCode,element);
        return object;
	}

	/**
	 * @Description: 定位页面元素
	 * @param locator 定位器
	 * @return WebElement
	 */
	public WebElement findElement(String locator) {
		// TODO Auto-generated method stub
		return getElement(locator,timeOut);
	}
	
	/**
	 * @Description: 定位页面元素
	 * @param locator 定位器
	 * @param timeout 超时时间
	 * @return WebElement
	 */
	public WebElement findElement(String locator,int timeout){
		return getElement(locator,timeout);
	}

	/**
	 * @Description: 
	 */
	public void exitAllFrame() {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
	}

}
