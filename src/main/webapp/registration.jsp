<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./register_box.css"/>
</head>
<body bgcolor="gray">

<h3><code>If Register, Login</code></h3>
<h3><code>Else, Please Register</code></h3><br>
<br><br>

<div  class="register">
<form action="register" method="post">
Name: <input type="text" name="username"><br><br>
Email(UNIQUE): <input type="text" name="email"><br><br>
Phone.no: <input type="text" name="phone"><br><br>
Team: <select name="team" >
      <option value="RCB">RCB</option>
      <option value="CSK">CSK</option>
      <option value="MI">MI</option>
      <option value="KKR">KKR</option>
      <option value="DC">DC</option>
      <option value="PBKS">PBKS</option>
      <option value="RR">RR</option>
      <option value="SRH">SRH</option>
      <option value="GT">GT</option>
      <option value="LSG">LSG</option>
      </select><br><br>
State: <input type="text" name="state"><br><br>
Password: <Input type="password" name="password">
<br>
<br>
<br>
<input type="submit" value="submit">
</form> 
</div>


<br>
<br>
<h3>for login click here ----></h3>

<a href="login.jsp"><h1><code>LOGIN</code></h1></a>
</body>
</html>