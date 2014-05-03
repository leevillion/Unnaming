package com.zlshuo.selenium.nonaming.operation;

import org.openqa.selenium.WebDriver;

/**
 * @author leshuo
 * @version 2014Äê5ÔÂ1ÈÕ
 */
public abstract class AbstractOperationFactory {
	public WebDriver driver;
	public AbstractOperationFactory(WebDriver driver){
		this.driver=driver;
	}
	public abstract IElementOperation createElementOperation();
	public abstract IWindowOperation createWindowOperation();
	public abstract ISelectElementOperation createSelectElementOperation();
	public abstract IActionsOperation createActionsOperation();
	public abstract IAssertOperation createAssertOperation();
}
