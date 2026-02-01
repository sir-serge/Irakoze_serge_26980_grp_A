import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String query = request.getParameter("query");

        if (query != null && !query.trim().isEmpty()) {
            response.sendRedirect("https://www.google.com/search?q=" + URLEncoder.encode(query, "UTF-8"));
        } else {
            response.setContentType("text/html");
            response.getWriter().println(
                "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "<title>Search Error</title>" +
                "<style>" +
                "* { margin: 0; padding: 0; box-sizing: border-box; }" +
                "body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f5f5f5; padding: 40px 20px; }" +
                ".container { max-width: 500px; margin: 0 auto; }" +
                ".error { padding: 30px; border-radius: 8px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); background: linear-gradient(135deg, #ffeaea 0%, #ffcccc 100%); border-left: 5px solid #e74c3c; color: #c0392b; }" +
                ".error h1 { font-size: 24px; margin-bottom: 10px; }" +
                ".error p { font-size: 16px; line-height: 1.5; }" +
                "a { display: inline-block; margin-top: 30px; padding: 12px 30px; background-color: #3498db; color: white; text-decoration: none; border-radius: 5px; font-weight: bold; transition: background-color 0.3s; }" +
                "a:hover { background-color: #2980b9; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='container'>" +
                "<div class='error'>" +
                "<h1>⚠️ Search Query Required</h1>" +
                "<p>Please enter a search query in the search box.</p>" +
                "</div>" +
                "<center><a href='redirect.jsp'>← Back to Search</a></center>" +
                "</div>" +
                "</body>" +
                "</html>"
            );
        }
    }
}
