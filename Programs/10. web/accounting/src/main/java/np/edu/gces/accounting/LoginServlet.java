package np.edu.gces.accounting;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet implements Servlet {

    private ServletConfig config;

    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpServletResponse httpResponse = (HttpServletResponse) response;

            // Retrieve the existing session or create a new one
            HttpSession session = httpRequest.getSession(true);

            // Check if the user is already logged in
            String username = (String) session.getAttribute("username");

            if (username != null) {
                // User is already logged in
                showWelcomePage(httpRequest, httpResponse, username);
            } else {
                // Check if the login form is submitted
                if ("POST".equalsIgnoreCase(httpRequest.getMethod())) {
                    // Process login form submission
                    handleLoginForm(httpRequest, httpResponse, session);
                } else {
                    // Display the login form
                    showLoginForm(httpRequest, httpResponse);
                }
            }
        }
    }

    private void showLoginForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/LoginForm.jsp");
        dispatcher.forward(request, response);
    }

    private void handleLoginForm(HttpServletRequest request, HttpServletResponse response, HttpSession session)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // read password from database for given username and compare
        // in below if statememnt

        if (username != null && !username.isEmpty()) {
            // Store the username in the session
            session.setAttribute("username", username);

            // Display the welcome page
            showWelcomePage(request, response, username);
        } else {
            // Invalid username, show login form again
            showLoginForm(request, response);
        }
    }

    private void showWelcomePage(HttpServletRequest request, HttpServletResponse response, String username)
            throws ServletException, IOException {
        // Set multiple cookies
        // Set a cookie to remember the username
        Cookie usernameCookie = new Cookie("username", username);
        Cookie cookie1 = new Cookie("cookie1", "value1");
        Cookie cookie2 = new Cookie("cookie2", "value2");

        // Set additional attributes for cookies
        cookie1.setMaxAge(3600); // Cookie1 expires in 1 hour
        cookie2.setPath("/"); // Cookie2 is valid for the entire context path

        // Add cookies to the response
        response.addCookie(usernameCookie);
        response.addCookie(cookie1);
        response.addCookie(cookie2);

        // this is for jsp page to create dynamic content
        request.setAttribute("username", username);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Welcome.jsp");
        dispatcher.forward(request, response);
    }

    public void destroy() {
        // Clean up resources, if any
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "Login Servlet Example";
    }
}
