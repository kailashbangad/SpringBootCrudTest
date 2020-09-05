<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Data is : ${ob} <!-- This is toString method Output -->
<hr/>
 <%-- Syntax#2 ${objectName.variable} --%>
${ob.eid} , ${ob.ename }, ${ob.esal } </h1>
</body>
</html>