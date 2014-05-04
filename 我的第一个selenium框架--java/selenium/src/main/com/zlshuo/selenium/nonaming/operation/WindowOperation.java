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
 * ���������
 * @author leshuo
 * @version 2014��4��27��
 */
public class WindowOperation extends FindElementInTimeout implements IWindowOperation{
	
	private static final int timeOut=Integer.parseInt(ReadXml.getNodeValue("timeout"));
	
	/**
	 * ���캯����ʼ��driver
	 * @param driver
	 */
	public WindowOperation(WebDriver driver){
		super(driver);
	}
	
	/**
	 * ����urlָ������
	 */
	public void get(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
		Log.info("get url:"+url);
		
	}
	
	/**
	 * ����config.xml��urlָ��������
	 */
	public void get() {
		// TODO Auto-generated method stub
		driver.get(ReadXml.getNodeValue("url"));	
	}
	
	/**
	 * ��ȡ��ǰ����url
	 */
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}
	
	/**
	 * ��ȡ��ǰ����title
	 */
	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	/**
	 * ����ҳ��Ԫ���б�
	 */
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return driver.findElements(by);
	}
	
	/**
	 * ����ҳ��Ԫ��
	 */
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return driver.findElement(by);
	}
	
	/**
	 * ��ȡҳ��Դ��
	 */
	public String getPageSource() {
		// TODO Auto-generated method stub
		return driver.getPageSource();
	}
	
	/**
	 * �رյ�ǰ����
	 */
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
		Log.info("����"+getTitle()+"�ر�");
		
	}
	
	/**
	 * �˳�driver
	 */
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
		Log.info("�˳�driver");
	}
	
	/**
	 * ��ȡ���д���handles
	 */
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return driver.getWindowHandles();
	}
	
	/**
	 * ��ȡ���д���handles,����list�ַ����б�
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
	 * ��ȡ��ǰ����handle
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
	 * ����cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#addCookie(org.openqa.selenium.Cookie)
	 */
	public void addCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		manage().addCookie(cookie);
	}
	
	/** 
	 * ɾ��ָ��cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#deleteCookie(org.openqa.selenium.Cookie)
	 */
	public void deleteCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		manage().deleteCookie(cookie);
	}
	
	/**
	 * ɾ������cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#deleteAllCookies()
	 */
	public void deleteAllCookies() {
		// TODO Auto-generated method stub
		manage().deleteAllCookies();
		Log.info("ɾ������cookie");
	}
	
	/**
	 * ��ȡ����cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#getCookies()
	 */
	public Set<Cookie> getCookies() {
		// TODO Auto-generated method stub
		return manage().getCookies();
	}
	
	/**
	 * ��ȡ����Ϊname��cookie
	 * @see com.zlshuo.selenium.nonaming.operation.IWindowOperation#getCookieNamed(java.lang.String)
	 */
	public Cookie getCookieNamed(String name) {
		// TODO Auto-generated method stub
		return manage().getCookieNamed(name);
	}
	
	/**
	 * ɾ��nameָ����cookie
	 */
	public void deleteCookieNamed(String name) {
		// TODO Auto-generated method stub
		manage().deleteCookieNamed(name);
	}
	
	/**
	 * @Description: ����ҳ����ȫ����ʱ��
	 * @param time ��ʱʱ�䵥λ��S
	 * @return void
	 */
	public void pageLoadTimeout(int time) {
		// TODO Auto-generated method stub
		manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		
	}
	
	/**
	 * @Description: �����첽�ű���ȫ����ʱ��
	 * @param time ��ʱʱ�䵥λ��S
	 * @return void
	 */
	public void setScriptTimeout(int time) {
		// TODO Auto-generated method stub
		manage().timeouts().setScriptTimeout(time, TimeUnit.SECONDS);
		
	}
	
	/**
	 * @Description: ʶ��ҳ��Ԫ�صĳ�ʱʱ��,һ��ȥconfig.xml�еĳ�ʱʱ��
	 * @param time ��ʱʱ�䵥λ��S
	 * @return void
	 */
	public void implicitlyWait(int time) {
		// TODO Auto-generated method stub
		manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	/**
	 * @Description: ����indexֵ�л�frame
	 * @param index frame��ҳ���е�index
	 * @return void
	 */
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(index);
		
	}
	
	/**
	 * @Description: ����name����id�л�frame
	 * @param nameOrId 
	 * @return void
	 */
	public void switchToFrame(String nameOrId) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(nameOrId);
		
	}
	
	/**
	 * @Description: ����Ԫ���л�frame
	 * @param frameElement 
	 * @return void
	 */
	public void switchToFrame(WebElement frameElement) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(frameElement);
		
	}
	
	/**
	 * @Description: ���ݴ��������л�����
	 * @param name �������ƣ������Ǵ���titleһ���ֵ�������Ψһ��ʶ 
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
	 * @Description: ���ݴ��ڵĴ���˳�����л�����
	 * @param index ��1��ʼ���¿��Ĵ���index=2���ٴ��¿�=3 
	 * @return void
	 */
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {  
			int windowNumber=getWindowHandlesList().size();
			if(windowNumber<=0){
				Assert.fail("������Ϊ0");
				Log.error("������Ϊ0");
			}else if(windowNumber==1)
				Log.warning("ֻ��һ�����������л�");
			else{  
				switchToWindow(getWindowHandlesList().get(index-1));  
		        } 
 
	    } catch (NoSuchWindowException e) {  
	        Log.error("Window: " + index + " cound not found!");  
	    }  
		
	}
	
	/**
	 * ǰ�������
	 */
	public void forward() {
		// TODO Auto-generated method stub
		driver.navigate().forward();
		
	}

	/**
	 * ���������
	 */
	public void back() {
		// TODO Auto-generated method stub
		driver.navigate().back();
		
	}

	/**
	 * ��תҳ�棬ͬget
	 */
	public void to(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
		
	}
	
	/**
	 * ˢ��ҳ��
	 */
	public void refresh() {
		// TODO Auto-generated method stub
		driver.navigate().refresh();
		
	}
	
	/**
	 * @Description: ����ظ�ˢ��
	 * @param time ���ʱ�䵥λ�Ǻ���
	 * @param count ˢ�´���
	 * @return void
	 */
	public void refresh(int time,int count){
		// TODO Auto-generated method stub
		for(int i=1;i<=count;i++){
			refresh();
			try {
				Thread.sleep(time);
				Log.info("ˢ��"+i+"��");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @Description: ���ô��ڸ߿�
	 * @param width ���
	 * @param height �߶�
	 * @return void
	 */
	public void setSize(int width, int height) {
		// TODO Auto-generated method stub
		Dimension dimension=new Dimension(width,height);
		try{
			driver.manage().window().setSize(dimension);
			Log.info("���ô��ڸ�:"+height+",��:"+width);
		}catch(Exception e){
			e.printStackTrace();
			Log.error(e.toString());
		}
	}
	
	/**
	 * @Description: ���ô����������Ļ���Ͻǵ�����
	 * @param x 
	 * @param y 
	 * @return void
	 */
	public void setPosition(int x, int y) {
		// TODO Auto-generated method stub
		Point point=new Point(x,y);
		try{
			driver.manage().window().setPosition(point);
			Log.info("����x:"+x+",y:"+y);
		}catch(Exception e){
			e.printStackTrace();
			Log.error(e.toString());
		}
		
	}
	
	/**
	 * @Description: ��ô��ڴ�С
	 * @return int����
	 */
	@SuppressWarnings("null")
	public int[] getSize() {
		// TODO Auto-generated method stub
		int[] string=null;
		try{
			Dimension dimension=driver.manage().window().getSize();
			string[0]=dimension.getHeight();
			string[1]=dimension.getWidth();
			Log.info("���ڸ�:"+string[0]+",��:"+string[1]);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return string;
	}
	
	/**
	 * @Description: ��ô���λ������
	 * @return int����
	 */
	@SuppressWarnings("null")
	public int[] getPosition() {
		// TODO Auto-generated method stub
		int[] string=null;
		try{
			Point point=driver.manage().window().getPosition();
			string[0]=point.getX();
			string[1]=point.getY();
			Log.info("����x:"+string[0]+",y:"+string[1]);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return string;
	}
	
	/**
	 * ��󻯴���
	 */
	public void maximize() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}

	/**
	 * @Description: ��Ԫ��element��ִ��js����,����:����Ԫ��
	 * @param jsCode js����
	 * @param element ҳ��Ԫ��
	 * @return void
	 */
	public void runJs(String jsCode, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(jsCode, element);
		
	}

	/**
	 * @Description: ִ��js����
	 * @param jsCode js����
	 * @return void
	 */
	public void runJs(String jsCode) {
		// TODO Auto-generated method stub
		Log.info("ִ��js����:"+jsCode);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(jsCode);
	}

	/**
	 * @Description: ִ���з��ص�js����
	 * @param jsCode js����
	 * @return Object
	 */
	public Object runJsReturn(String jsCode) {
		// TODO Auto-generated method stub
		Log.info("ִ��js����:"+jsCode);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript(jsCode);
	}
	
	/**
	 * @Description: ��Ԫ��element��ִ���з��ص�js����
	 * @param jsCode js����
	 * @param element ҳ��Ԫ��
	 * @return Object
	 */
	public Object runJsReturn(String jsCode,WebElement element){
		// TODO Auto-generated method stub
		Log.info("ִ��js����:"+jsCode);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        Object object=js.executeScript(jsCode,element);
        return object;
	}

	/**
	 * @Description: ��λҳ��Ԫ��
	 * @param locator ��λ��
	 * @return WebElement
	 */
	public WebElement findElement(String locator) {
		// TODO Auto-generated method stub
		return getElement(locator,timeOut);
	}
	
	/**
	 * @Description: ��λҳ��Ԫ��
	 * @param locator ��λ��
	 * @param timeout ��ʱʱ��
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
