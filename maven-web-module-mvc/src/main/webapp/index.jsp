<%@ page contentType="text/html; charset=gb2312" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/user/simpleParam?id=1&username=fyh">基本类型</a>
<form action="${pageContext.request.contextPath}/user/pojoParam" method="post">
    编号：<input type="text" name="id"> <br>
    用户名：<input type="text" name="username"> <br>
    <input type="submit" value="对象类型">
</form>
</body>
</html>
