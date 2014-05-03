package com.zlshuo.selenium.nonaming.operation;

import org.openqa.selenium.WebDriver;

/**
 * @author leshuo
 * @version 2014Äê5ÔÂ1ÈÕ
 */
public class OperationFactory extends AbstractOperationFactory{
	
	public OperationFactory(WebDriver driver){
		super(driver);
	}
	/**
	 * @Override
	 * @Description: 
	 * @return
	 */
	@Override
	public IElementOperation createElementOperation() {
		// TODO Auto-generated method stub
		return new ElementOperation(driver);
	}

	/**
	 * @Override
	 * @Description: 
	 * @return
	 */
	@Override
	public IWindowOperation createWindowOperation() {
		// TODO Auto-generated method stub
		return new WindowOperation(driver);
	}
	/**
	 * @Override
	 * @Description: 
	 * @return
	 */
	@Override
	public ISelectElementOperation createSelectElementOperation() {
		// TODO Auto-generated method stub
		return new SelectElementOperation(driver);
	}
	/**
	 * @Override
	 * @Description: 
	 * @return
	 */
	@Override
	public IActionsOperation createActionsOperation() {
		// TODO Auto-generated method stub
		return new ActionsOperation(driver);
	}
	/**
	 * @Override
	 * @Description: 
	 * @return
	 */
	@Override
	public IAssertOperation createAssertOperation() {
		// TODO Auto-generated method stub
		return new AssertOperation();
	}
	
}
