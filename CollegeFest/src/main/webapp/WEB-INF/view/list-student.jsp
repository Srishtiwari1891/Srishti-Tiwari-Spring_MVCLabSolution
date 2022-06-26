<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Student Directory</title>
</head>
<body>
	<div class="container" style="margin-bottom:250px">
		<h3 style="align:center" class="display-4">Students Directory</h3>
		<a href="showFormForAdd">Add Student</a>

		<table class="table table-bordered table-striped" text-align="center">
			<thead class="thead-dark">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Course</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${students}" var="student">
					<tr>
						<td>${student.firstName}</td>
						<td>${student.lastName}</td>
						<td>${student.course}</td>
						<td>${student.country}</td>
						<td><a
							href="showFormForUpdate?studentId=${student.studentID}"
							class="btn btn-info btn-sm">Update</a> <a
							href="delete?studentId=${student.studentID}"
							onclick="if (!(confirm('Are you sure you want to delete this Student?'))) return false"
							class="btn btn-danger btn-sm">Delete</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
	
	<div style="text-align:center;background-color: #333;color:#fff;padding:20px;">Author: Srishti Tiwari
	<br><a href="mailto:code.with.srishti@gmail.com">code.with.srishti@gmail.com</a></div>
</body>
</html>