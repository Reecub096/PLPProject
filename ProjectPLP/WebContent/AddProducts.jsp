<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>
<table border="2" align="center" bordercolor="blue">
<a:form action = "Success" method="POST">
<tr>
<th> Product Name: </th>
<td> <a:input path="product_name"/> </td>
</tr>
<tr> 
<th> Product Price: </th>
<td> <a:input path="price"/> </td>
</tr>
<tr> 
<th> Quantity: </th>
<td> <a:input path=""/></td>
</tr>
<tr>
<th> Category: </th>
<td> <a:select path="quantity" items="${cato}"></a:select> </td>
</tr>
<tr>
<td><input type="submit" value="Add Products"></td>
</tr>
</a:form>
</table>
</body>
</html>