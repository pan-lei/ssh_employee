<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head></head>
<body>
<table border="0" width="600px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 员工添加</td>
</tr>
<tr>
<td align="right" > 
<a href="javascript:document.getElementById('saveForm').submit()">保存</a> &nbsp;&nbsp;
<a href="javascript:history.go(-1)">退回</a>
</td>
</tr>
</table>
<br/>

<s:form action="employee_save" method="post" namespace="/" id="saveForm" theme="simple">
<table border='0' cellpadding="0"  cellspacing="10">

	<tr>
		<td align="center">姓名：</td>
		<td><s:textfield name="ename"/></td>
		<td align="center">性别：</td>
		<td><s:radio name="sex" list="{'男','女'}"/></td>
	</tr>
	<tr>
		<td align="center">用户名：</td>
		<td><s:textfield name="username"/></td>
		<td align="center">密码：</td>
		<td><s:password name="password"/></td>
	</tr>
	<tr>
		<td align="center">出生日期：</td>
		<td><s:textfield name="birthday"/></td>
		<td align="center">入职时间：</td>
		<td><s:textfield name="joinDate"/></td>
	</tr>
	
	<tr>
		<td align="center">所属部门：</td>
		<!-- 展示所有部门 -->
		<td><s:select name="department.did" list="list" listKey="did" listValue="dname" headerKey="" headerValue="--请选择--"/></td>
		<td align="center">编号：</td>
		<td><s:textfield name="eno"/></td>
	</tr>
</table>
</s:form>

</body>
</html>