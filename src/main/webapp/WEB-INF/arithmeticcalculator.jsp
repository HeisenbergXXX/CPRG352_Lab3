<%--
  Created by IntelliJ IDEA.
  User: Bennett
  Date: 24-Sep.-22
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Arithmetic Calculator</title>
</head>
<body>
<h1>Arithmetic Calculator</h1>
<form action="arithmetic" method="post">
    <table>
        <tr>
            <td><label>First: </label></td>
            <td><input type="text" name="num1" value="${num1}"></td>
        </tr>
        <tr>
            <td><label>Second: </label></td>
            <td><input type="text" name="num2" value="${num2}"></td>
        </tr>
    </table>
    <br>
    <input type="submit" name="operation" value="+">
    <input type="submit" name="operation" value="-">
    <input type="submit" name="operation" value="*">
    <input type="submit" name="operation" value="%">
    <br>
</form>
<div>
    <label>Result: </label>
    <span>${result}</span>
</div>
<%--link to age calculator--%>
<a href="age">Age Calculator</a>
</body>
</html>
