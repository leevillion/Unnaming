package com.zlshuo.selenium.nonaming.pageobject;

/**
 * @author leshuo
 * @version 2014��5��14��
 */
public class AT {
	
	public static void main(String[] args){
		
		try{
			AnjukeSaleListPage listPage=BasePage.
					get("http://suzhou.anjuke.com/sale/rd1/?kw=�Ϻ����ǣ�һ�����ڣ�+");
			AnjukeSalePropPage propPage=listPage.clickPorpByindex(1);
			propPage.quit();
		}catch(Exception e){
			//�˳�driver
			BasePage.quit();
			e.printStackTrace();
		}
		BasePage.quit();
	}
}
