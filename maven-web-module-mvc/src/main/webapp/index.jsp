<%@ page contentType="text/html; charset=utf8" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/user/simpleParam?id=1&username=fyh">基本类型</a>
<form action="${pageContext.request.contextPath}/user/pojoParam" method="post">
    编号：<input type="text" name="id"> <br>
    用户名：<input type="text" name="username"> <br>
    <input type="submit" value="对象类型">
</form>
<form action="${pageContext.request.contextPath}/user/arrayParam">
    编号：<br>
    <input type="checkbox" name="ids" value="1">1<br>
    <input type="checkbox" name="ids" value="2">2<br>
    <input type="checkbox" name="ids" value="3">3<br>
    <input type="checkbox" name="ids" value="4">4<br>
    <input type="checkbox" name="ids" value="5">5<br>
    <input type="submit" value="数组类型">
</form>
<form action="${pageContext.request.contextPath}/user/queryParam" method="post">
    搜索关键字：<input type="text" name="keyword"> <br>
    user对象：
    <input type="text" name="user.id" placeholder="编号">
    <input type="text" name="user.username" placeholder="姓名"><br>
    list集合<br>
    第一个元素：
    <input type="text" name="userList[0].id" placeholder="编号">
    <input type="text" name="userList[0].username" placeholder="姓名"><br>
    第二个元素：
    <input type="text" name="userList[1].id" placeholder="编号">
    <input type="text" name="userList[1].username" placeholder="姓名"><br>
    map集合<br>
    第一个元素：
    <input type="text" name="userMap['u1'].id" placeholder="编号">
    <input type="text" name="userMap['u1'].username" placeholder="姓名"><br>
    第二个元素：
    <input type="text" name="userMap['u2'].id" placeholder="编号">
    <input type="text" name="userMap['u2'].username" placeholder="姓名"><br>
    <input type="submit" value="复杂类型">
</form>
<form action="${pageContext.request.contextPath}/user/converterParam">
    生日：<input type="text" name="birthday">
    <input type="submit" value="自定义类型转换器">
</form>
</body>
</html>
