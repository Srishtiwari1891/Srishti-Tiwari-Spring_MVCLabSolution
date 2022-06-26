<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
<title>Student Form for ${mode}</title>
</head>
<body>
	<div class="container" style="margin-bottom:120px">
		<h3 class="display-4">${mode} Student Form</h3>
		<table width="30%" text-align="center" border="0" align="center">
			<form action="save" method="POST">
				<div class="form-inline">
					<input type=hidden name="studentID" value="${student.studentID}" />
				</div>
				<tr>
					<div class="form-inline">
						<th align="center">First Name</th>
						<td>:</td>
						<td align="center"><input type="text" name="firstName"
							value="${student.firstName}" placeholder="First Name"
							class="form-control mb-4 col-10"></td>
					</div>
				</tr>
				<tr>
					<div class="form-inline">
						<th align="center">Last Name</th>
						<td>:</td>
						<td align="center"><input type="text" name="lastName"
							value="${student.lastName}" placeholder="Last Name"
							class="form-control mb-4 col-10"></td>
					</div>
				</tr>
				<tr>
					<div class="form-inline">
						<th align="center">Course</th>
						<td>:</td>
						<td align="center"><input type="text" name="course"
							value="${student.course}" placeholder="Course"
							class="form-control mb-4 col-10"></td>
					</div>
				</tr>
				<tr>
					<div class="form-inline">
						<th align="center">Country</th>
						<td>:</td>
						<td align="center"><input type="text" name="country"
							value="${student.country}" placeholder="Country"
							class="form-control mb-4 col-10"></td>
					</div>
				</tr>
				<tr>
					<td colspan="3" align="center">
						<button type="submit" class="btn btn-info col-4">Save</button>
					</td>
				</tr>
			</form>
			<a href="showForm">Back to Students List</a>
		</table>
	</div>
	<div style="text-align:center;background-color: #333;color:#fff;padding:20px;">Author: Srishti Tiwari
	<br><a href="mailto:code.with.srishti@gmail.com">code.with.srishti@gmail.com</a></div>
</body>
</html>