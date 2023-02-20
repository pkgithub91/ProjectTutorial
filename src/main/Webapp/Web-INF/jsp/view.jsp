<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3" bgcolor="cyan">
<tr bgcolor="lightpink"><td>Baba Name</td><td>Father Name </td><td>Children Name</td><td>Phone</td><td> Gender</td></tr>
<c:forEach items="${cmn}" var="h">
<tr>
<td><c:out value="${h.bname}"></c:out></td>
<td><c:out value="${h.name}"></c:out></td>
<td><c:out value="${h.cname}"></c:out></td>
<td><a href=update?mob=<c:out value="${h.phone}"></c:out>><c:out value="${h.phone}"></c:out></a></td>
<td><c:out value="${h.gender}"></c:out></td>

</tr>


</c:forEach>
<tr><td><a href=pdf>DownLoadPdf</a></td></tr>


</table>
</body>
</html>