<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>PRODUCTS REGISTER PAGE </h2>
<form action="save" method="POST" >
<pre>
CODE: <input type="text" name="prodCode" placeholder="Enter CODE"/>
COST: <input type="text" name="prodCost"/>
TYPE: <select name="prodType">
		<option value="">-SELECT-</option>
		<option value="HIGH">HIGH</option>
		<option value="MID">MID</option>
		<option value="LOW">LOW</option>
		</select>
NOTE: <textarea name="prodNote"></textarea>
<input type="submit" value="Create"/>		
</pre>
</form>
${message }
</body>
</html>