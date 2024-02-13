package np.edu.gces.accounting;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Perform some logic
        String message = "Please fill the form!";

        // Set attribute to be accessed in JSP
        request.setAttribute("message", message);

        // Forward the request to the JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/RegistrationForm.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String mobile = request.getParameter("mobile");

        Student student = new Student(name, roll, age, sex, mobile);
        
        // Process the data (you can store it in a database or perform other actions)

        // Set the new Student object as an attribute in the request
        request.setAttribute("student", student);


        // Forward to a confirmation page (you can redirect to another JSP or HTML page)
        request.getRequestDispatcher("/WEB-INF/jsp/RegistrationConfirm.jsp").forward(request, response);
    }
}
