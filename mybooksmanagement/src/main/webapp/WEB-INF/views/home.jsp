<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">My Books</h1>

				<table class="table table-success table-striped">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Book</th>
							<th scope="col">Author</th>
							<th scope="col">Status</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${books }" var="b">
							<tr>
								<th scope="row">${b.id }</th>
								<td><a href="book/${b.id }"
									style="text-decoration: none; color: black;">${b.name }</a></td>
								<td>${b.author }</td>
								<td>${b.status }</td>
								<td><a href="delete/${b.id}"><i class="fas fa-trash"
										style="font-size: 25px; color: red;"></i></a>
									&nbsp;&nbsp;&nbsp;&nbsp; <a href="update/${b.id}"><i
										class="fas fa-pen-nib" style="font-size: 25px;"></i></a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>

				<div class="container text-center">

					<a href="add" class="btn btn-outline-success">Add Book</a>

				</div>

			</div>

		</div>

	</div>
</body>
</html>