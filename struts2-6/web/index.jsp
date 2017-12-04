<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/12/4
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="testTag.action?name=atguigu">testTag</a>
  <%
    session.setAttribute("date",new Date());
  %>
  </body>
</html>
