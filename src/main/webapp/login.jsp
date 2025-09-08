<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e3f2fd;
            text-align: center;
            padding: 50px;
        }

        p {
            color: red;
            font-size: 18px;
            font-weight: bold;
        }

        form {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            display: inline-block;
        }

        input[type="text"], input[type="password"] {
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
            padding: 14px 25px;
            font-size: 18px;
            border-radius: 8px;
            cursor: pointer;
            transition: background 0.3s ease, transform 0.2s;
            width: 100%;
        }

        input[type="submit"]:hover {
            background-color: #2e7d32;
            transform: scale(1.05);
        }
    </style>
</head>
<body>

    <p>${ErrorMassgess}</p>

    <form action="logindata" method="post">
        <input type="text" name="id" placeholder="Enter User ID" required />
        <input type="password" name="pwd" placeholder="Enter Password" required />
        <input type="submit" value="Click For Login" />
    </form>

</body>
</html>
