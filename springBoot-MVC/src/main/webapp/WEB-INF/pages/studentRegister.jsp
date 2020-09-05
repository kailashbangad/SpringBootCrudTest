<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>  
body{  
font-family: Calibri, Helvetica, sans-serif;  
background-color: pink;  
}  
.container {  
padding: 50px;  
background-color: lightblue;  
}  
  
input[type=text] {  
  width: 100%;  
  padding: 15px;  
margin: 5px 0 22px 0;  
display: inline-block;  
 border: none;  
 background: #f1f1f1;  
}  
input[type=text]:focus {  
background-color: orange;  
outline: none;  
}  
 div {  
         padding: 10px 0;  
              
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
opacity: 1;  
}  
</style>  
</head>  
<body>  
<div class="container">  
<center>  <h1> Student Registeration Form</h1> </center>  
<form action="process" method="post">  
<label> Firstname </label>   
<input type="text" name="firstname" placeholder= "Firstname" size="15" required />   
  
<label> Lastname: </label>    
<input type="text" name="lastname" placeholder="Lastname" size="15"required />   
<div>  
  
<label>   
Gender :  
</label><br>  
<input type="radio" value="Male" name="gender" checked > Male   
<input type="radio" value="Female" name="gender"> Female   
<input type="radio" value="Other" name="gender"> Other  
  
<div>  
<label>   
Phone :  
</label>  
<input type="text" name="phone" placeholder="phone no." size="10" required>   
</div>  
<button type="submit" class="registerbtn">Register</button>    
</form>  
</body>
</html>