<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
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
<body bgcolor="gray" >
<jsp:include page="header.jsp"></jsp:include>
<%
try{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:50818;databaseName=BookStore;integratedsecurity=true");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from Books");
int i=1;
%>
<font color="white"><center>
<table>
<tr><td>Serial No.<td><td>BookName<td><td>Author<td><td>Price<td></tr>
<%
while(rs.next())
{%>
<tr><td><%=i%>.<td><td><a href="<%=i %>BookPage.jsp"><%=rs.getString(2)%></a><td><td><%=rs.getString(3) %><td><td><%=rs.getInt(4)%></td>
<% i++;	
}

}
catch(Exception e){
	e.printStackTrace();

}
%>
</table></center>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>