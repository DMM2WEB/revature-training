import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ThirdServlet extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("This is GET method of Third Servlet");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>Get method called</h1>");
        out.print(new Date().toString());
    }

    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("This is POST method of Third Servlet");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>Post method called</h1>");
        out.print(new Date().toString());
    }
}
