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

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Fill the book details</h1>

				<form action="handle-book" method="post">
					<div class="mb-3">
						<label class="form-label">Book Name</label> <input type="text"
							name="name" class="form-control" aria-describedby="emailHelp">
					</div>

					<div class="mb-3">
						<label class="form-label">Author Name</label> <input type="text"
							name="author" class="form-control">
					</div>

					<div class="mb-3">
						<label class="form-label">Select your reading type</label> <select
							class="form-select" name="status">
							<option value="Not started yet" selected>Not started yet</option>
							<option value="Reading">Reading</option>
							<option value="Finished">Finished</option>
						</select>
					</div>

					<div class="mb-3">
						<label class="form-label">Issued To</label> <input type="text"
							name="issuedTo" class="form-control" aria-describedby="help">
						<div id="help" class="form-text">You can write the name of
							the person to whom you have given the book but if you have not
							given it to anyone then you can left it as it is</div>
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-secondary">Back</a>

						<button type="submit" class="btn btn-outline-success">Add</button>
					</div>
				</form>

			</div>

		</div>

	</div>


</body>
</html>