<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST"
		action="${pageContext.request.contextPath}/subscription"
		modelAttribute="preferences">
		<table>
			<tr>
				<td>Subscribe to newsletter?:</td>
				<%-- Approach 1: Property is of type java.lang.Boolean --%>
				<td><form:checkbox path="receiveNewsletter" /></td>
			</tr>

			<tr>
				<td>Interests:</td>
				<%-- Approach 2: Property is of an array or of type java.util.Collection --%>
				<td>Quidditch: <form:checkbox path="interests"
						value="Quidditch" /> Herbology: <form:checkbox path="interests"
						value="Herbology" /> Defence Against the Dark Arts: <form:checkbox
						path="interests" value="Defence Against the Dark Arts" />
				</td>
			</tr>

			<tr>
				<td>Favourite Word:</td>
				<%-- Approach 3: Property is of type java.lang.Object --%>
				<td>Magic: <form:checkbox path="favouriteWord" value="Magic" />
				</td>
			</tr>

		</table>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>