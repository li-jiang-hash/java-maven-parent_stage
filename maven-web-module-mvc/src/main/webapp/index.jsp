<%@ page contentType="text/html; charset=gb2312" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/user/simpleParam?id=1&username=fyh">��������</a>
<form action="${pageContext.request.contextPath}/user/pojoParam" method="post">
    ��ţ�<input type="text" name="id"> <br>
    �û�����<input type="text" name="username"> <br>
    <input type="submit" value="��������">
</form>
</body>
</html>
