<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<script src="js/jquery-1.7.2.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#babaid").change(function(){
		alert("hi");
		$.ajax({
			url : "baba?bid="+$("#babaid").val(),
			type: "GET",
			success: function(data)
			{
				console.log(data);
				$("#fatherid").empty();
				for( var i=0; i<data.length; i++){
					$("#fatherid").append("<option value="+data[i].fid+">"+data[i].name+"</option>");
				}
			},
			error: function (errorThrown)
			{
				console.log(errorThrown);
			}
		});
	});
});
//--------------- child list
 $(document).ready(function(){
	$("#fatherid").change(function(){
		alert("hi");
		$.ajax({
			url : "father?fid="+$("#fatherid").val(),
			type: "GET",
			success: function(data)
			{
				console.log(data);
				$("#childid").empty();
				for( var i=0; i<data.length; i++){
					$("#childid").append("<option value="+data[i].cid+">"+data[i].cname+"</option>");
				}
			},
			error: function (errorThrown)
			{
				console.log(errorThrown);
			}
		});
	});
});


</script>
</head>
<body>
<f:form action ="registsave" modelAttribute="r" method="post">
<table border="3"  bgcolor="lightblue" align="center">
<tr>
<td>Grand Father Name </td>
<td>
<f:select path="bid" id="babaid" onchange="getFatherList()">
<f:option value="0" label="Baba id select"></f:option>
<c:forEach items="${babalist}" var="b">
<f:option value="${b.bid}">${b.bname} </f:option>
</c:forEach>
</f:select>
</td>
 <td>Father name</td>  <td><f:select path="fid" id="fatherid" onchange="geChildList()"></f:select></td> 
<td>Children name</td><td><f:select path="cid" id="childid"></f:select></td>
</tr>
<tr><td>phone</td><td><f:input path="phone"/></td></tr>
<tr><td>Gender</td><td><f:radiobutton path="gender" value="m"/>male</br>
<f:radiobutton path="gender" value="f"/>female
</td></tr>
<tr><td><input type="submit"></td> <td><a href=view>View Details</a> </td></tr>
</table>
</f:form>
</body>
</html>