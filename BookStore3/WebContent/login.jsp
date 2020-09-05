<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form action="./Check" method="post">
<%
String bookname=request.getParameter("bookname");
String amt=request.getParameter("amt");
String qty=request.getParameter("qty");
%>
<input type="hidden" value="<%=bookname %>"/>
<input type="hidden" value="<%=amt %>"/>
<input type="hidden" value="<%=qty %>"/>

<center>
<table>
<tr><td><font color="white">Username</font><td><td><font color="white">:</font><td><td><input type="text" name="uname"/><td>
<tr><td><font color="white">Password</font><td><td><font color="white">:</font><td><td><input type="text" name="pwd"/></td>
<tr><td><input type="submit" value="login"/><td>
</table>
</center>
</form>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>