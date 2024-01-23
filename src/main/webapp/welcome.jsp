<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store, must-revalidate");
if(session.getAttribute("loginName")==null && session.getAttribute("loginPassword")==null){
	response.sendRedirect("login.jsp");
}
%>
<br><br><br>
<center>
<h1>welcome ${loginName} </h1>

<a href="video.html"><code>VIDEOS</code></a>
</center>

<br>
<br>
<form action="logout" method="post">
<input type="submit" value="LOGOUT">
</form>


<br><br>


<form action="delete_account" method="post">
<input type="submit" value="Delete My Account">
</form>
</body>
</html>