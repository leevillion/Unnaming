package com.zlshuo.selenium.nonaming.driverinstance;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.zlshuo.selenium.nonaming.operation.IActionsOperation;
import com.zlshuo.selenium.nonaming.operation.IAssertOperation;
import com.zlshuo.selenium.nonaming.operation.IElementOperation;
import com.zlshuo.selenium.nonaming.operation.ISelectElementOperation;
import com.zlshuo.selenium.nonaming.operation.IWindowOperation;

/**
 * 测试常用操作方法,click,clear,sendsKey等
 * 方法中没有timeout参数的，默认去config.xml中timeout的值
 * 
 * @author leshuo
 * @version 2014年4月27日
 */
public class DriverInstance implements IWindowOperation,IElementOperation
				,ISelectElementOperation,IActionsOperation,IAssertOperation{
	
	private IWindowOperation windowOperation=null;
	private IElementOperation elementOperation=null;
	private ISelectElementOperation selectElementOperation=null;
	private IActionsOperation actionsOperation=null;
	private IAssertOperation assertOperation=null;
	
	public DriverInstance(){
		
	}
	
	public void inject(IWindowOperation windowOperation,IElementOperation elementOperation,
			ISelectElementOperation selectElementOperation,
			IActionsOperation actionsOperation,IAssertOperation assertOperation){
		this.windowOperation=windowOperation;
		this.elementOperation=elementOperation;
		this.selectElementOperation=selectElementOperation;
		this.actionsOperation=actionsOperation;
		this.assertOperation=assertOperation;
	}

	/**
	 * @Description: 访问url
	 * @param url
	 */
	public void get(String url) {
		// TODO Auto-generated method stub
		windowOperation.get(url);
	}

	/**
	 * @Description: 得到当前浏览器窗口的url地址
	 * @return url地址
	 */
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return windowOperation.getCurrentUrl();
	}

	/**
	 * @Description: 得到当前浏览器页面的title
	 * @return title
	 */
	public String getTitle() {
		// TODO Auto-generated method stub
		return windowOperation.getTitle();
	}

	/**
	 * @Description: 保留原有findElements方法，返回元素列表
	 * @param by selenium原生的获取元素方式,by.xpath,by.id等
	 * @return 元素列表
	 */
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return windowOperation.findElements(by);
	}

	/**
	 * @Description: 保留原有findElements方法，返回页面元素
	 * @param by selenium原生的获取元素方式,by.xpath,by.id等
	 * @return 页面元素
	 */
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return windowOperation.findElement(by);
	}

	/**
	 * @Description: 得到页面源码
	 * @return 页面源码
	 */
	public String getPageSource() {
		// TODO Auto-generated method stub
		return windowOperation.getPageSource();
	}

	/**
	 * @Description: 关闭driver指向的窗口
	 */
	public void close() {
		// TODO Auto-generated method stub
		windowOperation.close();
	}

	/**
	 * @Description: 退出driver
	 */
	public void quit() {
		// TODO Auto-generated method stub
		windowOperation.quit();
	}

	/**
	 * @Description: 得到driver打开的所有窗口handles
	 * @return
	 */
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return windowOperation.getWindowHandles();
	}

	/**
	 * @Description: 得到driver指向的当前窗口handle
	 * @return handle字符串
	 */
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return windowOperation.getWindowHandle();
	}

	/**
	 * @Description: 继承自WebDriver
	 * @return
	 */
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return windowOperation.switchTo();
	}

	/**
	 * @Description: 继承自WebDriver
	 * @return
	 */
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return windowOperation.navigate();
	}

	/**
	 * @Description: 继承自WebDriver
	 * @return
	 */
	public Options manage() {
		// TODO Auto-generated method stub
		return windowOperation.manage();
	}

	/**
	 * @Description: 判断条件是否是真
	 * @param condition condition=true,Pass;condition=false,fail中断
	 * @param log 操作日志
	 */
	public void assertTrue(Boolean condition, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertTrue(condition, log);
	}

	/**
	 * @Description: 判断条件是否是真,isContinue=true时断言失败脚本继续执行
	 * @param condition condition=true,Pass;condition=false,fail中断
	 * @param log 操作日志
	 * @param isContinue 断言失败是否继续执行脚本
	 */
	public void assertTrue(Boolean condition, String log, Boolean isContinue) {
		// TODO Auto-generated method stub
		assertOperation.assertTrue(condition, log, isContinue);
	}

	/**
	 * @Description: 判断条件是否是假
	 * @param condition condition=false,Pass;condition=true,fail中断
	 * @param log 操作日志
	 */
	public void assertFlase(Boolean condition, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertFlase(condition, log);
	}

	/**
	 * @Description: 判断条件是否是假 ,isContinue=true时断言失败脚本继续执行
	 * @param condition condition=false,Pass;condition=true,fail中断
	 * @param log 操作日志
	 * @param isContinue 断言失败是否继续执行脚本
	 */
	public void assertFlase(Boolean condition, String log, Boolean isContinue) {
		// TODO Auto-generated method stub
		assertOperation.assertFlase(condition, log, isContinue);
	}

	/**
	 * @Description: 判断两个int型数据是否相等
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertEquals(int actual, int expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertEquals(actual, expected, log);
	}

	/**
	 * @Description: 判断两个float型数据是否相等
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertEquals(float actual, float expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertEquals(actual, expected, log);
	}

	/**
	 * @Description: 判断两个double型数据是否相等
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertEquals(double actual, double expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertEquals(actual, expected, log);
	}

	/**
	 * @Description: 判断两个string型数据是否相等
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertEquals(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertEquals(actual, expected, log);
	}

	/**
	 * @Description: 判断参数是否为null
	 * @param object
	 * @param log 操作日志
	 */
	public void assertNull(Object object, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNull(object, log);
	}

	/**
	 * @Description: 判断参数是否不为null
	 * @param object
	 * @param log 操作日志
	 */
	public void assertNotNull(Object object, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotNull(object, log);
	}

	/**
	 * @Description: 判断两个int型数据是否不相等，不想等则pass
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertNotEquals(int actual, int expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotEquals(actual, expected, log);
	}

	/**
	 * @Description: 判断两个float型数据是否不相等，不想等则pass
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertNotEquals(float actual, float expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotEquals(actual, expected, log);
	}

	/**
	 * @Description: 判断两个double型数据是否不相等，不想等则pass
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertNotEquals(double actual, double expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotEquals(actual, expected, log);
	}

	/**
	 * @Description: 判断两个String型数据是否不相等，不想等则pass
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertNotEquals(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotEquals(actual, expected, log);
	}

	/**
	 * @Description: 判断actual是否被expected包含
	 * @param actual 实际结果
	 * @param expected 预期结果 
	 * @param log 操作日志
	 */
	public void assertContains(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertContains(actual, expected, log);
	}

	/**
	 * @Description: 判断actual是否没有被expected包含，若expected不包含则pass
	 * @param actual 实际结果
	 * @param expected 预期结果
	 * @param log 操作日志
	 */
	public void assertNotContains(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotContains(actual, expected, log);
	}

	/**
	 * @Description: 模拟键盘操作，按下某个键.Keys.SHIFT是按下shift键
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param theKey
	 * @param timeout 超时时间 超时时间
	 * @param log 操作日志
	 */
	public void keyDown(String locator, Keys theKey, int timeout, String log) {
		// TODO Auto-generated method stub
		actionsOperation.keyDown(locator, theKey, timeout, log);
	}

	/**
	 * @Description: 模拟键盘操作，按下某个键.Keys.SHIFT是按下shift键
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param theKey
	 * @param timeout 超时时间
	 */
	public void keyDown(String locator, Keys theKey, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.keyDown(locator, theKey, timeout);
	}

	/**
	 * @Description: 模拟键盘操作，按下某个键.Keys.SHIFT是按下shift键
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param theKey
	 */
	public void keyDown(String locator, Keys theKey) {
		// TODO Auto-generated method stub
		actionsOperation.keyDown(locator, theKey);
	}

	/**
	 * @Description: 取消keyDown的按下 状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param theKey
	 * @param timeout 超时时间
	 * @param log 操作日志
	 */
	public void keyUp(String locator, Keys theKey, int timeout, String log) {
		// TODO Auto-generated method stub
		actionsOperation.keyUp(locator, theKey, timeout, log);
	}

	/**
	 * @Description: 取消keyDown的按下 状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param theKey
	 * @param timeout 超时时间
	 */
	public void keyUp(String locator, Keys theKey, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.keyUp(locator, theKey, timeout);
	}

	/**
	 * @Description: 取消keyDown的按下 状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param theKey
	 */
	public void keyUp(String locator, Keys theKey) {
		// TODO Auto-generated method stub
		actionsOperation.keyUp(locator, theKey);
	}

	/**
	 * @Description: 鼠标左键点击并保持点击状态
	 * @param locator 元素定位器，默认使用xpath定位  元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 */
	public void clickAndHold(String locator, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.clickAndHold(locator, timeout);
	}

	/**
	 * @Description: 释放clickAndHold锁定的元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 */
	public void release(String locator, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.release(locator, timeout);
	}

	/**
	 * @Description: 鼠标左键双击
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 */
	public void doubleClick(String locator, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.doubleClick(locator, timeout);
	}

	/**
	 * @Description: 移动到元素中部位置
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @param log 操作日志
	 */
	public void moveToElement(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		actionsOperation.moveToElement(locator, timeout, log);
	}

	/**
	 * @Description: 移动到元素中部位置
	 * @param locator 元素定位器，默认使用xpath定位
	 */
	public void moveToElement(String locator) {
		// TODO Auto-generated method stub
		actionsOperation.moveToElement(locator);
	}

	/**
	 * @Description: 
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param xOffset x轴坐标
	 * @param yOffset y轴坐标
	 * @param timeout 超时时间
	 */
	public void moveToElement(String locator, int xOffset, int yOffset,
			int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.moveToElement(locator, xOffset, yOffset, timeout);
	}

	/**
	 * @Description: 
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param xOffset x轴坐标
	 * @param yOffset y轴坐标
	 */
	public void moveToElement(String locator, int xOffset, int yOffset) {
		// TODO Auto-generated method stub
		actionsOperation.moveToElement(locator, xOffset, yOffset);
	}

	/**
	 * @Description: 拖拽locator1元素至locator2元素
	 * @param locator1 元素定位器，默认使用xpath定位
	 * @param locator2 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @param log 操作日志
	 */
	public void dragAndDrop(String locator1, String locator2, int timeout,
			String log) {
		// TODO Auto-generated method stub
		actionsOperation.dragAndDrop(locator1, locator2, timeout, log);
	}

	/**
	 * @Description: 拖拽元素至指定坐标
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param xOffset x轴坐标
	 * @param yOffset y轴坐标
	 * @param timeout 超时时间
	 * @param log 操作日志
	 */
	public void dragAndDropBy(String locator, int xOffset, int yOffset,
			int timeout, String log) {
		// TODO Auto-generated method stub
		actionsOperation.dragAndDropBy(locator, xOffset, yOffset, timeout, log);
	}

	/**
	 * @Description: 判断元素是否是复选框
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return
	 */
	public Boolean isMultiple(String locator, int timeout) {
		// TODO Auto-generated method stub
		return selectElementOperation.isMultiple(locator, timeout);
	}

	/**
	 * @Description: 判断元素是否是复选框
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public Boolean isMultiple(String locator) {
		// TODO Auto-generated method stub
		return selectElementOperation.isMultiple(locator);
	}

	/**
	 * @Description: 获取所有下拉框元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @param log 操作日志
	 * @return
	 */
	public List<WebElement> getOptions(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		return selectElementOperation.getOptions(locator, timeout, log);
	}

	/**
	 * @Description: 获取所有下拉框元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return
	 */
	public List<WebElement> getOptions(String locator, int timeout) {
		// TODO Auto-generated method stub
		return selectElementOperation.getOptions(locator, timeout);
	}

	/**
	 * @Description: 获取所有下拉框元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public List<WebElement> getOptions(String locator) {
		// TODO Auto-generated method stub
		return selectElementOperation.getOptions(locator);
	}

	/**
	 * @Description: 获取所有选中的下拉框元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @param log 操作日志
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator, int timeout,
			String log) {
		// TODO Auto-generated method stub
		return selectElementOperation.getAllSelectedOptions(locator, timeout, log);
	}

	/**
	 * @Description: 获取所有选中的下拉框元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator, int timeout) {
		// TODO Auto-generated method stub
		return selectElementOperation.getAllSelectedOptions(locator, timeout);
	}

	/**
	 * @Description: 获取所有选中的下拉框元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator) {
		// TODO Auto-generated method stub
		return selectElementOperation.getAllSelectedOptions(locator);
	}

	/**
	 * @Description: 获取第一个选中的元素，一般是默认选中的元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @param log 操作日志
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator, int timeout,
			String log) {
		// TODO Auto-generated method stub
		return selectElementOperation.getFirstSelectedOption(locator, timeout, log);
	}

	/**
	 * @Description: 获取第一个选中的元素，一般是默认选中的元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator, int timeout) {
		// TODO Auto-generated method stub
		return selectElementOperation.getFirstSelectedOption(locator, timeout);
	}

	/**
	 * @Description: 获取第一个选中的元素，一般是默认选中的元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator) {
		// TODO Auto-generated method stub
		return selectElementOperation.getFirstSelectedOption(locator);
	}

	/**
	 * @Description: 根据文本获取下拉框选项
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param text 
	 * @param timeout 超时时间
	 */
	public void selectByVisibleText(String locator, String text, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByVisibleText(locator, text, timeout);
	}

	/**
	 * @Description: 根据文本获取下拉框选项
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param text
	 */
	public void selectByVisibleText(String locator, String text) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByVisibleText(locator, text);
	}

	/**
	 * @Description: 根据顺序获取下拉框选项
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param index
	 * @param timeout 超时时间
	 */
	public void selectByIndex(String locator, int index, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByIndex(locator, index, timeout);
	}

	/**
	 * @Description: 根据顺序获取下拉框选项
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param index
	 */
	public void selectByIndex(String locator, int index) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByIndex(locator, index);
	}

	/**
	 * @Description: 根据Value获取下拉框选项
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param value
	 * @param timeout 超时时间
	 */
	public void selectByValue(String locator, String value, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByValue(locator, value, timeout);
	}

	/**
	 * @Description: 根据Value获取下拉框选项
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param value
	 */
	public void selectByValue(String locator, String value) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByValue(locator, value);
	}

	/**
	 * @Description: 清楚所有选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 */
	public void deselectAll(String locator, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectAll(locator, timeout);
	}

	/**
	 * @Description: 清楚所有选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 */
	public void deselectAll(String locator) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectAll(locator);
	}

	/**
	 * @Description: 清楚所有值=value的选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param value
	 * @param timeout 超时时间
	 */
	public void deselectByValue(String locator, String value, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByValue(locator, value, timeout);
	}

	/**
	 * @Description: 清楚所有值=value的选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param value
	 */
	public void deselectByValue(String locator, String value) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByValue(locator, value);
	}

	/**
	 * @Description: 清楚指定index的选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param index
	 * @param timeout 超时时间
	 */
	public void deselectByIndex(String locator, int index, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByIndex(locator, index, timeout);
	}

	/**
	 * @Description: 清楚指定index的选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param index
	 */
	public void deselectByIndex(String locator, int index) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByIndex(locator, index);
	}

	/**
	 * @Description: 清楚文本内容等于text的选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param text
	 * @param timeout 超时时间
	 */
	public void deselectByVisibleText(String locator, String text, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByVisibleText(locator, text, timeout);
	}

	/**
	 * @Description: 清楚文本内容等于text的选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param text
	 */
	public void deselectByVisibleText(String locator, String text) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByVisibleText(locator, text);
	}

	/**
	 * @Description: 清空输入框内容
	 * @param locator 元素定位器，默认使用xpath定位
	 */
	public void clear(String locator) {
		// TODO Auto-generated method stub
		elementOperation.clear(locator);
	}

	/**
	 * @Description: 清空输入框内容
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 */
	public void clear(String locator, int timeout) {
		// TODO Auto-generated method stub
		elementOperation.clear(locator, timeout);
	}

	/**
	 * @Description: 鼠标单击
	 * @param locator 元素定位器，默认使用xpath定位
	 */
	public void click(String locator) {
		// TODO Auto-generated method stub
		elementOperation.click(locator);
	}

	/**
	 * @Description: 鼠标单击
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 */
	public void click(String locator, int timeout) {
		// TODO Auto-generated method stub
		elementOperation.click(locator, timeout);
	}

	/**
	 * @Description: 鼠标单击
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param log 操作日志
	 */
	public void click(String locator, String log) {
		// TODO Auto-generated method stub
		elementOperation.click(locator, log);
	}

	/**
	 * @Description: 鼠标单击
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @param log 操作日志
	 */
	public void click(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		elementOperation.click(locator, timeout, log);
	}

	/**
	 * @Description: 向元素输入文本
	 * @param isClear
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @param log 操作日志
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator, int timeout,
			String log, CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(isClear, locator, timeout, log, keysToSend);
	}

	/**
	 * @Description:  向元素输入文本
	 * @param isClear
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator, int timeout,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(isClear, locator, timeout, keysToSend);
	}

	/**
	 * @Description:  向元素输入文本
	 * @param isClear
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param log 操作日志
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator, String log,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(isClear, locator, log, keysToSend);
	}

	/**
	 * @Description: 向元素输入文本
	 * @param isClear
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(isClear, locator, keysToSend);
	}

	/**
	 * @Description: 向元素输入文本
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param log 操作日志
	 * @param keysToSend
	 */
	public void sendsKeys(String locator, String log,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(locator, log, keysToSend);
	}

	/**
	 * @Description: 检查页面元素是否存在
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param log 操作日志
	 * @param timeout 超时时间
	 * @return
	 */
	public Boolean check(String locator, String log, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.check(locator, log, timeout);
	}

	/**
	 * @Description: 检查页面元素是否存在
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param log 操作日志
	 * @return
	 */
	public Boolean check(String locator, String log) {
		// TODO Auto-generated method stub
		return elementOperation.check(locator, log);
	}

	/**
	 * @Description: 检查页面元素是否存在
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public Boolean check(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.check(locator);
	}

	/**
	 * @Description: 检查页面元素是否存在
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return
	 */
	public Boolean check(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.check(locator, timeout);
	}

	/**
	 * @Description: 获取元素属性
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param attribute
	 * @param timeout 超时时间
	 * @return
	 */
	public String getAttribute(String locator, String attribute, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getAttribute(locator, attribute, timeout);
	}

	/**
	 * @Description: 获取元素属性
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param attribute
	 * @return
	 */
	public String getAttribute(String locator, String attribute) {
		// TODO Auto-generated method stub
		return elementOperation.getAttribute(locator, attribute);
	}

	/**
	 * @Description: 获取元素css属性
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param css
	 * @return
	 */
	public String getCssValue(String locator, String css) {
		// TODO Auto-generated method stub
		return elementOperation.getCssValue(locator, css);
	}

	/**
	 * @Description: 获取元素css属性
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param css
	 * @param timeout 超时时间
	 * @return
	 */
	public String getCssValue(String locator, String css, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getCssValue(locator, css, timeout);
	}

	/**
	 * @Description: 获取元素坐标
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return int数组 int[0]表示x轴，int[1]表示y轴
	 */
	public int[] getLocation(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getLocation(locator, timeout);
	}

	/**
	 * @Description: 获取元素坐标
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return int数组 int[0]表示x轴，int[1]表示y轴
	 */
	public int[] getLocation(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getLocation(locator);
	}

	/**
	 * @Description: 获取元素大小
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return int数组 int[0]表示宽度，int[1]表示高度
	 */
	public int[] getSize(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getSize(locator, timeout);
	}

	/**
	 * @Description: 获取元素大小
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return int数组 int[0]表示宽度，int[1]表示高度
	 */
	public int[] getSize(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getSize(locator);
	}

	/**
	 * @Description: 获取元素标签名称
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public String getTagName(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getTagName(locator);
	}

	/**
	 * @Description: 获取元素标签名称
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return
	 */
	public String getTagName(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getTagName(locator, timeout);
	}

	/**
	 * @Description: 获取元素文本内容
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public String getText(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getText(locator);
	}

	/**
	 * @Description: 获取元素文本内容
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return
	 */
	public String getText(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getText(locator, timeout);
	}

	/**
	 * @Description: 当输入元素位于form中时，可以直接使用此方法提交数据
	 * @param locator 元素定位器，默认使用xpath定位
	 */
	public void submit(String locator,String log,CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.submit(locator,log,keysToSend);
	}

	/**
	 * @Description: 当输入元素位于form中时，可以直接使用此方法提交数据
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 */
	public void submit(String locator,String log,int timeout,CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.submit(locator, log, timeout, keysToSend);
	}

	/**
	 * @Description: 获取元素个数
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return
	 */
	public int getElementCount(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getElementCount(locator, timeout);
	}

	/**
	 * @Description: 获取元素个数
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public int getElementCount(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getElementCount(locator);
	}

	/**
	 * @Description: 判断元素是否可见
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public Boolean isDisplayed(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.isDisplayed(locator);
	}

	/**
	 * @Description: 判断元素是否处于选中状态
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return
	 */
	public Boolean isSelected(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.isSelected(locator);
	}

	/**
	 * @Description: 访问config.xml中url字段指定的链接
	 */
	public void get() {
		// TODO Auto-generated method stub
		windowOperation.get();
	}

	/**
	 * @Description: 以列表形式返回driver打开的窗口handle
	 * @return
	 */
	public List<String> getWindowHandlesList() {
		// TODO Auto-generated method stub
		return windowOperation.getWindowHandlesList();
	}

	/**
	 * @Description: 增加cookie
	 * @param cookie cookie类 cookie类
	 */
	public void addCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		windowOperation.addCookie(cookie);
	}

	/**
	 * @Description: 删除cookie
	 * @param cookie cookie类
	 */
	public void deleteCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		windowOperation.deleteCookie(cookie);
	}

	/**
	 * @Description: 删除所有cookie
	 */
	public void deleteAllCookies() {
		// TODO Auto-generated method stub
		windowOperation.deleteAllCookies();
	}

	/**
	 * @Description: 获取所有cookie
	 * @return
	 */
	public Set<Cookie> getCookies() {
		// TODO Auto-generated method stub
		return windowOperation.getCookies();
	}

	/**
	 * @Description: 获取cookie
	 * @param name cookie的name
	 * @return
	 */
	public Cookie getCookieNamed(String name) {
		// TODO Auto-generated method stub
		return windowOperation.getCookieNamed(name);
	}

	/**
	 * @Description: 删除cookie
	 * @param name cookie的name
	 */
	public void deleteCookieNamed(String name) {
		// TODO Auto-generated method stub
		windowOperation.deleteCookieNamed(name);
	}

	/**
	 * @Description: 设置等待页面完全加载的时间，超过时间页面还没有全部加载完毕则抛出异常
	 * @param time
	 */
	public void pageLoadTimeout(int time) {
		// TODO Auto-generated method stub
		windowOperation.pageLoadTimeout(time);
	}

	/**
	 * @Description:设置异步脚本执行的超时时间 
	 * @param time
	 */
	public void setScriptTimeout(int time) {
		// TODO Auto-generated method stub
		windowOperation.setScriptTimeout(time);
	}

	/**
	 * @Description: 设置等待元素的超时时间，一般不用
	 * @param time
	 */
	public void implicitlyWait(int time) {
		// TODO Auto-generated method stub
		windowOperation.implicitlyWait(time);
	}

	/**
	 * @Description: 切换frame
	 * @param index frame的index
	 */
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		windowOperation.switchToFrame(index);
	}

	/**
	 * @Description: 切换frame
	 * @param nameOrId frame的name或id
	 */
	public void switchToFrame(String nameOrId) {
		// TODO Auto-generated method stub
		windowOperation.switchToFrame(nameOrId);
	}

	/**
	 * @Description: 切换frame
	 * @param frameElement
	 */
	public void switchToFrame(WebElement frameElement) {
		// TODO Auto-generated method stub
		windowOperation.switchToFrame(frameElement);
	}

	/**
	 * @Description: 切换窗口
	 * @param name 窗口名称 包含关系即可
	 */
	public void switchToWindow(String name) {
		// TODO Auto-generated method stub
		windowOperation.switchToWindow(name);
	}

	/**
	 * @Description: 切换窗口
	 * @param index 打开一个窗口加1，只有一个窗口时，index=1，打开新窗口index=2
	 */
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		windowOperation.switchToWindow(index);
	}

	/**
	 * @Description: 前进浏览器
	 */
	public void forward() {
		// TODO Auto-generated method stub
		windowOperation.forward();
	}

	/**
	 * @Description: 后退浏览器
	 */
	public void back() {
		// TODO Auto-generated method stub
		windowOperation.back();
	}

	/**
	 * @Description: 同get(url)
	 * @param url
	 */
	public void to(String url) {
		// TODO Auto-generated method stub
		windowOperation.to(url);
	}

	/**
	 * @Description: 刷新页面
	 */
	public void refresh() {
		// TODO Auto-generated method stub
		windowOperation.refresh();
	}

	/**
	 * @Description: 间断重复刷新
	 * @param time 间隔时间单位是毫秒
	 * @param count 刷新次数
	 */
	public void refresh(int time, int count) {
		// TODO Auto-generated method stub
		windowOperation.refresh(time, count);
	}

	/**
	 * @Description: 设置窗口大小
	 * @param width
	 * @param height
	 */
	public void setSize(int width, int height) {
		// TODO Auto-generated method stub
		windowOperation.setSize(width, height);
	}

	/**
	 * @Description: 设置窗口位置
	 * @param x
	 * @param y
	 */
	public void setPosition(int x, int y) {
		// TODO Auto-generated method stub
		windowOperation.setPosition(x, y);
	}

	/**
	 * @Description: 获取窗口大小
	 * @return int数组 int[0]是高度，int[1]是宽度
	 */
	public int[] getSize() {
		// TODO Auto-generated method stub
		return windowOperation.getSize();
	}

	/**
	 * @Description: 获取窗口位置
	 * @return int数组 int[0]是x坐标，int[1]是y坐标
	 */
	public int[] getPosition() {
		// TODO Auto-generated method stub
		return windowOperation.getPosition();
	}

	/**
	 * @Description: 最大化当前窗口
	 */
	public void maximize() {
		// TODO Auto-generated method stub
		windowOperation.maximize();
	}

	/**
	 * @Description: 执行js，可以用来实现元素高亮
	 * @param jsCode js代码
	 * @param element 页面元素
	 */
	public void runJs(String jsCode, WebElement element) {
		// TODO Auto-generated method stub
		windowOperation.runJs(jsCode, element);
	}

	/**
	 * @Description: 执行js
	 * @param jsCode
	 */
	public void runJs(String jsCode) {
		// TODO Auto-generated method stub
		windowOperation.runJs(jsCode);
	}

	/**
	 * @Description: 执行有返回值的js代码
	 * @param jsCode
	 * @return
	 */
	public Object runJsReturn(String jsCode) {
		// TODO Auto-generated method stub
		return windowOperation.runJsReturn(jsCode);
	}

	/**
	 * @Description: 执行有返回值的js代码
	 * @param jsCode
	 * @param element
	 * @return
	 */
	public Object runJsReturn(String jsCode, WebElement element) {
		// TODO Auto-generated method stub
		return windowOperation.runJsReturn(jsCode, element);
	}

	/**
	 * @Description: 获取元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @param timeout 超时时间
	 * @return WebElement对象
	 */
	public WebElement findElement(String locator, int timeout) {
		// TODO Auto-generated method stub
		return windowOperation.findElement(locator, timeout);
	}

	/**
	 * @Description: 获取元素
	 * @param locator 元素定位器，默认使用xpath定位
	 * @return WebElement对象
	 */
	public WebElement findElement(String locator) {
		// TODO Auto-generated method stub
		return windowOperation.findElement(locator);
	}

	/**
	 * @Description: 退出所有frame
	 */
	public void exitAllFrame() {
		// TODO Auto-generated method stub
		windowOperation.exitAllFrame();
	}
}
