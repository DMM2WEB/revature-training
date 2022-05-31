import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service called...");
        servletResponse.setContentType("text/html");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("<h1>Welcome to Second Servlet<h1>");
        printWriter.println("</body></html>");
    }
}
