<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>In View</title>
</head>
<body>
<h2>List of Peoples!</h2>
<table border="100">
    <tr>
        <th>Name</th>
        <th>Last Name</th>
        <th>Email</th>
    </tr>
    <c:forEach var="person" items="${peoples}">
        <tr>
            <td>${person.name}</td>
            <td>${person.lastName}</td>
            <td>${person.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>