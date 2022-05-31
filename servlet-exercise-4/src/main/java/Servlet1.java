import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        out.println("Welcome to Servlet1 " + name);

        //create a form that have hidden (invisible) text field
        out.println("<form action='Servlet2' method='get'>");
        out.println("<input type='hidden' name='username' value=' " + name + "' />");
        out.println("<input type='submit' value='Send' />");
        out.println("</form>");
    }
}
