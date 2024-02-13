package np.edu.gces.accounting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");

        // Get the PrintWriter object to send HTML to the client
        PrintWriter out = response.getWriter();

        
        // Write HTML content to the response
        out.println("<html><head><title>Hello Servlet</title></head><body>");
        out.println("<h1>Hello, this is a simple servlet!</h1>");
        out.println("</body></html>");

        // Close the PrintWriter
        out.close();
    }

}
