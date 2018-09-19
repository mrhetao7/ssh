<%--
  Created by IntelliJ IDEA.
  User: 24597
  Date: 2018/9/19
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:bean name="cap.bean.User" id="u">
<s:param name="id" value="1"></s:param>
<s:param name="username" value="'cap'"></s:param>
<s:param name="password" value="'cap'"></s:param>

</s:bean>

<s:push value="#u">
id:<s:property  value="id"/><br>
用户名:<s:property value="username"/><br>
密码:<s:property value="password"/>
</s:push>
</body>
</html>
