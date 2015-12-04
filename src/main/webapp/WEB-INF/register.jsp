<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crossover Test Maker</title>
</head>
<body>
	<form:form role="form" action="/users/addUser" method="post" modelAttribute="userView">
		<div>
			<form:label path="username" for="username">Username</form:label>
			<form:input type="text" path="username" id="username" required="true" autofocus="true"></form:input>
		</div>
		<div>
			<form:label path="password" for="password">Password</form:label>
			<form:input path="password" type="password" name="password" id="password" required="true"></form:input>
		</div>
		<button type="submit">Register</button>
	</form:form>
</body>
</html>