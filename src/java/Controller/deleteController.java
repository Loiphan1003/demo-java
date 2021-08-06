/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.productDao;
import Model.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/delete"})
public class deleteController extends HttpServlet {
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {    
        try{
            String id  = req.getParameter("pid");
            productDao pd = new productDao();
            pd.deleteP(id);
            resp.sendRedirect("admin-product");
        }catch(Exception e){
        
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }
    
    
}
