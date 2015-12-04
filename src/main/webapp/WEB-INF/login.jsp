<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crossover Test Maker</title>
</head>
<body>
	<form role="form" action="/login" method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<div>
			<label for="username">Username</label> <input type="text"
				name="username" id="username" required autofocus>
		</div>
		<div>
			<label for="password">Password</label> <input type="password"
				name="password" id="password" required>
		</div>
		<div>
			<label for="remember-me">Remember me</label> <input type="checkbox"
				name="remember-me" id="remember-me">
		</div>
		<button type="submit">Login</button>
	</form>
	<div>
		<a href="/users/register">Register</a>
	</div>

	<c:if test="${not empty error}">
		<div>${error}</div>
	</c:if>
	<c:if test="${not empty msg}">
		<div>${msg}</div>
	</c:if>
</body>
</html>