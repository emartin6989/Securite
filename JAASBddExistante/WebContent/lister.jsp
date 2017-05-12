<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, metier.Client"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css" />
<title>Liste des clients</title>
</head>
<body>
	<%
		List<Client> lesClients = ((List<Client>) request.getAttribute("lesClients"));
	%>
	<div id="content">
		<div class="block">
			<h2>Lister les clients</h2>
			<table>
				<tr>
					<th>id</th>
					<th>nom</th>
					<th>prenom</th>
					<th>couleuryeux</th>
					<th>age</th>
				</tr>
				<%
					for (Client c : lesClients) {
				%>
				<tr>
					<td><%=c.getId()%></td>
					<td><%=c.getNom()%></td>
					<td><%=c.getPrenom()%></td>
					<td><%=c.getCouleuryeux()%></td>
					<td><%=c.getAge()%></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
	</div>

</body>
</html>