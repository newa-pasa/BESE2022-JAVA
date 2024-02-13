package np.edu.gces.accounting;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;


@WebServlet("/lifecycle")
public class LifecycleServlet implements Servlet {

    private ServletConfig config;

    public void init(ServletConfig config) throws ServletException {
        System.out.println("This is init() function");
        this.config = config;
    }

    public void service(ServletRequest request, ServletResponse response) 
    throws ServletException, IOException {
        
        System.out.println("This is service() function");
        // Check the request method
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;

            // Handle GET request
            if (httpRequest.getMethod().equalsIgnoreCase("GET")) {
                handleGetRequest(httpRequest, response);
            }
            // Handle POST request
            else if (httpRequest.getMethod().equalsIgnoreCase("POST")) {
                handlePostRequest(httpRequest, response);
            }
            // Handle other HTTP methods
            else {
                // Respond with an error for unsupported methods
                response.setContentType("text/html");
                java.io.PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head><title>Unsupported Method</title></head>");
                out.println("<body>");
                out.println("<h1>Unsupported HTTP Method</h1>");
                out.println("<p>This servlet only supports GET and POST methods.</p>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }

    private void handleGetRequest(HttpServletRequest request, ServletResponse response) throws IOException {
        // Handle the GET request here
        String message = "Hello, this is a raw servlet! (GET)";
        writeResponse(response, message);
    }

    private void handlePostRequest(HttpServletRequest request, ServletResponse response) throws IOException {
        // Handle the POST request here
        String message = "Hello, this is a raw servlet! (POST)";
        writeResponse(response, message);
    }

    private void writeResponse(ServletResponse response, String message) throws IOException {
        // Set content type
        response.setContentType("text/html");

        // Get the PrintWriter
        java.io.PrintWriter out = response.getWriter();

        // Write the response
        out.println("<html>");
        out.println("<head><title>Raw Servlet Example</title></head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
        System.out.println("This is destroy() function");
        // Clean up resources, if any
    }

    public ServletConfig getServletConfig() {
        System.out.println("This is getServletConfig() function");
        return config;
    }

    public String getServletInfo() {
        System.out.println("This is getServletInfo() function");
        return "Raw Servlet Example";
    }
}