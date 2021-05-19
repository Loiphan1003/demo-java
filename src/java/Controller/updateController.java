/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/update"})
public class updateController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try {
            String id = req.getParameter("pid");
            productDao pd = new productDao();
            Product p = pd.getProduct(id);
            req.setAttribute("up", p);
            req.setAttribute("sum", pd.sumP());
            req.getRequestDispatcher("update.jsp").forward(req, resp);
           
        } catch (Exception e) {
            
        }        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try{
            String id = req.getParameter("product-id");
            String name = req.getParameter("product-name");
            String price = req.getParameter("product-price");
            String img = req.getParameter("product-image");
            productDao pd = new productDao();
            pd.updateP(id, name, price, img);
            resp.sendRedirect("admin-product");
        }catch(Exception e){
        
        }
    }
    
}
