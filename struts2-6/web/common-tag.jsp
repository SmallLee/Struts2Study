<%@ page import="com.struts.study.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/12/4
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="d" uri="/struts-tags"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <d:debug/>
        <d:property value="productName"/><br>
    <!--打印map栈的内容-->
    <d:property value="#session.date"/> <br>
    <d:property value="#parameters.name[0]"/> <br>
    <!--url标签，创建一个url链接-->
    <d:url value="/getProduct" var="url">
        <%--指定url包含的请求参数，1001不可能是一个属性名，Struts2直接把1001作为属性值--%>
        <d:param name="productId" value="1001"/>
        <d:param name="date" value="#session.date"/>
    </d:url> <br>
    ${url}
    <d:url value="/getProduct" var="url2">
        <d:param name="productPrice" value="productPrice"/>
    </d:url>
        ${url2} <br>
    <d:url value="/getProduct" var="url3">
        <d:param name="productId" value="'abcd'"/>
    </d:url>
    ${url3} <br>
<%--构建一个请求action地址--%>
    <d:url action="testAction" method="test" var="url4"/>
    ${url4} <br>
    <%--获得请求参数--%>
    <d:url value="testTag" var="url5" includeParams="get"/>
    ${url5} <br>
    <!--对value属性值自动进行ognl解析-->
    <d:set var="product" value="productName" scope="page"/>
    productName:${product}
    <br>
        <%
            Person person = new Person("zhangsan",12);
            request.setAttribute("person",person);
        %>
        <d:push value="#request.person">
            ${name}
        </d:push>
        --${name}--
    <br>
    <d:if test="productPrice > 500">
        贵
    </d:if>
    <d:elseif test="productPrice > 300">
        还好
    </d:elseif>
    <d:else>
        便宜
    </d:else>
    <br>
    <d:if test="#request.person.age >  20">
        成年人
    </d:if>
    <d:elseif test="#request.person.age > 17">
        未成年人
    </d:elseif>
    <d:else>儿童</d:else>
    <br>
        <%
            List<Person> persons = new ArrayList<Person>();
            persons.add(new Person("AA",11));
            persons.add(new Person("BB",22));
            persons.add(new Person("CC",33));
            request.setAttribute("persons",persons);
        %>
        <d:iterator value="#request.persons">
            ${name} -- ${age}
        </d:iterator>
    <br>
    <br>
</body>
</html>
