Unnaming
========

我的第一个小型selenium框架  

访问[我的博客](http://zlshuo.com/selenium/1237.html)查看完整介绍

####如何使用  

初始化谷歌浏览器对象
driver=CreateDriverInstance.getDriverInstance("chrome");  

访问百度  
driver.get("http://www.baidu.com");  

搜索seleniulm  

driver.submit("id$kw","搜索selenium",10,"selenium");  

退出driver  
driver.quit();
