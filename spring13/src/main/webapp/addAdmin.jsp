<%--
  Created by IntelliJ IDEA.
  User: 24597
  Date: 2018/11/22
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="add" method="post">
    姓名：<input type="text" name="admin.username"><br>
    密码：<input type="text" name="admin.password"><br>
    <input type="submit" name="add">
</form>
<a href="lists">显示全部数据</a>
</body>
</html>
