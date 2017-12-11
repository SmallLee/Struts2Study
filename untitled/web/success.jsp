<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2017/12/11
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug/>
    <h3>SuccessPage</h3>
    <s:property value="age"/>
    ${age}
<%=request.getAttribute("age")%>
</body>
</html>
