package np.edu.gces.accounting;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello_jsp")
public class HelloWorldJspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String name = "BESE 2022";

        // Set attribute to be accessed in JSP
        request.setAttribute("dynamic_content", name);

        // connect database
        // get student

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/HelloWorld.jsp");
        dispatcher.forward(request, response);
    }

}
