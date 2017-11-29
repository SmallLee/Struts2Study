<%@ page import="com.struts.valuestack.Product" %><%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/11/23
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<%--%>
        <%--Product product = (Product) request.getAttribute("product");--%>
        <%--if (product != null){%>--%>
    <%--<%=product.getProductName()%>--%>
    <%--<%=product.getProductDesc()%>--%>
    <%--<%=product.getProductPrice()%>--%>
        <%--<%}--%>
    <%--%>--%>
    <%--${requestScope.product.productName}--%>
    <%--${requestScope.product.productDesc}--%>
    <%--${requestScope.product.productPrice}--%>
    <%--<jsp:useBean id="product" class="pojo.Product" scope="request"/>--%>
    <%--<jsp:setProperty name="product" property="productName" value="${requestScope.product.productName}"/>--%>
    <%--<jsp:getProperty name="product" property="productName"/>--%>
<%--使用struts2--%>
    <s:debug/>
    ${productName}<br>
    ${productDesc}<br>
    ${productPrice}<br>
    productPrice : <s:property value="[0].productPrice"/>
</body>
</html>
