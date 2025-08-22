<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #f9fafb, #e0f7fa); /* soft gradient */
            margin: 0;
            padding: 0;
            text-align: center;
        }
        h2 {
            color: #333;
            margin: 20px 0 10px 0;
        }
        .form-box {
            background-color: #ffffff;
            border: 1px solid #ddd;
            border-radius: 12px;
            padding: 30px;
            width: 400px;
            margin: 40px auto;
            box-shadow: 0 6px 15px rgba(0,0,0,0.1);
        }
        label {
            font-weight: bold;
            margin-right: 10px;
            color: #555;
        }
        input[type="text"] {
            padding: 8px;
            border-radius: 6px;
            border: 1px solid #ccc;
            width: 70%;
        }
        input[type="submit"] {
            background-color: #007BFF; /* blue button */
            color: white;
            border: none;
            padding: 8px 16px;
            margin-top: 15px;
            border-radius: 6px;
            cursor: pointer;
            font-weight: bold;
            transition: 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        a {
            color: #007BFF;
            text-decoration: none;
            font-weight: bold;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
   
    <h2>Hi ${userinfo.username}</h2>
    <h2>Send result to your email</h2>
    
    <div class="form-box">
        <form:form action="email-process" method="GET" modelAttribute="emailinfo">
            <label>Your email ID:</label>
            <form:input path="email" />
            <br/><br/>
            <input type="submit" value="Send">
        </form:form>
    </div>

    <p>
        <a href="/">Try with somebody else</a>
    </p>
</body>
</html>
