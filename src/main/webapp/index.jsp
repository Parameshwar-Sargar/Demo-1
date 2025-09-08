<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e3f2fd;
            text-align: center;
            padding: 50px;
        }

        h1 {
            color: #1565c0;
            margin-bottom: 30px;
        }

        a {
            display: inline-block;
            background-color: #1976d2;
            color: white;
            text-decoration: none;
            padding: 14px 25px;
            margin: 10px;
            border-radius: 8px;
            font-size: 18px;
            transition: background 0.3s ease, transform 0.2s;
        }

        a:hover {
            background-color: #1565c0;
            transform: scale(1.05);
        }

        form {
            margin-top: 20px;
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
        }

        input[type="submit"]:hover {
            background-color: #2e7d32;
            transform: scale(1.05);
        }
    </style>
</head>
<body>

    <h1>Student Management System</h1>

    <a href="register.jsp">Click for Register</a><br><br>
    <a href="update.jsp">Click for Update</a><br><br>
    <a href="select.jsp">Click for Select</a><br><br>
    <a href="delete.jsp">Click for Delete</a><br><br>

    <form action="selectalldata" method="post">
        <input type="submit" value="Show All Students">
    </form>

</body>
</html>
