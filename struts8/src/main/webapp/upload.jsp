<%--
  Created by IntelliJ IDEA.
  User: 24597
  Date: 2018/9/26
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file" size="100"><br>
    <input type="submit" value="upload">
</form>
</body>
</html>
