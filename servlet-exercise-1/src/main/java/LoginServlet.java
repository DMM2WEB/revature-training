import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //when user enter correct details
        if(username.equals("admin") && password.equals("123")) {
            //successful
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeservlet");
            requestDispatcher.forward(request, response);
        } else {
            //failed
            out.println("Sorry, invalid username and or password");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
            requestDispatcher.include(request, response);
        }
    }
}
