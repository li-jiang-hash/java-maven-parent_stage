<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/08/19
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script src="./static/js/jquery-3.6.0.js"></script>
    <script>
        $(() => {
            $("#dname").on("blur", function () {
                $.get(
                    "/maven_web_module_jsp1_war_exploded/asd",
                    {username: $("#dname").val(),password: $("#pass").val()},
                    // {password: $("#pass").val()},
                    function (result) {
                        if (result == 1) {
                            $("#usermsg").html("<span style='color:red'>用户已存在<span>");
                        } else {
                            $("#usermsg").html("<span style='color:blue'>通过</span>");
                        }
                    }
                )
            })
            $("#dname").on("blur", function () {
                $("#btn").click(function () {
                    $.get(
                        "/maven_web_module_jsp1_war_exploded/asd",
                        $("#form").serialize(),
                        function (data) {
                            console.log(data)
                        }
                    )
                })
            })
        })
    </script>
</head>
<body>
<form action="" method="post" id="form">
    userName:<input name="username" id="dname" type="text"/><br>
    <span id="usermsg"></span><br>
    password:<input name="pass" id="pass" type="password"/><br>
    <input type="button" id="btn" value="register">
</form>

</body>
</html>
