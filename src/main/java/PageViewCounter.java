import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageViewCounter", urlPatterns = "/count")
public class PageViewCounter extends HttpServlet {

    private int pageCount = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reset = req.getParameter("reset");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

//        Logic: If "reset" something/anything the page count will revert to 0.
//        Otherwise page count will continue to increment.
        if (reset != null){
            pageCount = 0;
        } else {
            pageCount++;
        }
        out.println("<h4> Page views: " + pageCount + "</h4>");

    }
}

