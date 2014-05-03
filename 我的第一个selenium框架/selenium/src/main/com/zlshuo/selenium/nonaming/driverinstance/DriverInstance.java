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
 * ���Գ��ò�������,click,clear,sendsKey��
 * ������û��timeout�����ģ�Ĭ��ȥconfig.xml��timeout��ֵ
 * 
 * @author leshuo
 * @version 2014��4��27��
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
	 * @Description: ����url
	 * @param url
	 */
	public void get(String url) {
		// TODO Auto-generated method stub
		windowOperation.get(url);
	}

	/**
	 * @Description: �õ���ǰ��������ڵ�url��ַ
	 * @return url��ַ
	 */
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return windowOperation.getCurrentUrl();
	}

	/**
	 * @Description: �õ���ǰ�����ҳ���title
	 * @return title
	 */
	public String getTitle() {
		// TODO Auto-generated method stub
		return windowOperation.getTitle();
	}

	/**
	 * @Description: ����ԭ��findElements����������Ԫ���б�
	 * @param by seleniumԭ���Ļ�ȡԪ�ط�ʽ,by.xpath,by.id��
	 * @return Ԫ���б�
	 */
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return windowOperation.findElements(by);
	}

	/**
	 * @Description: ����ԭ��findElements����������ҳ��Ԫ��
	 * @param by seleniumԭ���Ļ�ȡԪ�ط�ʽ,by.xpath,by.id��
	 * @return ҳ��Ԫ��
	 */
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return windowOperation.findElement(by);
	}

	/**
	 * @Description: �õ�ҳ��Դ��
	 * @return ҳ��Դ��
	 */
	public String getPageSource() {
		// TODO Auto-generated method stub
		return windowOperation.getPageSource();
	}

	/**
	 * @Description: �ر�driverָ��Ĵ���
	 */
	public void close() {
		// TODO Auto-generated method stub
		windowOperation.close();
	}

	/**
	 * @Description: �˳�driver
	 */
	public void quit() {
		// TODO Auto-generated method stub
		windowOperation.quit();
	}

	/**
	 * @Description: �õ�driver�򿪵����д���handles
	 * @return
	 */
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return windowOperation.getWindowHandles();
	}

	/**
	 * @Description: �õ�driverָ��ĵ�ǰ����handle
	 * @return handle�ַ���
	 */
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return windowOperation.getWindowHandle();
	}

	/**
	 * @Description: �̳���WebDriver
	 * @return
	 */
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return windowOperation.switchTo();
	}

	/**
	 * @Description: �̳���WebDriver
	 * @return
	 */
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return windowOperation.navigate();
	}

	/**
	 * @Description: �̳���WebDriver
	 * @return
	 */
	public Options manage() {
		// TODO Auto-generated method stub
		return windowOperation.manage();
	}

	/**
	 * @Description: �ж������Ƿ�����
	 * @param condition condition=true,Pass;condition=false,fail�ж�
	 * @param log ������־
	 */
	public void assertTrue(Boolean condition, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertTrue(condition, log);
	}

	/**
	 * @Description: �ж������Ƿ�����,isContinue=trueʱ����ʧ�ܽű�����ִ��
	 * @param condition condition=true,Pass;condition=false,fail�ж�
	 * @param log ������־
	 * @param isContinue ����ʧ���Ƿ����ִ�нű�
	 */
	public void assertTrue(Boolean condition, String log, Boolean isContinue) {
		// TODO Auto-generated method stub
		assertOperation.assertTrue(condition, log, isContinue);
	}

	/**
	 * @Description: �ж������Ƿ��Ǽ�
	 * @param condition condition=false,Pass;condition=true,fail�ж�
	 * @param log ������־
	 */
	public void assertFlase(Boolean condition, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertFlase(condition, log);
	}

	/**
	 * @Description: �ж������Ƿ��Ǽ� ,isContinue=trueʱ����ʧ�ܽű�����ִ��
	 * @param condition condition=false,Pass;condition=true,fail�ж�
	 * @param log ������־
	 * @param isContinue ����ʧ���Ƿ����ִ�нű�
	 */
	public void assertFlase(Boolean condition, String log, Boolean isContinue) {
		// TODO Auto-generated method stub
		assertOperation.assertFlase(condition, log, isContinue);
	}

	/**
	 * @Description: �ж�����int�������Ƿ����
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertEquals(int actual, int expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertEquals(actual, expected, log);
	}

	/**
	 * @Description: �ж�����float�������Ƿ����
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertEquals(float actual, float expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertEquals(actual, expected, log);
	}

	/**
	 * @Description: �ж�����double�������Ƿ����
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertEquals(double actual, double expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertEquals(actual, expected, log);
	}

	/**
	 * @Description: �ж�����string�������Ƿ����
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertEquals(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertEquals(actual, expected, log);
	}

	/**
	 * @Description: �жϲ����Ƿ�Ϊnull
	 * @param object
	 * @param log ������־
	 */
	public void assertNull(Object object, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNull(object, log);
	}

	/**
	 * @Description: �жϲ����Ƿ�Ϊnull
	 * @param object
	 * @param log ������־
	 */
	public void assertNotNull(Object object, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotNull(object, log);
	}

	/**
	 * @Description: �ж�����int�������Ƿ���ȣ��������pass
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertNotEquals(int actual, int expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotEquals(actual, expected, log);
	}

	/**
	 * @Description: �ж�����float�������Ƿ���ȣ��������pass
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertNotEquals(float actual, float expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotEquals(actual, expected, log);
	}

	/**
	 * @Description: �ж�����double�������Ƿ���ȣ��������pass
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertNotEquals(double actual, double expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotEquals(actual, expected, log);
	}

	/**
	 * @Description: �ж�����String�������Ƿ���ȣ��������pass
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertNotEquals(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotEquals(actual, expected, log);
	}

	/**
	 * @Description: �ж�actual�Ƿ�expected����
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ�� 
	 * @param log ������־
	 */
	public void assertContains(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertContains(actual, expected, log);
	}

	/**
	 * @Description: �ж�actual�Ƿ�û�б�expected��������expected��������pass
	 * @param actual ʵ�ʽ��
	 * @param expected Ԥ�ڽ��
	 * @param log ������־
	 */
	public void assertNotContains(String actual, String expected, String log) {
		// TODO Auto-generated method stub
		assertOperation.assertNotContains(actual, expected, log);
	}

	/**
	 * @Description: ģ����̲���������ĳ����.Keys.SHIFT�ǰ���shift��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param theKey
	 * @param timeout ��ʱʱ�� ��ʱʱ��
	 * @param log ������־
	 */
	public void keyDown(String locator, Keys theKey, int timeout, String log) {
		// TODO Auto-generated method stub
		actionsOperation.keyDown(locator, theKey, timeout, log);
	}

	/**
	 * @Description: ģ����̲���������ĳ����.Keys.SHIFT�ǰ���shift��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param theKey
	 * @param timeout ��ʱʱ��
	 */
	public void keyDown(String locator, Keys theKey, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.keyDown(locator, theKey, timeout);
	}

	/**
	 * @Description: ģ����̲���������ĳ����.Keys.SHIFT�ǰ���shift��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param theKey
	 */
	public void keyDown(String locator, Keys theKey) {
		// TODO Auto-generated method stub
		actionsOperation.keyDown(locator, theKey);
	}

	/**
	 * @Description: ȡ��keyDown�İ��� ״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param theKey
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 */
	public void keyUp(String locator, Keys theKey, int timeout, String log) {
		// TODO Auto-generated method stub
		actionsOperation.keyUp(locator, theKey, timeout, log);
	}

	/**
	 * @Description: ȡ��keyDown�İ��� ״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param theKey
	 * @param timeout ��ʱʱ��
	 */
	public void keyUp(String locator, Keys theKey, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.keyUp(locator, theKey, timeout);
	}

	/**
	 * @Description: ȡ��keyDown�İ��� ״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param theKey
	 */
	public void keyUp(String locator, Keys theKey) {
		// TODO Auto-generated method stub
		actionsOperation.keyUp(locator, theKey);
	}

	/**
	 * @Description: ��������������ֵ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ  Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 */
	public void clickAndHold(String locator, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.clickAndHold(locator, timeout);
	}

	/**
	 * @Description: �ͷ�clickAndHold������Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 */
	public void release(String locator, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.release(locator, timeout);
	}

	/**
	 * @Description: ������˫��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 */
	public void doubleClick(String locator, int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.doubleClick(locator, timeout);
	}

	/**
	 * @Description: �ƶ���Ԫ���в�λ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 */
	public void moveToElement(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		actionsOperation.moveToElement(locator, timeout, log);
	}

	/**
	 * @Description: �ƶ���Ԫ���в�λ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 */
	public void moveToElement(String locator) {
		// TODO Auto-generated method stub
		actionsOperation.moveToElement(locator);
	}

	/**
	 * @Description: 
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param xOffset x������
	 * @param yOffset y������
	 * @param timeout ��ʱʱ��
	 */
	public void moveToElement(String locator, int xOffset, int yOffset,
			int timeout) {
		// TODO Auto-generated method stub
		actionsOperation.moveToElement(locator, xOffset, yOffset, timeout);
	}

	/**
	 * @Description: 
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param xOffset x������
	 * @param yOffset y������
	 */
	public void moveToElement(String locator, int xOffset, int yOffset) {
		// TODO Auto-generated method stub
		actionsOperation.moveToElement(locator, xOffset, yOffset);
	}

	/**
	 * @Description: ��קlocator1Ԫ����locator2Ԫ��
	 * @param locator1 Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param locator2 Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 */
	public void dragAndDrop(String locator1, String locator2, int timeout,
			String log) {
		// TODO Auto-generated method stub
		actionsOperation.dragAndDrop(locator1, locator2, timeout, log);
	}

	/**
	 * @Description: ��קԪ����ָ������
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param xOffset x������
	 * @param yOffset y������
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 */
	public void dragAndDropBy(String locator, int xOffset, int yOffset,
			int timeout, String log) {
		// TODO Auto-generated method stub
		actionsOperation.dragAndDropBy(locator, xOffset, yOffset, timeout, log);
	}

	/**
	 * @Description: �ж�Ԫ���Ƿ��Ǹ�ѡ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public Boolean isMultiple(String locator, int timeout) {
		// TODO Auto-generated method stub
		return selectElementOperation.isMultiple(locator, timeout);
	}

	/**
	 * @Description: �ж�Ԫ���Ƿ��Ǹ�ѡ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public Boolean isMultiple(String locator) {
		// TODO Auto-generated method stub
		return selectElementOperation.isMultiple(locator);
	}

	/**
	 * @Description: ��ȡ����������Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 * @return
	 */
	public List<WebElement> getOptions(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		return selectElementOperation.getOptions(locator, timeout, log);
	}

	/**
	 * @Description: ��ȡ����������Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public List<WebElement> getOptions(String locator, int timeout) {
		// TODO Auto-generated method stub
		return selectElementOperation.getOptions(locator, timeout);
	}

	/**
	 * @Description: ��ȡ����������Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public List<WebElement> getOptions(String locator) {
		// TODO Auto-generated method stub
		return selectElementOperation.getOptions(locator);
	}

	/**
	 * @Description: ��ȡ����ѡ�е�������Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator, int timeout,
			String log) {
		// TODO Auto-generated method stub
		return selectElementOperation.getAllSelectedOptions(locator, timeout, log);
	}

	/**
	 * @Description: ��ȡ����ѡ�е�������Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator, int timeout) {
		// TODO Auto-generated method stub
		return selectElementOperation.getAllSelectedOptions(locator, timeout);
	}

	/**
	 * @Description: ��ȡ����ѡ�е�������Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(String locator) {
		// TODO Auto-generated method stub
		return selectElementOperation.getAllSelectedOptions(locator);
	}

	/**
	 * @Description: ��ȡ��һ��ѡ�е�Ԫ�أ�һ����Ĭ��ѡ�е�Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator, int timeout,
			String log) {
		// TODO Auto-generated method stub
		return selectElementOperation.getFirstSelectedOption(locator, timeout, log);
	}

	/**
	 * @Description: ��ȡ��һ��ѡ�е�Ԫ�أ�һ����Ĭ��ѡ�е�Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator, int timeout) {
		// TODO Auto-generated method stub
		return selectElementOperation.getFirstSelectedOption(locator, timeout);
	}

	/**
	 * @Description: ��ȡ��һ��ѡ�е�Ԫ�أ�һ����Ĭ��ѡ�е�Ԫ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public WebElement getFirstSelectedOption(String locator) {
		// TODO Auto-generated method stub
		return selectElementOperation.getFirstSelectedOption(locator);
	}

	/**
	 * @Description: �����ı���ȡ������ѡ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param text 
	 * @param timeout ��ʱʱ��
	 */
	public void selectByVisibleText(String locator, String text, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByVisibleText(locator, text, timeout);
	}

	/**
	 * @Description: �����ı���ȡ������ѡ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param text
	 */
	public void selectByVisibleText(String locator, String text) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByVisibleText(locator, text);
	}

	/**
	 * @Description: ����˳���ȡ������ѡ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param index
	 * @param timeout ��ʱʱ��
	 */
	public void selectByIndex(String locator, int index, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByIndex(locator, index, timeout);
	}

	/**
	 * @Description: ����˳���ȡ������ѡ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param index
	 */
	public void selectByIndex(String locator, int index) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByIndex(locator, index);
	}

	/**
	 * @Description: ����Value��ȡ������ѡ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param value
	 * @param timeout ��ʱʱ��
	 */
	public void selectByValue(String locator, String value, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByValue(locator, value, timeout);
	}

	/**
	 * @Description: ����Value��ȡ������ѡ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param value
	 */
	public void selectByValue(String locator, String value) {
		// TODO Auto-generated method stub
		selectElementOperation.selectByValue(locator, value);
	}

	/**
	 * @Description: �������ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 */
	public void deselectAll(String locator, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectAll(locator, timeout);
	}

	/**
	 * @Description: �������ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 */
	public void deselectAll(String locator) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectAll(locator);
	}

	/**
	 * @Description: �������ֵ=value��ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param value
	 * @param timeout ��ʱʱ��
	 */
	public void deselectByValue(String locator, String value, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByValue(locator, value, timeout);
	}

	/**
	 * @Description: �������ֵ=value��ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param value
	 */
	public void deselectByValue(String locator, String value) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByValue(locator, value);
	}

	/**
	 * @Description: ���ָ��index��ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param index
	 * @param timeout ��ʱʱ��
	 */
	public void deselectByIndex(String locator, int index, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByIndex(locator, index, timeout);
	}

	/**
	 * @Description: ���ָ��index��ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param index
	 */
	public void deselectByIndex(String locator, int index) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByIndex(locator, index);
	}

	/**
	 * @Description: ����ı����ݵ���text��ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param text
	 * @param timeout ��ʱʱ��
	 */
	public void deselectByVisibleText(String locator, String text, int timeout) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByVisibleText(locator, text, timeout);
	}

	/**
	 * @Description: ����ı����ݵ���text��ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param text
	 */
	public void deselectByVisibleText(String locator, String text) {
		// TODO Auto-generated method stub
		selectElementOperation.deselectByVisibleText(locator, text);
	}

	/**
	 * @Description: ������������
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 */
	public void clear(String locator) {
		// TODO Auto-generated method stub
		elementOperation.clear(locator);
	}

	/**
	 * @Description: ������������
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 */
	public void clear(String locator, int timeout) {
		// TODO Auto-generated method stub
		elementOperation.clear(locator, timeout);
	}

	/**
	 * @Description: ��굥��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 */
	public void click(String locator) {
		// TODO Auto-generated method stub
		elementOperation.click(locator);
	}

	/**
	 * @Description: ��굥��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 */
	public void click(String locator, int timeout) {
		// TODO Auto-generated method stub
		elementOperation.click(locator, timeout);
	}

	/**
	 * @Description: ��굥��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param log ������־
	 */
	public void click(String locator, String log) {
		// TODO Auto-generated method stub
		elementOperation.click(locator, log);
	}

	/**
	 * @Description: ��굥��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 */
	public void click(String locator, int timeout, String log) {
		// TODO Auto-generated method stub
		elementOperation.click(locator, timeout, log);
	}

	/**
	 * @Description: ��Ԫ�������ı�
	 * @param isClear
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @param log ������־
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator, int timeout,
			String log, CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(isClear, locator, timeout, log, keysToSend);
	}

	/**
	 * @Description:  ��Ԫ�������ı�
	 * @param isClear
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator, int timeout,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(isClear, locator, timeout, keysToSend);
	}

	/**
	 * @Description:  ��Ԫ�������ı�
	 * @param isClear
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param log ������־
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator, String log,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(isClear, locator, log, keysToSend);
	}

	/**
	 * @Description: ��Ԫ�������ı�
	 * @param isClear
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param keysToSend
	 */
	public void sendsKeys(Boolean isClear, String locator,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(isClear, locator, keysToSend);
	}

	/**
	 * @Description: ��Ԫ�������ı�
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param log ������־
	 * @param keysToSend
	 */
	public void sendsKeys(String locator, String log,
			CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.sendsKeys(locator, log, keysToSend);
	}

	/**
	 * @Description: ���ҳ��Ԫ���Ƿ����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param log ������־
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public Boolean check(String locator, String log, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.check(locator, log, timeout);
	}

	/**
	 * @Description: ���ҳ��Ԫ���Ƿ����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param log ������־
	 * @return
	 */
	public Boolean check(String locator, String log) {
		// TODO Auto-generated method stub
		return elementOperation.check(locator, log);
	}

	/**
	 * @Description: ���ҳ��Ԫ���Ƿ����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public Boolean check(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.check(locator);
	}

	/**
	 * @Description: ���ҳ��Ԫ���Ƿ����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public Boolean check(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.check(locator, timeout);
	}

	/**
	 * @Description: ��ȡԪ������
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param attribute
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public String getAttribute(String locator, String attribute, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getAttribute(locator, attribute, timeout);
	}

	/**
	 * @Description: ��ȡԪ������
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param attribute
	 * @return
	 */
	public String getAttribute(String locator, String attribute) {
		// TODO Auto-generated method stub
		return elementOperation.getAttribute(locator, attribute);
	}

	/**
	 * @Description: ��ȡԪ��css����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param css
	 * @return
	 */
	public String getCssValue(String locator, String css) {
		// TODO Auto-generated method stub
		return elementOperation.getCssValue(locator, css);
	}

	/**
	 * @Description: ��ȡԪ��css����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param css
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public String getCssValue(String locator, String css, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getCssValue(locator, css, timeout);
	}

	/**
	 * @Description: ��ȡԪ������
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return int���� int[0]��ʾx�ᣬint[1]��ʾy��
	 */
	public int[] getLocation(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getLocation(locator, timeout);
	}

	/**
	 * @Description: ��ȡԪ������
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return int���� int[0]��ʾx�ᣬint[1]��ʾy��
	 */
	public int[] getLocation(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getLocation(locator);
	}

	/**
	 * @Description: ��ȡԪ�ش�С
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return int���� int[0]��ʾ��ȣ�int[1]��ʾ�߶�
	 */
	public int[] getSize(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getSize(locator, timeout);
	}

	/**
	 * @Description: ��ȡԪ�ش�С
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return int���� int[0]��ʾ��ȣ�int[1]��ʾ�߶�
	 */
	public int[] getSize(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getSize(locator);
	}

	/**
	 * @Description: ��ȡԪ�ر�ǩ����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public String getTagName(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getTagName(locator);
	}

	/**
	 * @Description: ��ȡԪ�ر�ǩ����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public String getTagName(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getTagName(locator, timeout);
	}

	/**
	 * @Description: ��ȡԪ���ı�����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public String getText(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getText(locator);
	}

	/**
	 * @Description: ��ȡԪ���ı�����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public String getText(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getText(locator, timeout);
	}

	/**
	 * @Description: ������Ԫ��λ��form��ʱ������ֱ��ʹ�ô˷����ύ����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 */
	public void submit(String locator,String log,CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.submit(locator,log,keysToSend);
	}

	/**
	 * @Description: ������Ԫ��λ��form��ʱ������ֱ��ʹ�ô˷����ύ����
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 */
	public void submit(String locator,String log,int timeout,CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		elementOperation.submit(locator, log, timeout, keysToSend);
	}

	/**
	 * @Description: ��ȡԪ�ظ���
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return
	 */
	public int getElementCount(String locator, int timeout) {
		// TODO Auto-generated method stub
		return elementOperation.getElementCount(locator, timeout);
	}

	/**
	 * @Description: ��ȡԪ�ظ���
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public int getElementCount(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.getElementCount(locator);
	}

	/**
	 * @Description: �ж�Ԫ���Ƿ�ɼ�
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public Boolean isDisplayed(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.isDisplayed(locator);
	}

	/**
	 * @Description: �ж�Ԫ���Ƿ���ѡ��״̬
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return
	 */
	public Boolean isSelected(String locator) {
		// TODO Auto-generated method stub
		return elementOperation.isSelected(locator);
	}

	/**
	 * @Description: ����config.xml��url�ֶ�ָ��������
	 */
	public void get() {
		// TODO Auto-generated method stub
		windowOperation.get();
	}

	/**
	 * @Description: ���б���ʽ����driver�򿪵Ĵ���handle
	 * @return
	 */
	public List<String> getWindowHandlesList() {
		// TODO Auto-generated method stub
		return windowOperation.getWindowHandlesList();
	}

	/**
	 * @Description: ����cookie
	 * @param cookie cookie�� cookie��
	 */
	public void addCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		windowOperation.addCookie(cookie);
	}

	/**
	 * @Description: ɾ��cookie
	 * @param cookie cookie��
	 */
	public void deleteCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		windowOperation.deleteCookie(cookie);
	}

	/**
	 * @Description: ɾ������cookie
	 */
	public void deleteAllCookies() {
		// TODO Auto-generated method stub
		windowOperation.deleteAllCookies();
	}

	/**
	 * @Description: ��ȡ����cookie
	 * @return
	 */
	public Set<Cookie> getCookies() {
		// TODO Auto-generated method stub
		return windowOperation.getCookies();
	}

	/**
	 * @Description: ��ȡcookie
	 * @param name cookie��name
	 * @return
	 */
	public Cookie getCookieNamed(String name) {
		// TODO Auto-generated method stub
		return windowOperation.getCookieNamed(name);
	}

	/**
	 * @Description: ɾ��cookie
	 * @param name cookie��name
	 */
	public void deleteCookieNamed(String name) {
		// TODO Auto-generated method stub
		windowOperation.deleteCookieNamed(name);
	}

	/**
	 * @Description: ���õȴ�ҳ����ȫ���ص�ʱ�䣬����ʱ��ҳ�滹û��ȫ������������׳��쳣
	 * @param time
	 */
	public void pageLoadTimeout(int time) {
		// TODO Auto-generated method stub
		windowOperation.pageLoadTimeout(time);
	}

	/**
	 * @Description:�����첽�ű�ִ�еĳ�ʱʱ�� 
	 * @param time
	 */
	public void setScriptTimeout(int time) {
		// TODO Auto-generated method stub
		windowOperation.setScriptTimeout(time);
	}

	/**
	 * @Description: ���õȴ�Ԫ�صĳ�ʱʱ�䣬һ�㲻��
	 * @param time
	 */
	public void implicitlyWait(int time) {
		// TODO Auto-generated method stub
		windowOperation.implicitlyWait(time);
	}

	/**
	 * @Description: �л�frame
	 * @param index frame��index
	 */
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		windowOperation.switchToFrame(index);
	}

	/**
	 * @Description: �л�frame
	 * @param nameOrId frame��name��id
	 */
	public void switchToFrame(String nameOrId) {
		// TODO Auto-generated method stub
		windowOperation.switchToFrame(nameOrId);
	}

	/**
	 * @Description: �л�frame
	 * @param frameElement
	 */
	public void switchToFrame(WebElement frameElement) {
		// TODO Auto-generated method stub
		windowOperation.switchToFrame(frameElement);
	}

	/**
	 * @Description: �л�����
	 * @param name �������� ������ϵ����
	 */
	public void switchToWindow(String name) {
		// TODO Auto-generated method stub
		windowOperation.switchToWindow(name);
	}

	/**
	 * @Description: �л�����
	 * @param index ��һ�����ڼ�1��ֻ��һ������ʱ��index=1�����´���index=2
	 */
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		windowOperation.switchToWindow(index);
	}

	/**
	 * @Description: ǰ�������
	 */
	public void forward() {
		// TODO Auto-generated method stub
		windowOperation.forward();
	}

	/**
	 * @Description: ���������
	 */
	public void back() {
		// TODO Auto-generated method stub
		windowOperation.back();
	}

	/**
	 * @Description: ͬget(url)
	 * @param url
	 */
	public void to(String url) {
		// TODO Auto-generated method stub
		windowOperation.to(url);
	}

	/**
	 * @Description: ˢ��ҳ��
	 */
	public void refresh() {
		// TODO Auto-generated method stub
		windowOperation.refresh();
	}

	/**
	 * @Description: ����ظ�ˢ��
	 * @param time ���ʱ�䵥λ�Ǻ���
	 * @param count ˢ�´���
	 */
	public void refresh(int time, int count) {
		// TODO Auto-generated method stub
		windowOperation.refresh(time, count);
	}

	/**
	 * @Description: ���ô��ڴ�С
	 * @param width
	 * @param height
	 */
	public void setSize(int width, int height) {
		// TODO Auto-generated method stub
		windowOperation.setSize(width, height);
	}

	/**
	 * @Description: ���ô���λ��
	 * @param x
	 * @param y
	 */
	public void setPosition(int x, int y) {
		// TODO Auto-generated method stub
		windowOperation.setPosition(x, y);
	}

	/**
	 * @Description: ��ȡ���ڴ�С
	 * @return int���� int[0]�Ǹ߶ȣ�int[1]�ǿ��
	 */
	public int[] getSize() {
		// TODO Auto-generated method stub
		return windowOperation.getSize();
	}

	/**
	 * @Description: ��ȡ����λ��
	 * @return int���� int[0]��x���꣬int[1]��y����
	 */
	public int[] getPosition() {
		// TODO Auto-generated method stub
		return windowOperation.getPosition();
	}

	/**
	 * @Description: ��󻯵�ǰ����
	 */
	public void maximize() {
		// TODO Auto-generated method stub
		windowOperation.maximize();
	}

	/**
	 * @Description: ִ��js����������ʵ��Ԫ�ظ���
	 * @param jsCode js����
	 * @param element ҳ��Ԫ��
	 */
	public void runJs(String jsCode, WebElement element) {
		// TODO Auto-generated method stub
		windowOperation.runJs(jsCode, element);
	}

	/**
	 * @Description: ִ��js
	 * @param jsCode
	 */
	public void runJs(String jsCode) {
		// TODO Auto-generated method stub
		windowOperation.runJs(jsCode);
	}

	/**
	 * @Description: ִ���з���ֵ��js����
	 * @param jsCode
	 * @return
	 */
	public Object runJsReturn(String jsCode) {
		// TODO Auto-generated method stub
		return windowOperation.runJsReturn(jsCode);
	}

	/**
	 * @Description: ִ���з���ֵ��js����
	 * @param jsCode
	 * @param element
	 * @return
	 */
	public Object runJsReturn(String jsCode, WebElement element) {
		// TODO Auto-generated method stub
		return windowOperation.runJsReturn(jsCode, element);
	}

	/**
	 * @Description: ��ȡԪ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @param timeout ��ʱʱ��
	 * @return WebElement����
	 */
	public WebElement findElement(String locator, int timeout) {
		// TODO Auto-generated method stub
		return windowOperation.findElement(locator, timeout);
	}

	/**
	 * @Description: ��ȡԪ��
	 * @param locator Ԫ�ض�λ����Ĭ��ʹ��xpath��λ
	 * @return WebElement����
	 */
	public WebElement findElement(String locator) {
		// TODO Auto-generated method stub
		return windowOperation.findElement(locator);
	}
}
