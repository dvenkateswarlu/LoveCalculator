<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator - Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #ffdde1, #ee9ca7); /* soft romantic gradient */
            margin: 0;
            padding: 0;
        }
        h1 {
            text-align: center;
            margin-top: 30px;
            color: #333;
        }
        .login-box {
            background-color: #ffffff;
            border-radius: 12px;
            padding: 30px;
            width: 350px;
            margin: 40px auto;
            box-shadow: 0 6px 15px rgba(0,0,0,0.1);
            text-align: center;
        }
        label {
            display: inline-block;
            width: 90px;
            text-align: right;
            margin-right: 10px;
            font-weight: bold;
            color: #444;
        }
        input[type="text"], input[type="password"] {
            padding: 8px;
            border-radius: 6px;
            border: 1px solid #ccc;
            width: 60%;
        }
        input[type="submit"] {
            background-color: #e91e63; /* romantic pink */
            color: white;
            border: none;
            padding: 10px 20px;
            margin-top: 15px;
            border-radius: 6px;
            cursor: pointer;
            font-weight: bold;
            transition: 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #c2185b;
        }
        a {
            display: block;
            text-align: center;
            margin-top: 10px;
            font-weight: bold;
            text-decoration: none;
            color: #007BFF;
        }
        a:hover {
            text-decoration: underline;
        }
        .error {
            color: red;
            font-size: 14px;
            margin-left: 100px; /* aligns error with input field */
        }
        .global-error {
            color: red;
            text-align: center;
            font-weight: bold;
            margin-top: 15px;
        }
    </style>
</head>
<body>

    <h1>💖 Love Calculator</h1>
    <a href="/register">New here? Register</a>
    <hr/>

    <div class="login-box">
        <form:form action="login-process" method="POST" modelAttribute="loginfo">
            <p>
                <label>Email:</label>
                <form:input path="email"/>
                <form:errors path="email" cssClass="error"/>
            </p>
            <p>
                <label>Password:</label>
                <form:password path="password"/>
                <form:errors path="password" cssClass="error"/>
            </p>
            <input type="submit" value="Login"/>
        </form:form>

        <c:if test="${not empty error}">
            <p class="global-error">${error}</p>
        </c:if>
    </div>

</body>
</html>
