
package Controller;

import Model.Account;
import Model.Product;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/insert-product"})
public class insertController extends HttpServlet{

 
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
//        PrintWriter writer = new req.getWriter();
        try{
            String id = req.getParameter("product_id");
            String name  = req.getParameter("product_name");
            String price  = req.getParameter("product_price");
            String img  ="./assets/img/" + req.getParameter("product_img");
            productDao pd = new productDao();
            Product p =  pd.insertP(id,name, price, img);
            resp.sendRedirect("admin-product");
            
        }catch(Exception e){
        
        }
    }
    
    
    
}

