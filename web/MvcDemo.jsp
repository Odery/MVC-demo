<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>In View</title>
</head>
<body>
<h2>List of Peoples!</h2>
<c:forEach var="name" items="${peoples}">
    ${name} <br/>
</c:forEach>
</body>
</html>