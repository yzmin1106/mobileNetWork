<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="entity.single.*" %>
<%@ page language="java" import="entity.multiple.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
   <%
   entity.single.ShareFactory singleShareFactory  = new   entity.single.ShareFactory();
   entity.single.Share share1= singleShareFactory.factory(new Character('中'));
   
   out.println("字体："+share1.work("黑体"));
   out.println("<br>");
   out.println("字体："+share1.work("宋体"));
    out.println("<br>");
   share1=singleShareFactory.factory(new Character('外'));
    out.println("字体："+share1.work("仿宋"));
     out.println("<br>");
    entity.multiple.ShareFactory multipleShareFactory = new entity.multiple.ShareFactory();
    entity.multiple.Share share2=multipleShareFactory.factory("东南西北");
     out.println("内蕴东南西北各不同，外蕴均为字体："+share2.work("宋体"));
     out.println("<br>");
    %>   
  </body>
</html>
