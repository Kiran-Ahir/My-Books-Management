<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">
				<table class="table table-striped">
					<tbody>
						<tr>
							<th scope="row">Id</th>
							<td>${book.id }</td>
						</tr>
						<tr>
							<th scope="row">Book Name</th>
							<td>${book.name }</td>
						</tr>
						<tr>
							<th scope="row">Author</th>
							<td>${book.author }</td>
						</tr>
						<tr>
							<th scope="row">Status</th>
							<td>${book.status }</td>
						</tr>
						<tr>
							<th scope="row">IssuedTo</th>
							<td>${book.issuedTo }</td>
						</tr>
						<tr>
							<th scope="row">Date Modified</th>
							<td>${book.dateModified }</td>
						</tr>
					</tbody>
				</table>

				<br> <br>
				<div class="container text-center">
					<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-secondary">Back</a> &nbsp;&nbsp;
					<a href="${pageContext.request.contextPath }/delete/${book.id}"
						class="btn btn-outline-danger">Delete</a> &nbsp;&nbsp;
					<a href="${pageContext.request.contextPath }/update/${book.id}"
						class="btn btn-outline-warning">Update</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>