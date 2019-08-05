<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Rating</title>
</head>
<body>
<<div class="jumbotron">
  <h1 class="display-3">Who's the best in the D </h1>
  <p class="lead">Vote for your favorite restaurant</p> 

</div>

<table class="table">
		<thead>
		<tr class="table-info">
      <th scope="row">Name</th>
      <th scope="row">Rating</th>
      <th scope="row">Vote</th>
    </tr>
		</thead>
		<tbody>
			<c:forEach var="place" items="${place}">
				<tr class="table-info">
					<td>${place.name}</td>
					<td>${place.rating}</td>
					<td>
						<a href="/resta/up?id=${place.id }"
						class="btn btn-light btn-sm">UP Vote</a>
						
						 <a href="/resta/down?id=${place.id }"
						class="btn btn-light btn-sm">Down Vote</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>