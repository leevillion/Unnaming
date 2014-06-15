package com.zlshuo.selenium.nonaming.pageobject;

/**
 * @author leshuo
 * @version 2014年5月14日
 */
public class AT {
	
	public static void main(String[] args){
		
		try{
			AnjukeSaleListPage listPage=BasePage.
					get("http://suzhou.anjuke.com/sale/rd1/?kw=上海康城（一至四期）+");
			AnjukeSalePropPage propPage=listPage.clickPorpByindex(1);
			propPage.quit();
		}catch(Exception e){
			//退出driver
			BasePage.quit();
			e.printStackTrace();
		}
		BasePage.quit();
	}
}
