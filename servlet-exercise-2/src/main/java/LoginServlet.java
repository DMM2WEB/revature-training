import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        request.getRequestDispatcher("navbar.html").include(request, response);

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //when user enter correct details
        if(username.equals("admin") && password.equals("123")) {
            //successful
            out.println("You are successfully logged in");
            out.println("<br>Welcome " + username);

            Cookie cookie = new Cookie("username", username);
            response.addCookie(cookie);

        } else {
            //failed
            out.println("Sorry, invalid username and or password");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.html");
            requestDispatcher.include(request, response);
        }
    }
}
