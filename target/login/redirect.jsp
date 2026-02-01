<!DOCTYPE html>
<html>
<head>
    <title>Send Redirect</title>
    <style>
        body { font-family: Arial; padding: 20px; }
        form { max-width: 300px; margin: 20px auto; }
        input { margin: 5px 0; padding: 8px; width: 100%; box-sizing: border-box; }
        input[type="submit"] { background-color: #007bff; color: white; cursor: pointer; }
    </style>
</head>
<body>
    <h2>Redirect Page</h2>

    <form action="RedirectServlet" method="get">
        <label>Enter search text</label><br>
        <input type="text" name="query" required><br><br>

        <input type="submit" value="Fetch">
    </form>
</body>
</html>
