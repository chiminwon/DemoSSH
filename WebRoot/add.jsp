<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
     
    <title>My JSP 'start.jsp' starting page</title>
     
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
 
  </head>
   
  <body>
     <h1 align="center">员工信息</h1>
     <form action="${pageContext.request.contextPath}/emp/employee!addSave.action" method="post">
      <table align="center" border="2" bgcolor="">
        <tr><td align="center" colspan="2">员工信息录入</td></tr>
        <tr><td>姓名</td><td><input type="text" name="employee.name"></td></tr>
        <tr><td>年龄</td><td><input type="text" name="employee.age"></td></tr>
        <tr><td>性别</td><td>
            男<input type="radio" name="employee.sex" value="0" checked>
            女<input type="radio" name="employee.sex" value="1">
        </td></tr>
        <tr><td>电话</td><td><input type="text" name="employee.tel"></td></tr>
        <tr><td>地址</td><td><input type="text" name="employee.address"></td></tr>
        <tr><td align="center" colspan="2"><input type="submit" value="提交"></td>
        </tr>
      </table>
     </form>
  </body>
</html>