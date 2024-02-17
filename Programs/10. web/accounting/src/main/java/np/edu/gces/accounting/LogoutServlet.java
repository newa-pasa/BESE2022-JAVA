package np.edu.gces.accounting;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


// session[1][username] = dilip
// session[2][username] = ram
// session[3][username] = hari
// session[4][username] = shyan


@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the current session or create a new one if it doesn't exist
        HttpSession session = request.getSession(false);

        if (session != null) {
            // Invalidate (destroy) the session
            session.invalidate();

            // Redirect to a logout success page or any other destination
            response.sendRedirect("/");
        } else {
            // If there is no active session, redirect to a login page or any other destination
            response.sendRedirect("login");
        }
    }
}
