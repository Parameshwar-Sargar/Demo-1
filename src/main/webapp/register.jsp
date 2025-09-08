<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e3f2fd;
            text-align: center;
            padding: 50px;
        }

        form {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            display: inline-block;
            width: 300px;
        }

        input[type="text"], input[type="submit"] {
            width: 90%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #388e3c;
            color: white;
            border: none;
            font-size: 18px;
            cursor: pointer;
            transition: background 0.3s ease, transform 0.2s;
        }

        input[type="submit"]:hover {
            background-color: #2e7d32;
            transform: scale(1.05);
        }
    </style>
</head>
<body>

    <h1>Student Registration</h1>

    <form action="registerStd" method="post">
        <input type="text" name="iD" placeholder="Enter Student ID" required />
        <input type="text" name="stdName" placeholder="Enter Student Name" required />
        <input type="text" name="address" placeholder="Enter Student Address" required />
        <input type="text" name="marks" placeholder="Enter Student Marks" required />
        <input type="submit" value="Register"/>
    </form>

</body>
</html>
