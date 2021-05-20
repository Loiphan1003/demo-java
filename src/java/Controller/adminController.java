/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

@WebServlet(urlPatterns = {"/admin-product"})
public class adminController extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        try {
            userAccount uA = new userAccount();
            List<Account> a = uA.getAllAccount();
            req.setAttribute("sumA", a.size());
//        req.setAttribute("ListA", a);

            productDao pd = new productDao();
            List<Product> list = pd.getAllProduct();
            req.setAttribute("ListP", list);
            req.setAttribute("sumP", pd.sumP());

            req.getRequestDispatcher("admin.jsp").forward(req, resp);
        } catch (Exception e) {

        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
