<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="purple">
<jsp:include page="header.jsp"></jsp:include>
<font color="white">
<%
String bookname=(String)request.getAttribute("bookname");
int amt= (int)request.getAttribute("amt");
int qty=(int)request.getAttribute("qty");
session.setAttribute("bookname", bookname);
session.setAttribute("amt", amt);
session.setAttribute("qty", qty);	
%>
<center>
<table>
<tr><td>Book Name <td><td>:<td><td><%=bookname%><td>
<tr><td>Quantity<td><td>:<td><td><%=qty %><td>
<tr><td>Total Amount<td><td>:<td><td><%=amt %><td>
<tr>
<td><form action="login.jsp">
		<input type="submit" value="LogIn"/>
		<input type="hidden" value="<%=bookname%>"/>
		<input type="hidden" value="<%=qty%>"/>
		<input type="hidden" value="<%=amt %>>"/>
	</form><td>
<td><td>
<td><form action="Register.jsp"><input type="submit" value="Register"/></form><td>

</table>
</center>
</font>
<% %>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>