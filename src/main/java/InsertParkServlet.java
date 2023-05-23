import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertParkServlet", urlPatterns = "/parks/create")
public class InsertParkServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/parks/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parkName = req.getParameter("name");
        String parkDesc = req.getParameter("description");
        String parkLoc = req.getParameter("location");

        DaoFactory.getParksDao().insertPark(parkName, parkDesc, parkLoc);
        resp.sendRedirect("/ads");
    }
}