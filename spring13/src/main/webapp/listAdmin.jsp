<%--
  Created by IntelliJ IDEA.
  User: 24597
  Date: 2018/11/22
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <s:iterator value="pageBean.list" var="admin">
        <tr>
            <td><s:property value="#admin.id"/> </td>
            <td><s:property value="#admin.username"/> </td>
            <td><s:property value="#admin.password"/> </td>
        </tr>
    </s:iterator>

    <tr>
        <td>共&nbsp;<s:property value="pageBean.getTotalPages()"/> &nbsp;页&nbsp;&nbsp;&nbsp;&nbsp;
            当前第:&nbsp;<s:property value="pageBean.getPageNo()"/>页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="lists?pageNo=<s:property value="pageBean.getTopPageNo()"/> ">首页</a>
            <a href="lists?pageNo=<s:property value="pageBean.getPreviousPageNo()"/> ">上一页</a>
            <a href="lists?pageNo=<s:property value="pageBean.getNextPageNo()"/> ">下一页</a>
            <a href="lists?pageNo=<s:property value="pageBean.getBottomPageNo()"/> ">尾页</a>
        </td>
    </tr>
</table>
<a href="addAdmin.jsp">添加</a>
</body>
</html>
