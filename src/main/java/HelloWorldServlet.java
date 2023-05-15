import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

            String name = request.getParameter("name");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            if (name == null) {
                out.println("<h1> Hello, World! and Mars </h1>");
            } else {
                out.println("<h1> Hello, </h1>" + name + "<h1>and Mars </h1>");
            }


        }
    }


