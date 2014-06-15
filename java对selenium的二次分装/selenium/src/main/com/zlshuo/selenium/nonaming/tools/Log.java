package com.zlshuo.selenium.nonaming.tools;

/**
 * ��־��
 * ����λ�������ļ�log4j.properties
 * @author leshuo
 * @version 2014��4��22��
 */

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log{
	
	private static Logger logger=null;
	
	public static void setLog(){
		GetLogName logName=Trace.getLogName(Trace.getCaller());
		//��ȡ�����ļ�
		PropertyConfigurator.configure( Tools.getPath()+"\\src\\resource\\log4j.properties" );
		logger = Logger.getLogger("class:"+logName.getClassName()+";method:"+logName.getMethodName());
		
	} 
	
	public static void debug(String logInfo){
		setLog();
		logger.debug(logInfo);
	}
	public static void info(String logInfo){
		setLog();
		logger.info(logInfo);
	}
	public static void error(String logInfo){
		setLog();
		logger.error(logInfo);
	}
	public static void warning(String logInfo){
		setLog();
		logger.warn(logInfo);
	}
}
