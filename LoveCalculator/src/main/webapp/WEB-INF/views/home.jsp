<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator - Home</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #ff9a9e, #fad0c4); /* romantic gradient */
            margin: 0;
            padding: 0;
            text-align: center;
        }
        h1 {
            margin-top: 30px;
            color: #d81b60;
            font-size: 2.5em;
        }
        .container {
            background: #fff;
            padding: 40px;
            margin: 40px auto;
            width: 420px;
            border-radius: 15px;
            box-shadow: 0 6px 20px rgba(0,0,0,0.15);
        }
        label {
            font-weight: bold;
            margin-right: 10px;
            color: #333;
        }
        input[type="text"] {
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 6px;
            width: 60%;
        }
        .error {
            color: red;
            font-size: 14px;
            display: block;
            margin-top: 5px;
        }
        .checkbox-row {
            margin-top: 15px;
        }
        input[type="submit"] {
            background-color: #e91e63; /* pink button */
            color: white;
            border: none;
            padding: 10px 20px;
            margin-top: 20px;
            border-radius: 6px;
            cursor: pointer;
            font-weight: bold;
            font-size: 16px;
            transition: 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #c2185b;
        }
        .icon {
            font-size: 20px;
            margin-right: 5px;
        }
    </style>
</head>
<body>

    <h1>💖 Love Calculator 💘</h1>
    <hr/>

    <div class="container">
        <form:form action="home-process" method="POST" modelAttribute="userinfo">
            <p>
                <span class="icon">👤</span>
                <label>User Name:</label>
                <form:input path="username"/>
                <form:errors path="username" cssClass="error"/>
            </p>

            <p>
                <span class="icon">😍</span>
                <label>Crush Name:</label>
                <form:input path="crushname"/>
                <form:errors path="crushname" cssClass="error"/>
            </p>

            <p class="checkbox-row">
                <form:checkbox path="termsandprivacy"/>
                <label>📜 I agree this is just for fun</label>
                <form:errors path="termsandprivacy" cssClass="error"/>
            </p>

            <input type="submit" value="💘 Calculate Love 💘"/>
        </form:form>
    </div>

</body>
</html>
