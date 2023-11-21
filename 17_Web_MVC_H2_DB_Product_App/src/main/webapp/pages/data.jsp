<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<!-- taglib librabry from jstl so we can us efrEach method of it -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Getting All Product Data</title>
<body>
<a href ="/">+Add New products</a>

	<h3>List of All Products</h3>
	<table border="1">
		<thead>
			<tr>
				<th>S.NO</th>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${productObjKey}" var="product" varStatus="index"> <!-- takeo one project obj nd store in variable product -->
				<tr>
					<td>${index.count}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.qty}</td>
				</tr>
			</c:forEach>

		</tbody>


	</table>

</body>

</head>
</html>