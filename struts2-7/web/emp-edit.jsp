<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/12/6
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="emp-update">
    <s:textfield name="id" type="hidden"/>
    <s:textfield name="firstName" label="FirstName"/>
    <s:textfield name="lastName" label="LastName"/>
    <s:textfield name="email" label="Email"/>
    <s:submit/>
</s:form>
</body>
</html>
