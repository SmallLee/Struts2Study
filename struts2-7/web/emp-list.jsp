<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/12/5
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <style>
        td{
            text-align: center;
        }
    </style>
</head>
    <s:debug/>
<body>
    <s:form action="emp-add">
        <s:textfield name="firstName" label="FirstName"/>
        <s:textfield name="lastName" label="LastName"/>
        <s:textfield name="email" label="Email"/>
        <s:submit/>
    </s:form>
<br>
<br>

    <table border="1px" cellpadding="10" cellspacing="0" valign="center">
        <caption>员工信息</caption>
        <thead align="center">
            <tr>
                <th>ID</th>
                <th>FirstName</th>
                <th>LastName</th>
                <th>Email</th>
                <th>编辑</th>
                <th>删除</th>
            </tr>
        </thead>
        <tbody>
                <s:iterator value="#request.emps">
                    <tr>
                        <td>${id}</td>
                        <td>${firstName}</td>
                        <td>${lastName}</td>
                        <td>${email}</td>
                        <td><a href="">Edit</a></td>
                        <td><a href="emp-delete?id=${id}">Delete</a></td>
                    </tr>
                </s:iterator>
        </tbody>
    </table>
</body>
</html>
