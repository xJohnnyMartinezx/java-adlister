//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "InsertAdServlet", urlPatterns = "/ads/create")
//public class InsertAdServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String adTitle = req.getParameter("title");
//        String adDescription = req.getParameter("description");
//
//        DaoFactory.getAdsDao().insert(adTitle, adDescription);
//        resp.sendRedirect("/ads");
//    }
//}
