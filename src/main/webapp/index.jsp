<html>
<head>
    <meta charset="UTF-8">
    <title>Servlet Assignments</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 50px;
            background-color: #f0f0f0;
        }
        
        h1 {
            color: #333;
            margin-bottom: 40px;
        }
        
        .assignments {
            display: flex;
            gap: 30px;
            justify-content: center;
            flex-wrap: wrap;
        }
        
        .assignment-card {
            background-color: white;
            padding: 30px;
            border: 1px solid #ddd;
            width: 300px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }
        
        .assignment-card h2 {
            margin-top: 0;
            color: #333;
        }
        
        .assignment-card p {
            color: #666;
            line-height: 1.6;
            margin: 15px 0;
        }
        
        a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            margin-top: 10px;
        }
        
        a:hover {
            background-color: #0c3969;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Servlet Assignments</h1>
        
        <div class="assignments">
            <div class="assignment-card">
                <h2>Assignment 1</h2>
                <p><strong>Login Servlet</strong></p>
                <p>Design a login page with username and password. Validate password strength (minimum 8 characters).</p>
                <a href="login.jsp">Go to Login</a>
            </div>
            
            <div class="assignment-card">
                <h2>Assignment 2</h2>
                <p><strong>Send Redirect</strong></p>
                <p>Search box that redirects to Google with your query using sendRedirect().</p>
                <a href="redirect.jsp">Go to Search </a>
            </div>
        </div>
    </div>
</body>
</html>
