<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="save" modelAttribute="r" method="Post">

		<table>

			<tr>
				<td>State Name</td>
				<td><form:select path="stCode">

						<form:option value="0">---Select---</form:option>

						<form:options items="${lst }" itemLabel="stCode" itemValue="stName" />

					</form:select></td>


			</tr>

			<tr>
				<td>District</td>

			</tr>


			<tr>
				<td>Name</td>
				<form:input path="name" />

			</tr>




		</table>



	</form:form>

</body>
</html>