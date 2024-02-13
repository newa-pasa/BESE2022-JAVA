The life cycle of a Java servlet refers to the various stages a servlet goes through from its instantiation to its destruction. The Servlet API defines three main stages in the life cycle of a servlet:

1. **Initialization (init):**
   - **Description:** This stage occurs when the servlet is first created. It is executed only once during the entire lifespan of the servlet.
   - **Method Invoked:** The `init(ServletConfig config)` method is invoked by the servlet container to initialize the servlet.
   - **Purpose:** This stage is typically used for one-time initialization tasks, such as loading configuration parameters or establishing database connections.

2. **Request Handling (service):**
   - **Description:** This stage represents the servlet's main functionality. It is executed for each incoming client request.
   - **Method Invoked:** The `service(ServletRequest request, ServletResponse response)` method is invoked by the servlet container to handle client requests. This method is responsible for processing the request and generating the response.
   - **Purpose:** This is where the core logic of the servlet is implemented. The `service` method is called for each HTTP method (GET, POST, etc.) independently.

3. **Destruction (destroy):**
   - **Description:** This stage occurs when the servlet is being taken out of service or the servlet container is shutting down.
   - **Method Invoked:** The `destroy()` method is invoked by the servlet container to allow the servlet to release any resources it is holding (e.g., close database connections, release memory).
   - **Purpose:** Cleanup tasks are performed in this stage. It provides an opportunity to release resources acquired during the servlet's lifespan.

The following is a brief summary of the life cycle stages:

- **Instantiation:** The servlet is created using its constructor.
- **Initialization:** The `init` method is called to perform one-time initialization.
- **Request Handling:** The `service` method handles client requests. It is called for each request.
- **Destruction:** The `destroy` method is called when the servlet is being taken out of service.

**Note:** If a servlet needs to be initialized with parameters, the `init` method is typically overridden and receives a `ServletConfig` object, which contains initialization parameters specified in the deployment descriptor (`web.xml`). Similarly, if a servlet needs to access the `ServletContext`, it can be obtained from the `ServletConfig` during initialization.

Below is a simple example of a servlet illustrating the life cycle methods:

```java
import javax.servlet.*;
import java.io.IOException;

public class MyServlet implements Servlet {

    public void init(ServletConfig config) throws ServletException {
        // Initialization code goes here
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Request handling code goes here
    }

    public void destroy() {
        // Cleanup code goes here
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return null;
    }
}
```

In this example, the `init`, `service`, and `destroy` methods are placeholders where you would add your specific initialization, request handling, and cleanup code, respectively.