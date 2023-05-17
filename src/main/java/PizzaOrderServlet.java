import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
            String crust = req.getParameter(("crust-type"));
        System.out.println(crust);

        String sauce = req.getParameter(("sauce-type"));
        System.out.println(sauce);

        String size = req.getParameter(("size"));
        System.out.println(size);

        String peperoni = req.getParameter(("peperoni"));
        System.out.println(peperoni);
        String sausage = req.getParameter(("sausage"));
        System.out.println(sausage);
        String pineapple = req.getParameter(("pineapple"));
        System.out.println(pineapple);

        }



    }

