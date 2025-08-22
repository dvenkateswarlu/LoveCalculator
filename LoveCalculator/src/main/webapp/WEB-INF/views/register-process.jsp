<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .process {
            background-color: ;
            border: 2px solid #ffffff;
            border-radius: 10px;
            box-shadow: 5px 5px 10px rgba(0,0,0,0.1);
            width: 50%;
            margin: auto;
            padding: 20px;
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: auto;
        }
        table th, table td {
            padding: 10px;
            text-align: left;
        }
        table th {
            width: 40%;
            text-align: right;
            padding-right: 20px;
        }
        table td {
            text-align: left;
            font-weight: bold;
        }
        h1 {
            text-align: center;
        }
        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            font-weight: bold;
            text-decoration: none;
            color: blue;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
   
    <h1>The User & Crush Registration Details</h1>
    <hr/>
    <div class="process">
        <table>
            <tr>
                <th>Name :</th>
                <td>${reginfo.name}</td>
            </tr>
            <tr>
                <th>User Name :</th>
                <td>${reginfo.username}</td>
            </tr>
            <tr>
                <th>Password :</th>
                <td>${reginfo.password}</td>
            </tr>
            <tr>
                <th>Country :</th>
                <td>${reginfo.country}</td>
            </tr>
            <tr>
                <th>Gender :</th>
                <td>${reginfo.gender}</td>
            </tr>
            <tr>
                <th>Age :</th>
                <td>${reginfo.age}</td>
            </tr>
            <tr>
                <th>Email :</th>
                <td>${reginfo.communicationdto.email}</td>
            </tr>
            <tr>
                <th>Phone Number :</th>
                <td>${reginfo.communicationdto.phone}</td>
            </tr>
        </table>
    </div>

    <a href="/">Back To Login</a>
</body>
</html>
