package com.zlshuo.selenium.nonaming.driver;
/**
 * ����config�еĲ�������chrome��driver
 * @author leshuo
 * @version 2014��4��20��
 */

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.zlshuo.selenium.nonaming.tools.ReadXml;
import com.zlshuo.selenium.nonaming.tools.Tools;

public class CreateChromeDriver implements ICreateDriver{
	
	private WebDriver driver;
	private ArrayList<String> attritubes;
	private ArrayList<String> values;
	private ArrayList<String> options=new ArrayList<String> ();
	//private String options="";
	
	public WebDriver createDriver() {
		
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.chrome.driver" , 
				Tools.getPath()+"\\src\\resource\\chromedriver.exe");
		getOptions();
		ChromeOptions option=new ChromeOptions();
		option.addArguments(options);
		driver = new ChromeDriver(option);
		return driver;
	}
	
	/**
	 * ȡconfig.xml��chrome���������������
	 */
	private void getOptions(){
		attritubes=ReadXml.getNodeAttributes("parameter","name");
		values=ReadXml.getNodeValues("parameter");
		for(int i=0;i<values.size();i++){
			options.add(attritubes.get(i)+values.get(i));
		}
	}
}
