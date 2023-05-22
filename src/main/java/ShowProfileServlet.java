//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebServlet(name = "ShowProfileServlet", urlPatterns = ("/show-profile"))
//public class ShowProfileServlet extends HttpServlet {
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        // redirect if the user is not an admin
//        // cast to a boolean data type to properly compare
//        // inside of a servlet
//        HttpSession session = request.getSession();
//
//        if (request.getSession().getAttribute("user") == null) {
//            response.sendRedirect("/login");
//            return;
//        }
//        request.getRequestDispatcher("/profile").forward(request, response);
//    }
//
//
//}
