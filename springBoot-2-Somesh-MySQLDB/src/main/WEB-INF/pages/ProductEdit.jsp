<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h3>PRODUCT EDIT PAGE</h3>
<form:form action="update" method="POST" modelAttribute="product">
<pre>
ID    : <form:input path="prodId" readonly="true"/>
CODE  : <form:input path="prodCode"/>
COST  : <form:input path="prodCost"/>
TYPE: <form:select path="prodType">
		<form:option value="">-SELECT-</form:option>
		<form:option value="HIGH">HIGH</form:option>
		<form:option value="MID">MID</form:option>
		<form:option value="LOW">LOW</form:option>
		</form:select>
NOTE: <form:textarea path="prodNote"/>
	<input type="submit" value="Update"/>				
</pre>
</form:form>
</body>
</html>