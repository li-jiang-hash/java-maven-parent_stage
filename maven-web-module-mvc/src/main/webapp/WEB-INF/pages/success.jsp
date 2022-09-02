<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/09/02
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--${pageContext.request.contextPath}动态的来获取当前的项目路径 springmvc_war  a标签的请求方式：get请求--%>
<a href="${pageContext.request.contextPath}/user/simpleParam?id=1&username=fyh"> 基本类型</a>
</body>
</html>
