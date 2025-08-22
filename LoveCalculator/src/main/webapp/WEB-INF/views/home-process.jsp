<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator - Result</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #ff9a9e, #fad0c4); /* romantic gradient */
            margin: 0;
            padding: 0;
            text-align: center;
        }
        .container {
            background: #fff;
            padding: 40px;
            margin: 50px auto;
            width: 500px;
            border-radius: 15px;
            box-shadow: 0 6px 20px rgba(0,0,0,0.15);
        }
        h2 {
            color: #c2185b;
            margin: 15px 0;
        }
        .names {
            font-size: 1.4em;
            font-weight: bold;
            color: #444;
        }
        .result {
            font-size: 1.6em;
            font-weight: bold;
            color: #e91e63;
            margin-top: 15px;
        }
        a {
            display: inline-block;
            margin: 10px;
            padding: 10px 18px;
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
        .icon {
            font-size: 24px;
            margin-right: 5px;
        }
    </style>
</head>
<body>
   
    <div class="container">
		<h2>💖 The Love Calculator Predicts 💖</h2>
		<p class="names">
		    ${userinfo.username} ❤️ ${userinfo.crushname}
		</p>
		<p class="result">💘 Your compatibility result: ${userinfo.result} 💘</p>

		<div>
		    <a href="/email">📩 Send the result to your email</a>
		    <a href="/home">🔄 Try with someone else</a>
		    <a href="/">📜 View user history</a>
		</div>

    </div>

</body>
</html>
