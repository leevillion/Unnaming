package com.zlshuo.selenium.nonaming.pageobject;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leshuo
 * @version 2014年5月14日
 */
public class Url {
	
	private static Map<String, String> map = new HashMap<String , String>(){{
		
		//城市首页
		put("Home","http://[a-z]+\\.anjuke\\.(com)$|(com/)$");
		//二手房房源列表页
		put("SaleList","http://[a-z]+\\.anjuke.com/sale(/\\?from=navigation)?");
		//二手房房源单页
		put("SaleProp","http://[a-z]+\\.anjuke.com/prop/view/\\d+/?(\\?from)?");
		
	}};
	
	public String getUrl(String url){
		for (Entry<String, String> entry: map.entrySet()) {
			Pattern pat = Pattern.compile(entry.getValue());  
			Matcher mat = pat.matcher(url);  
			if(mat.find())
				return "getAnjuke"+entry.getKey()+"Page";
		}
		return null;
	}
	
	public static void main(String[] agrs){
		String s="http://shanghai.anjuke.com/prop/view/216648010";
		Pattern pat = Pattern.compile(map.get("SaleProp"));  
		Matcher mat = pat.matcher(s);  
		boolean rs = mat.find();
		if(rs)
			System.out.println("ok");
		else
			System.out.println("nook");
	}
}
