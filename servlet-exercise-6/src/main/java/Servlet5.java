import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet5 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //getting the value from query string
        String name = request.getParameter("name");
        out.println("Welcome to Servlet5 " + name);

        HttpSession session = request.getSession();
        session.setAttribute("username", name);
        out.println("<h1><a href='Servlet6'>Click Here</a></h1>");
        out.close();
    }
}
