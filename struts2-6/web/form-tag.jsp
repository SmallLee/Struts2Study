<%@ page import="java.util.List" %>
<%@ page import="com.struts.study.City" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/12/4
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<City> cities = new ArrayList<City>();
    cities.add(new City(1001,"北京"));
    cities.add(new City(1002,"上海"));
    cities.add(new City(1003,"广州"));
    request.setAttribute("cities",cities);
%>
    <s:debug/>
    <s:form action="save">
        <s:textfield name="userName" label="username"/>
        <s:password name="userPassword" label="password"/>
        <s:textarea name="userDesc" label="textarea"/>
        <s:checkbox name="married" label="Married"/>
        <%--单选--%>
        <s:radio name="gender" list="#{'1':'male','2':'female'}" label="Gender"/>

        <s:checkboxlist name="city" list="#request.cities" listKey="cityId" listValue = "cityName" label="LikeCity">
        </s:checkboxlist> <br>
        <s:select list="{11,22,33,44}"
                  headerKey="" headerValue="请选择"
                  name="age" label="Age"/>
        <s:submit/>
    </s:form>
    <br>

</body>
</html>
