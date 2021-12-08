<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th> Number 1:</th>
<th><%=request.getAttribute("num1") %></th>
</tr>

<tr>
<th> Number 2:</th>
<th><%=request.getAttribute("num2") %></th>
</tr>

<tr>
<th> Result:</th>
<th><%
String no1=request.getAttribute("num1").toString();
String no2=request.getAttribute("num2").toString();
int c=Integer.parseInt(no1)+Integer.parseInt(no2);
out.println(c);
%></th>
</tr>
</table>

</body>
</html>