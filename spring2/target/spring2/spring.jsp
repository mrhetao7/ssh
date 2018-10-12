<%@ page import="java.applet.Applet" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="cap.service.HelloWorld" %>
<%--
  Created by IntelliJ IDEA.
  User: 24597
  Date: 2018/10/12
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
ServletContext servletContext = request.getSession().getServletContext();
    ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
    HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
%>
<%=helloWorld.SayHi("cap2018")%>
</body>
</html>
