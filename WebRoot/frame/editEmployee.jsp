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
<td align="center" style="font-size:24px; color:#666"> 员工编辑 </td>
</tr>
<tr>
<td align="right" > 
<a href="javascript:document.getElementById('saveForm').submit()">保存</a> &nbsp;&nbsp;
<a href="javascript:history.go(-1)">退回 </a>
</td>
</tr>
</table>
<br/>
<br/>
<!-- action对应一个action标签，id对应提交时的对应关系 -->
<s:form id="saveForm" action="employee_update" method="post" namespace="/" theme="simple">
<!-- 隐藏域，指明修改的是哪个部门 -->
<s:hidden name="eid" value="%{model.eid}"></s:hidden>
	<table style="font-size::16px">
		<tr>
		  <td>姓名：</td>
		  <td><s:textfield name="ename" value="%{model.ename}"/></td>
		</tr>
		<tr>
		  <td>性别：</td>
		  <td><s:textfield name="sex" list="{'男','女'}" value="%{model.sex}"/></td>
		</tr>
		<tr>
		<td align="center">用户名：</td>
		<td><s:textfield name="username" value="%{model.username}"/></td>
		<td align="center">密码：</td>
		<td><s:password name="password"  value="%{model.password}" showPassword="true"/></td>
	</tr>
	<tr>
		<td align="center">出生日期：</td>
		<td><input type="text" name="birthday" value="<s:date name="model.birthday" format="yyyy-MM-dd"/>"/></td>
		<td align="center">入职时间：</td>
		<td><input type="text" name="joinDate" value="<s:date name="model.joinDate" format="yyyy-MM-dd"/>"/></td>
	</tr>
	
	<tr>
		<td align="center">所属部门：</td>
		<!-- 展示所有部门 -->
		<td><s:select name="department.did" list="list" value="%{model.department.did}" listKey="did" listValue="dname" headerKey="" headerValue="--请选择--"/></td>
		<td align="center">编号：</td>
		<td><s:textfield name="eno" value="%{model.eno}"/></td>
	</tr>
	</table>
</s:form>
</body>
</html> 