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
    productPrice : <s:property value="[0].productPrice"/><br>

    productName1：${sessionScope.product.productName}
    <s:property value="#session.product.productName"/>
    productName2: ${requestScope.test.productDesc}
    <s:property value="#request.test.productDesc"/>
    <%--使用Ognl调用类的静态字段和方法--%>
    <s:property value="@java.lang.Math@PI"/>
    <s:property value="@java.lang.Math@cos(0)"/>
<%--调用对象栈的方法为一个属性赋值--%>
        <s:property value="setProductName('ognl')"/>
    <%--从栈顶对象找productName，--%>
    productPrice : <s:property value="productName"/><br>
</body>
</html>
