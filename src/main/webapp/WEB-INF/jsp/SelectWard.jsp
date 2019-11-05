<!doctype html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>

<%@ include file="./globalDetails.jsp"%>
<title>Select ward here</title>
</head>
<body>
	<p>&nbsp;</p>
	<p>&nbsp;</p>


	<p>&nbsp;</p>
	<div style="width: 50%">

		<div class="container">
			<c:if test="${pageContext.request.userPrincipal.name != null}">
				<form id="logoutForm" method="POST" action="${contextPath}/logout">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>

				<h3>
					Welcome ${pageContext.request.userPrincipal.name} | <a
						onclick="document.forms['logoutForm'].submit()">Logout</a>
				</h3>
			</c:if>
		</div>

		<form:form method="POST" modelAttribute="WardDetails"
			action="/getList">
			<table style="align-content: center;" class="table table-bordered">
				<tr>
					<td>
						<h3 align="center">Ward details list</h3>
					</td>
				</tr>
				<tr>
					<td>Select Ward: <form:select path="wardId"
							items="${wardDetailsMap}" />

					</td>
				</tr>
				<tr>
					<td align="center"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>