package com.zlshuo.selenium.nonaming.tools;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

/**
 * 工具类提供：获取当前日期，获取文件路径等方法
 * @author leshuo
 * @version 2014年4月22日
 */
public class Tools {
	
	/**
	 * 获取当前日期
	 * @return 形如2014/04/22 10-10-10的日期
	 * @throws IOException
	 */
	public static String getCurrentDate() throws IOException{
		int y,m,d,h,mi,s;  
		Calendar cal=Calendar.getInstance();    
		y=cal.get(Calendar.YEAR);    
		m=cal.get(Calendar.MONTH);    
		d=cal.get(Calendar.DATE);    
		h=cal.get(Calendar.HOUR_OF_DAY);    
		mi=cal.get(Calendar.MINUTE);    
		s=cal.get(Calendar.SECOND);
		if((m+1)<10)
			return y+"/0"+(m+1)+"/"+d+" "+h+"-"+mi+"-"+s;
		else
			return y+"/"+(m+1)+"/"+d+" "+h+"-"+mi+"-"+s;
	}
	
	/**
	 * 获得当前项目的绝对路径
	 */
	public static String getPath(){
		try{
			File directory = new File("");
			String courseFile = directory.getCanonicalPath() ; 
			return courseFile;
		}catch(IOException e){
			Log.error("没有获取到项目路径，请检查项目文件!");
			return null;
		}
		
		
	}
}
