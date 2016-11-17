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
<td align="center" style="font-size:24px; color:#666"> 部门编辑 </td>
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
<s:form id="saveForm" action="department_update" method="post" namespace="/" theme="simple">
<!-- 隐藏域，指明修改的是哪个部门 -->
<s:hidden name="did" value="%{model.did}"></s:hidden>
	<table style="font-size::16px">
		<tr>
		  <td>部门名称：</td>
		  <td><s:textfield name="dname" value="%{model.dname}"/></td>
		</tr>
		<tr>
		  <td>部门介绍：</td>
		  <td></td>
		</tr>
		<tr>
		  <td width="10%"></td>
		  <td>
		     <s:textarea rows="5" cols="50" name="ddesc" value="%{model.ddesc}"></s:textarea>
		  </td>
		</tr>
	</table>
</s:form>
</body>
</html> 