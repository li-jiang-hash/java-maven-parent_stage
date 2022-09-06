<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/09/05
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<h1>axiosTest</h1>

<button id="btn">ajax异步提交</button>
<script>  $("#btn").click(function () {
    let url = '${pageContext.request.contextPath}/user/ajaxRequest';
    let data = '[{"id":1,"username":"李江"},{"id":2,"username":"王五"}]';
    $.ajax({
        type: 'POST',
        url: url,
        data: data,
        contentType: 'application/json;charset=utf-8',
        success: function (resp) {
            alert(JSON.stringify(resp))
        }
    })
})</script>
</body>
</html>
