package com.zlshuo.selenium.nonaming.tools;
import java.util.ArrayList;

/**
 * ׷�ٵ�����־��ķ���
 * @author leshuo
 * @version 2014��4��22��
 */
public class Trace{  
	
    public static ArrayList<String> getCaller(){   
        StackTraceElement stack[] = (new Throwable()).getStackTrace(); 
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < stack.length; i++){  
            //StackTraceElement s = stack[i]; 
            if(stack[i].getMethodName().equals("setLog")){
            	list.add(stack[i+2].getClassName().toString());
            	list.add(stack[i+2].getMethodName().toString());
            	//list.add(Integer.toString(stack[i+2].getLineNumber()));
            }   
        }
        
        return list;
    }  
    
    public static GetLogName getLogName(ArrayList<String> list) {
		return new GetLogName(list.get(0), list.get(1));
	}
}