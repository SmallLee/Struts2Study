<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/12/11
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>类型转化</title>
  </head>
  <body>
  <s:debug/>
  <%--Error: <s:property value="fieldErrors.age[0]"/> <br>--%>

  <s:form action="testConversion.action" method="POST">
    <s:textfield  name="age" label="age2"/> <br>
    <%-----<s:fielderror name="age"/>--%>
    <s:textfield name = "date" label="Date"/>
    <%----<s:fielderror name="date"/>--%>

    <s:submit value="提交"/>
  </s:form>
  </body>
</html>
