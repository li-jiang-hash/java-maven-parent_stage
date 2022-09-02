<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="lj" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>hello JSP</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: sans-serif;
            background: pink;
        }
        .box {
            width: 300px;
            padding: 40px;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50% , -50%);
            background-color: pink;
            text-align: center;
        }

        .box h1 {
            color: #349;
            /*text-transform: uppercase;*/
            font-size: 50px;
        }
        .box input[type="username"],
        .box input[type="password"] {
            border: 0;
            background: none;
            display: block;
            margin: 20px auto;
            text-align: center;
            border: 2px solid #3498db;
            padding: 14px 10px;
            width: 200px;
            outline: none;
            color: white;
            border-radius: 24px;
            transition: 0.25s;
        }
        .box input[type="username"]:focus,
        .box input[type="password"]:focus {
            width: 280px;
            border-color: #2ecc71;
        }

        .box input[type="submit"] {
            border: 0;
            background: none;
            display: block;
            margin: 20px auto;
            text-align: center;
            border: 2px solid #2ecc71;
            padding: 14px 40px;
            outline: none;
            color: black;
            border-radius: 24px;
            transition: 0.25s;
        }

        .box input[type="submit"]:hover {
            background: #2ecc71;
        }

    </style>
</head>

<%--<jsp:forward page="index.jsp"></jsp:forward>--%>
<%--<form action="/maven_web_module_jsp1_war_exploded/Djsp1" method="get">--%>
<%--    用户名:<input name="username" /><br />--%>
<%--    密码:<input name="password" /><br />--%>
<%--    <input type="submit">--%>
<%--</form>--%>
<body>
<% session.invalidate(); %>
<form class="box" action = "/maven_web_module_jsp1_war_exploded/Djsp1" method="get">
<%--<from  action = "/maven_web_module_jsp1_war_exploded/Djsp1" method="get">--%>
    <h1>login</h1>
    <lj:if test="${passnull == 1}">用户名：${mybatisUser}/密码：${pass}错误</lj:if>
    <input type = "username" name = "username" placeholder="Username" />
    <input type = "password" name = "password" placeholder="Password" />
        <input type="submit" />
</form>
</body>
</html>
