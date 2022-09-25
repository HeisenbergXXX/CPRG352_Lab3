<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - agecalculator</title>
</head>
<body>
<h1><%= "Age Calculator" %></h1>
<br/>
<form action="age" method="post">
    <div><label>Enter your Age:</label>
        <input type="text" name="age" value="${age}"/>
    </div>
    <div><br/>
        <input type="submit" value="Age next birthday"/>
    </div>
</form>
<div>
    <p>${message}</p>
</div>
<%--link to Arithmetic Calculator JSP--%>
<a href="arithmetic">Arithmetic Calculator</a>
</body>
</html>