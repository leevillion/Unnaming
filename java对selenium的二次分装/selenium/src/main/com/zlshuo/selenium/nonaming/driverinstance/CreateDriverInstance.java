package com.zlshuo.selenium.nonaming.driverinstance;

import org.openqa.selenium.WebDriver;

import com.zlshuo.selenium.nonaming.driver.CreateDriver;
import com.zlshuo.selenium.nonaming.operation.IActionsOperation;
import com.zlshuo.selenium.nonaming.operation.IAssertOperation;
import com.zlshuo.selenium.nonaming.operation.IElementOperation;
import com.zlshuo.selenium.nonaming.operation.ISelectElementOperation;
import com.zlshuo.selenium.nonaming.operation.IWindowOperation;
import com.zlshuo.selenium.nonaming.operation.OperationFactory;

/**
 * @author leshuo
 * @version 2014Äê4ÔÂ27ÈÕ
 */
public class CreateDriverInstance extends CreateDriver{
	
	public static DriverInstance getDriverInstance(String str){
		DriverInstance driverInstance=new DriverInstance();
		WebDriver driver=getDriver(str);
		OperationFactory operationFactory=new OperationFactory(driver);
		IWindowOperation windowOperation=operationFactory.createWindowOperation();
		IElementOperation elementOperation=operationFactory.createElementOperation();
		ISelectElementOperation selectElementOperation=operationFactory.createSelectElementOperation();
		IActionsOperation actionsOperation=operationFactory.createActionsOperation();
		IAssertOperation assertOperation=operationFactory.createAssertOperation();
		driverInstance.inject(windowOperation,elementOperation,selectElementOperation,
				actionsOperation,assertOperation);
		
		return driverInstance;
	}
	
	public static DriverInstance getDriverInstance(){
		return getDriverInstance("chrome");
	}
}
