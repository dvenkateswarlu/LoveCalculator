<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator - Register</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #ffdde1, #ee9ca7); /* romantic gradient */
            margin: 0;
            padding: 0;
        }
        h1 {
            text-align: center;
            margin-top: 20px;
            color: #c2185b;
            font-size: 2.5em;
        }
        .form-container {
            background: #fff;
            padding: 30px;
            width: 500px;
            margin: 30px auto;
            border-radius: 15px;
            box-shadow: 0 6px 20px rgba(0,0,0,0.15);
        }
        label {
            display: inline-block;
            width: 120px;
            font-weight: bold;
            color: #444;
        }
        input[type="text"], input[type="password"], select {
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 6px;
            width: 60%;
            margin-top: 5px;
        }
        input[type="submit"] {
            background-color: #e91e63;
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
        .error {
            color: red;
            font-size: 13px;
            margin-left: 125px;
            display: block;
            text-align: left;
        }
        h3 {
            margin-top: 25px;
            color: #333;
            text-align: center;
        }
        .field-group {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>

    <h1>💖 Love Calculator - Register 💌</h1>
    <hr/>

    <div class="form-container">
        <form:form action="register-process" method="GET" modelAttribute="reginfo">

            <div class="field-group">
                <label>Name :</label>
                <form:input path="name" />
            </div>

            <div class="field-group">
                <label>User Name :</label>
                <form:input path="username" />
                <form:errors path="username" cssClass="error"/>
            </div>

            <div class="field-group">
                <label>Password :</label>
                <form:password path="password" />
                <form:errors path="password" cssClass="error"/>
            </div>

            <div class="field-group">
                <label>Country :</label>
                <form:select path="country">
                    <form:option value="India" label="India" />
                    <form:option value="USA" label="USA" />
                    <form:option value="United Kingdom" label="UK" />
                    <form:option value="France" label="France" />
                </form:select>
            </div>

            <div class="field-group">
                <label>Gender :</label>
                Male <form:radiobutton path="gender" value="male" />
                Female <form:radiobutton path="gender" value="female" />
                <form:errors path="gender" cssClass="error"/>
            </div>

            <div class="field-group">
                <label>Age :</label>
                <form:input path="age" />
                <form:errors path="age" cssClass="error" />
            </div>

            <h3>📩 Communication</h3>

            <div class="field-group">
                <label>Email :</label>
                <form:input path="communicationdto.email" />
                <form:errors path="communicationdto.email" cssClass="error"/>
            </div>

            <div class="field-group">
                <label>Phone :</label>
                <form:input path="communicationdto.phone" />
            </div>

            <input type="submit" value="💘 Register" />    

        </form:form>
    </div>

</body>
</html>
