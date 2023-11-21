<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

	<body>
		<h2> STUDENT ENQUIRY FORM</h2>
		<p><font color="blue">${msg}</font></p>
		
		<form:form action="save"  modelAttribute="student" method="POST"> <%--Here action="save" meaning save is the url pattern of postmapping once you save the button it will capture the data in the obj and call save method --%>
		
			<table>
				<tr>
					<td>Name:</td>
					<td><form:input path="name"/>

				</tr>
				
				<tr>
					<td>Email:</td>
					<td><form:input path="email"/>	
				</tr>
				
				<tr>
					<td>Gender:</td>
					<td><form:radiobutton path="gender" value="M"/>MALE
					<td><form:radiobutton path="gender" value="F"/>FEMALE
				</tr>
				<tr>
					<td>Course:</td>
					<td>
						<form:select path="course">
							<form:option value="">-SELECT-</form:option>
							<form:option value="java">JAVA</form:option>
							<form:option value="python">PYTHON</form:option>
							<form:option value="c++">C++</form:option>
							
						</form:select>
				<tr>
					<td></td>		
					<td><input type="submit" value="save" ></td>
								
			
			
			
			</table>
		
		</form:form>
	
	</body>




</html>