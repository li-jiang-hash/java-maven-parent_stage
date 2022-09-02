<%@ page isELIgnored="false" %>
<%@ taglib prefix="lj" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
    <title>Title</title>
    <style>
        body{
            margin: 0;
            padding: 0;
            background: pink;
        }
        table{
            border-collapse: collapse;
            margin: 50px auto 0 auto;
            width: 800px;
        }
        tr{
            line-height: 30px;
        }
    </style>
</head>
<body>
<%--${brands}--%>
<%
    System.out.println("hello jsp");
%>
<%--<a th:href="@{/Welcome?method=logout}">sssss</a>--%>

<a href="index.jsp" target="_top">退出</a>

<%--<lj:if test="${status == 1}">男</lj:if>--%>
<%--<lj:if test="${status == 2}">女</lj:if>--%>
<table border="1" cellspacing="0">
    <caption style="color: red;font-size: 38px">欢迎<span style="color: blue">${mybatisUser}</span></caption>
<%--<table>--%>
    <thead>
    <tr>
        <th>商品ID</th>
        <th>商品名称</th>
        <th>商品公司</th>
        <th>商品价格</th>
        <th>商品简介</th>
        <th>商品状态</th>
        <th colspan="2">商品编辑</th>
    </tr>
    </thead>
    <lj:forEach items="${brands}" var="brand" varStatus="status">
        <tbody>
            <tr align="center">
                <td>${brand.id}</td>
                <td>${brand.name}</td>
                <td>${brand.address}</td>
                <td>${brand.price}</td>
                <td>${brand.slogan}</td>
                <lj:if test="${brand.status ==1}">
                    <td style="color: blue;cursor: pointer">热卖中</td>
                </lj:if>
                <lj:if test="${brand.status ==0}">
                    <td style="color: #999;cursor:no-drop;">已售空</td>
                </lj:if>
                <td><a href="#">修改</a></td>
                <td><a href="#">删除</a></td>
            </tr>
        </tbody>
    </lj:forEach>
</table>
</body>
</html>
