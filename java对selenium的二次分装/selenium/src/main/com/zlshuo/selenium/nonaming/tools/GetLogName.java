package com.zlshuo.selenium.nonaming.tools;

/**
 * @author leshuo
 * @version 2014Äê4ÔÂ21ÈÕ
 */
public class GetLogName {
	private String className;
	private String methodName;
	
	public GetLogName(String className,String methodName){
		this.setClassName(className);
		this.setMethodName(methodName);
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
}
