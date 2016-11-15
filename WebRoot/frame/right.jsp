<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
</head>
<body>
<div align="center">
<table border="0" width="60%" cellspacing="0" cellpadding="0" id="table1">
<tr>
<td height="93"></td>
</tr>
<tr>
<td>
<img src="<%=basePath %>images/bg.jpg"/ style="background-repeat:no-repeat" width="1500px" height="600px">
</td>
</tr>
</table>
</div>
</body>
</html>