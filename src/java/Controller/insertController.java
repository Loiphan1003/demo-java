package Controller;

import Model.Product;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@MultipartConfig()
@WebServlet(urlPatterns = {"/insert-product"})
public class insertController extends HttpServlet {

    
    
    protected void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        String id = req.getParameter("product_id");
        String name = req.getParameter("product_name");
        String image ="./assets/img/"+ req.getParameter("product_image");
        String price =  req.getParameter("product_price");
        productDao pd = new productDao();
        Product p = pd.insertP(id, name, price, image);
        
        System.out.println(id);
        System.out.println(name);
        System.out.println(image);
        System.out.println(price);

    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        insert(req, resp);
        resp.sendRedirect("admin-product");
//        req.getRequestDispatcher("admin-product").forward(req, resp);

    }
}
