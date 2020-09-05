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
<center><font color="white">
<h3>Thank you for using, <%=session.getAttribute("bookname") %> will be delivered to you in a week..<br>
<form action="index.jsp"><input type="submit" value="Back To Home"/></form>
</h3></font>
</center>
<a href="index.jsp">Go to Home</a> 
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>