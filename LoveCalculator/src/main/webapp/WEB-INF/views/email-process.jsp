<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Sent</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #d4fc79, #96e6a1); 
            margin: 0;
            padding: 0;
            text-align: center;
        }
        .container {
            background-color: #ffffff;
            border-radius: 12px;
            padding: 40px;
            width: 500px;
            margin: 60px auto;
            box-shadow: 0 6px 20px rgba(0,0,0,0.15);
        }
        h1 {
            color: #2e7d32;
            margin-bottom: 20px;
            font-size: 22px;
            line-height: 1.4;
            word-wrap: break-word;   
            overflow-wrap: break-word; 
            max-width: 100%;
        }
        h2 {
            color: #333;
        }
        .success-icon {
            font-size: 60px;
            color: #4caf50;
            margin-bottom: 15px;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            border-radius: 6px;
            text-decoration: none;
            font-weight: bold;
            transition: 0.3s;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
   
    <div class="container">
        <div class="success-icon">✅</div>
        <h2>Hi ${userinfo.username} !</h2>
        <h1>Email successfully sent to <br/> ${emailinfo.email}</h1>

        <a href="/home">✨ Try with somebody else</a>
    </div>

</body>
</html>
