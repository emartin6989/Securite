<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- il faut passer par la servlet de sécurité de java qui existe déjà -->
	<form action="j_security_check" method="post">
		<label>Login </label> <input type="text" name="j_username" /><br /> <label>Mot
			de passe</label> <input type="password" name="j_password" /><br /> <input type="submit"
			value="Connexion"></input>
	</form>
</body>
</html>