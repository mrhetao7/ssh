<%--
  Created by IntelliJ IDEA.
  User: 24597
  Date: 2018/9/19
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<b>数组使用</b>
<br>
<hr>
<b>fruits:</b><s:property value="fruits"/><br>
<b>水果种类:</b><s:property value="fruits.length"/><br>
<b>第一种水果:</b><s:property value="fruits[0]"/><br>
<br>

<b>List使用</b>
<br>
<hr>
<b>flowers:</b><s:property value="flowers"/><br>
<b>花的种类:</b><s:property value="flowers.size"/><br>
<b>第一种花:</b><s:property value="flowers[0]"/><br>
<br>

<b>Map使用</b>
<br>
<hr>
<b>provincesMap:</b><s:property value="provincesMap"/><br>
<b>地区的数量:</b><s:property value="provincesMap.size"/><br>
<b>第一个地区:</b><s:property value="provincesMap[0]"/><br>
<br>


</body>
</html>
