<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
<script type="text/javascript">
var baseUrl="${BASE_URL}"
</script>
</head>
<body>
<table width="100%" border="2" bordercolor="red">
<tr>
<td>选择</td>
<td>用户名称</td>
<td>用户账号</td>
<td>用户密码</td>
<td>用户手机号</td>
</tr>
<c:forEach items="${userList}"  var="user" varStatus="status" >
<tr>
<td> <input type="checkbox"></td>
<td>${user.name}</td>
<td>${user.acccount}</td>
<td>${user.passWord}</td>
<td>${user.mobile}</td>
</tr>
</c:forEach>
</table>
</body>
</html>