<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/RetrieveBooks" method="get">
<h1>Books:</h1>
<table border="1">
<tr>
<td>Title :</td>
<td>Author :</td>
<td>Category :</td>
</tr>
</table>
</form>
</body>
</html>