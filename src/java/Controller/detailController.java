
package Controller;

import DAO.productDao;
import Model.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/detail"})
public class detailController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try{
            String id = req.getParameter("pid");
            productDao pd = new productDao();
            Product p = pd.getProduct(id);
            req.setAttribute("de", p);
            req.getRequestDispatcher("detail.jsp").forward(req, resp);
        }catch(Exception e){
        
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
    
}
