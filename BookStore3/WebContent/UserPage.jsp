<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
<%
String uname=request.getParameter("uname").toUpperCase();
String pwd=request.getParameter("pwd");

try{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:50818;databaseName=BookStore;integratedsecurity=true");
	Statement st =con.createStatement();
	ResultSet rs1= st.executeQuery("select * from User_Details where username='"+uname+"'");
	while(rs1.next())
	{
		int pno=rs1.getInt(3);
		String address=rs1.getString(4);
		session.setAttribute("pno", pno);
		session.setAttribute("address", address);	
	}
	
}
catch(Exception e)
{
	e.printStackTrace();
	}
// String bookname=(String)request.getAttribute("bookname");
// String amt=(String)request.getAttribute("amt");
// String qty=(String)request.getAttribute("qty");
String bookname=(String)session.getAttribute("bookname");
int qty=(int)session.getAttribute("qty");
int amt=(int)session.getAttribute("amt");
session.setAttribute("uname", uname);
%>
<font color="white">
<center>
	<h1>WELCOME <%=uname%>!!!</h1>
______________________________________________________________
</center>
<center>
<form action="./Order">
<table>
<tr><td>Book name<td><td>:<td><td><%= bookname%><td>
<tr><td>Quantity<td><td>:<td><td><%=qty %><td>
<tr><td>Amount<td><td>:<td><td><%=amt %><td>
<tr><td><input type="submit" value="Pay"/><td>
</table>
</form>
</font>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>