<%--
  Created by IntelliJ IDEA.
  User: 24597
  Date: 2018/9/28
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="register.page"/></title>
</head>
<body>
<h2>
    <s:text name="register.title"/>
</h2>
<s:form action="register" method="POST">
    <s:textfield name="user.name" key="username"/>
    <s:textfield name="user.password" key="password"/>
    <s:textfield name="user.repassword" key="repassword"/>
    <s:submit key="提交"/>
</s:form>
</body>
</html>
