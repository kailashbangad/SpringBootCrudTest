t<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
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
try{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:50818;databaseName=BookStore;integratedsecurity=true");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from Books where Book_id=101");
while(rs.next()){
	session.setAttribute("bookid", rs.getInt(1));
%>

<center>
<img src="C:\Users\Bhushan Bhapkar\workspace\BookStoreProject\BookStore3\WebContent\images\hp4.jpg" style="width:304px;height:228;">
	<table>
		<tr><td><font color="white">BookName</font><td><td><font color="white"> :</font> <td><td><font color="white"><%=rs.getString(2) %></font><td></tr> 
		<tr><td><font color="white">Author Name</font> <td><td><font color="white">:</font><td><td><font color="white"><%=rs.getString(3) %></font><td></tr>
		<tr><td><font color="white">Price</font><td><td><font color="white">:</font><td><td><font color="white"><%=rs.getInt(4) %></font><td></tr>

		<form action="./Calculate" method="post">
		<tr><td><font color="white">Enter Quantity</font><td><td><td> <td><input type="text" name="qty"/><input type="hidden" value="<%=rs.getInt(4)%>" name="price"/><input type="hidden" value="<%=rs.getString(2)%>" name="bookname"/><td>
		<tr><td><input type="submit" value="Purchase"></form><td><td><form action ="index.jsp"><input type="submit" value="cancel"/></form><td></tr>
	</table>
</center>

<%
}
}
catch(Exception e ){
	e.printStackTrace();
}

%>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>