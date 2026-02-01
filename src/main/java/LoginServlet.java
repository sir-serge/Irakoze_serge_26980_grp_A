import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Login Response</title>");
        out.println("<style>");
        out.println("* { margin: 0; padding: 0; box-sizing: border-box; }");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f5f5f5; padding: 40px 20px; }");
        out.println(".container { max-width: 500px; margin: 0 auto; }");
        out.println(".message { padding: 30px; border-radius: 8px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); margin-bottom: 30px; }");
        out.println(".weak { background: linear-gradient(135deg, #ffeaea 0%, #ffcccc 100%); border-left: 5px solid #e74c3c; color: #c0392b; }");
        out.println(".strong { background: linear-gradient(135deg, #d4edda 0%, #ccffcc 100%); border-left: 5px solid #27ae60; color: #1e7e34; }");
        out.println(".message h1 { font-size: 24px; margin-bottom: 10px; }");
        out.println(".message p { font-size: 16px; line-height: 1.5; }");
        out.println(".username { font-weight: bold; color: inherit; }");
        out.println("a { display: inline-block; margin-top: 20px; padding: 12px 30px; background-color: #3498db; color: white; text-decoration: none; border-radius: 5px; font-weight: bold; transition: background-color 0.3s; }");
        out.println("a:hover { background-color: #2980b9; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");

        if (password.length() < 8) {
            out.println("<div class='message weak'>");
            out.println("<h1>⚠️ Password Too Weak</h1>");
            out.println("<p>Hello <span class='username'>" + username + "</span>, your password is weak. Please try a strong one (minimum 8 characters).</p>");
            out.println("</div>");
        } else {
            out.println("<div class='message strong'>");
            out.println("<h1>✓ Welcome!</h1>");
            out.println("<p>Welcome <span class='username'>" + username + "</span>! Your password is strong.</p>");
            out.println("</div>");
        }

        out.println("<center><a href='login.jsp'>← Back to Login</a></center>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
