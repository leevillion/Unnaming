Unnaming
========

我的第一个小型selenium框架  

访问[我的博客](http://zlshuo.com/selenium/1237.html)查看完整介绍

####如何使用  

初始化谷歌浏览器对象
DriverInstance driver=CreateDriverInstance.getDriverInstance("chrome");  

访问百度  
driver.get("http://www.baidu.com");  

搜索seleniulm  

driver.submit("id$kw","搜索selenium",10,"selenium");  

退出driver  
driver.quit();  

所有的操作都有DriverInstance对象实例完成

####一些约定  

元素定位器默认采用xpath，若想使用id,name等定位需使用如下形式  

driver.click("id$kw");  

driver.click("name$kw");

driver.click("css$#kw");  

浏览器的启动参数在config.xml中配，如谷歌浏览启动时最大化  

\<parameter name="–start-maximized"> \</parameter>
