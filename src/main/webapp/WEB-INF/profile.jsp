<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${user.username}</h1>
	<h2>Previous exams</h2>
	<table id="table">
		<thead>
			<tr>
				<th>Exam</th>
				<th>Date</th>
				<th>Score</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${examUserViewList}" var="examUser">
				<tr>
					<td>${examUser.examTitle}</td>
					<td>${examUser.date}</td>
					<td>${examUser.score}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="exams">Do another exam</a>

</body>
</html>