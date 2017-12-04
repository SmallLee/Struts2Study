<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/11/23
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug/>
<s:property value="exception.message"/><br>
<%--<s:property value="exceptionStack"/>--%>
<form action="product-save.action" method="post">
    Product Name: <input type="text" name="productName"><br>
    Product Desc: <input type="text" name="productDesc"><br>
    Product Price : <input type="text" name="productPrice"> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
