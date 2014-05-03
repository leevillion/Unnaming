package com.zlshuo.selenium.nonaming.tools;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 读取XML
 * @author leshuo
 * @version 2014年4月21日
 */
public class ReadXml {
	
	private static Document doc;
	private static String projectPath=Tools.getPath();
	
	/**
	 * 获取节点文本内容
	 * @param node 节点名
	 * @return 节点文本内容，没有去除空格
	 */
	public static String getNodeValue(String node){
		buildParse(projectPath+"\\src\\resource\\config.xml");
		NodeList list=doc.getElementsByTagName(node);
		if(list!=null && list.getLength()==1){
				Element e=(Element) list.item(0);
				return e.getTextContent();
		}else
			return null;		
	}
	
	/**
	 * 获取节点的所有文本内容
	 * @param node 节点名称
	 * @return 节点文本内容数组
	 */
	public static ArrayList<String> getNodeValues(String node){
		ArrayList<String>  strArray = new ArrayList<String> ();
		buildParse(projectPath+"\\src\\resource\\config.xml");
		try{
			NodeList list=doc.getElementsByTagName(node);
			if(list!=null){
				for(int i=0;i<list.getLength();i++){
					Element e=(Element) list.item(i);
					strArray.add(e.getTextContent());
				}
			}
		}catch(Exception e){
			Log.info("节点"+node+"不存在");
		}
		
		return strArray;
	}
	
	/**
	 * 获取节点的所有属性
	 * @param node 节点
	 * @param str 属性名
	 * @return 属性值
	 */
	public static ArrayList<String> getNodeAttributes(String node,String str){
		ArrayList<String>  strArray = new ArrayList<String> ();
		buildParse(projectPath+"\\src\\resource\\config.xml");
		try{
			NodeList list=doc.getElementsByTagName(node);
			if(list!=null){
				for(int i=0;i<list.getLength();i++){
					Element e=(Element) list.item(i);
					try{
						strArray.add(e.getAttribute(str));
					}catch(Exception e1){
						Log.info("属性"+str+"不存在");
					}
					
				}
			}
		}catch(Exception e){
			Log.info("节点"+node+"不存在");
		}
		return strArray;
	}
	
	/**
	 * 获取节点属性值
	 * @param e
	 * @param str
	 * @return
	 */
	public static String getNodeAttribute(Element e,String str){
		return e.getAttribute(str);
	}
	
	/**
	 * 返回子节点列表
	 * @param e 父元素
	 * @return 子节点列表
	 */
	private static NodeList getChildNodes(Element e){
		return e.getChildNodes();
	}
	
	/**
	 * 返回父节点下的所有子节点名称
	 * @param str 父节点
	 * @return
	 */
	public static ArrayList<String> getChildNodes(String str){
		ArrayList<String>  strArray = new ArrayList<String> ();
		buildParse(projectPath+"\\src\\resource\\config.xml");
		try{
			NodeList list=doc.getElementsByTagName(str);
			if(list!=null){
				for(int i=0;i<list.getLength();i++){
					Element e=(Element) list.item(i);
					NodeList childList=getChildNodes(e);
					try{
						//System.out.println(e.getNodeName());
						for(int j=0;j<childList.getLength();j++){
							Node chiledE=childList.item(j);
							if(chiledE instanceof Element)
								strArray.add(chiledE.getNodeName());
						}
					}catch(Exception e1){
						Log.info("节点"+str+"下不存在子节点");
					}
					
				}
			}
		}catch(Exception e){
			Log.info("节点"+str+"不存在");
		}
		return strArray;
	}
	
	/**
	 * 生成文档对象
	 * @param filePath
	 */
	private static void buildParse(String filePath){
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder builder = dbf.newDocumentBuilder();
			doc = builder.parse(new File(filePath));
		}catch(Exception e){
			Log.error(filePath+"不存在");
			e.printStackTrace();
		}
	}
	
}
