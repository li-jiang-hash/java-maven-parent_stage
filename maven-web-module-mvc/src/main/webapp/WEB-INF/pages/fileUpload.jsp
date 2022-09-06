<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/09/05
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/fileUpload_file"
      enctype="multipart/form-data">
    名称：<input type="text" name="username"> <br>
    文件：<input type="file" name="filePic"> <br>
    <input type="submit" value="单文件上传">
</form>

<form method="post" action="${pageContext.request.contextPath}/user/fileUpload_files"
      enctype="multipart/form-data">
    名称：<input type="text" name="username"> <br>
    文件：<input type="file" name="filePic"> <br>
    文件：<input type="file" name="filePic"> <br>
    文件：<input type="file" name="filePic"> <br>
    <input type="submit" value="多文件上传">
</form>
</body>
</html>
