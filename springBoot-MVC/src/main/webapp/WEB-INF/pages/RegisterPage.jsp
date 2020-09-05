<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</head>
<body>
<div class ="container text-centre mt-5">
<div>
<h1 class="text-centre">${Header}</h1>
<p class ="text-centre">${Desc}</p>
<hr>

</div>
<H3 >WELCOME TO EMPLOYEE REGISTER PAGE</H3>

<form action="display" method="POST">
<pre>
ID   : <input type="text" name="empId"/>
NAME : <input type="text" name="empName"/>
SAL  : <input type="text" name="empSal"/>

Gender:
	<input type="radio" name="empGen" value="Male"> Male
	<input type="radio" name="empGen" value="Female"> Female
	
Project:
    <select name="empPrj">
    	<option value="">-SELECT-</option>
    	<option value="HTC">HTC</option>
    	<option value="NIT">NIT</option>
    	<option value="ABC">ABC</option>
    </select>

Address:
	<textarea name="empAddr"></textarea>

Languages:
  <input type="checkbox" name="empLang" value="ENG"/> ENG
  <input type="checkbox" name="empLang" value="HIN"/> HIN
  <input type="checkbox" name="empLang" value="TEL"/> TEL
  <input type="checkbox" name="empLang" value="TAM"/> TAM
   	
DOJ : <input type="date" name="empDoj" />   

Branches:
	 <select name="empBrnch" multiple="multiple">
    	<option value="">-SELECT-</option>
    	<option value="B1">B1</option>
    	<option value="B2">B2</option>
    	<option value="B3">B3</option>
    </select>
 
 <input type="submit" value="Create"/>
</pre>
</form>
</div>
</body>
</html>