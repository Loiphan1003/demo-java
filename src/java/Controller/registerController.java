/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pvtha
 */
@WebServlet(name = "registerController", urlPatterns = {"/register"})
public class registerController extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try {
            String user = req.getParameter("name");
            
            Pattern pUser = Pattern.compile("^[0-9a-zA-Z]{10}$");
            
            if (!pUser.matcher(user).find()) {
                
                System.out.println("Ten khong co ky tu dac biet");
                req.setAttribute("mess1", "Tên không có ký tự đặc biệt");
                req.getRequestDispatcher("register.jsp").forward(req, resp);
            }
            String pass = req.getParameter("pass");
            String repeatpass = req.getParameter("repeat-pass");
            String mail = req.getParameter("email");
            
            Pattern pPass = Pattern.compile("");

            if (repeatpass.equals(pass)) {
                userAccount uA = new userAccount();
                Account check = uA.checkUserExist(user);
                if (user.equals(check)) {
//                    resp.sendRedirect("login.jsp");
                } else {
//                    Account a = uA.insertUser(user, pass, mail);
//                    System.out.println("Dang ky thanh cong");
//                    resp.sendRedirect("home");
                }
            } else {
                
            }
            
         
        } catch (Exception e) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
    }

}
