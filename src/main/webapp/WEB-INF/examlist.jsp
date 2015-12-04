<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Exams</h1>
	<table id="table">
		<thead>
			<tr>
				<th>Subject</th>
				<th>Title</th>
				<th>Duration</th>
				<th>Version</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${examList}" var="exam">
				<tr>
					<td>${exam.subject}</td>
					<td>${exam.title}</td>
					<td>${exam.duration}</td>
					<td>${exam.version}</td>
					<td><a href="exams/${exam.id}">Go to exam</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="exams/newExam">Create new exam</a>
</body>
</html>