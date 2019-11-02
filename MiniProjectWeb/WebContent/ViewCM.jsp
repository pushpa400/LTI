<%@page import="java.util.List"%>
<%@page import="model.CM"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file='menu.jsp' %>
<table border=10 width=10>
<tr><th>CM Id</th><th>CMName</th><th>Qualification</th><th>State</th><th>End Date</th><th>Party</th></tr>
<%
	List<CM> plist=(List<CM>)request.getAttribute("plist");
	for (CM p:plist){
%>
<tr>
	<td><%=p.getCid()%></td><td><%= p.getCname() %></td>
	<td> <%= p.getQcategory() %> </td>
	<td> <%= p.getScategory() %> </td>
	<td> <%= p.getEnddate() %> </td>
	<td> <%= p.getParty() %></td>
</tr>	
<%
	}
%>
</table>
</body>
</html>