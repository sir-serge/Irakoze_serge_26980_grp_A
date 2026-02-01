<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body { font-family: Arial; padding: 20px; }
        form { max-width: 300px; margin: 20px auto; }
        input { margin: 5px 0; padding: 8px; width: 100%; box-sizing: border-box; }
        input[type="submit"] { background-color: #007bff; color: white; cursor: pointer; }
    </style>
</head>
<body>
    <h2>Login</h2>

    <form action="LoginServlet" method="post">
        <label>Username</label><br>
        <input type="text" name="username" required><br><br>

        <label>Password</label><br>
        <input type="password" name="password" required><br><br>

        <input type="submit" value="Login">
        <a href='index.jsp'>← Back to HOME</a>
    </form>
</body>
</html>
