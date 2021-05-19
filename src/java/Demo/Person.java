/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/them-nguoi-dung"})
public class Person extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Phuong thuc: " + req.getMethod());
        
        String ten = req.getParameter("ten");
        String tuoi = req.getParameter("tuoi");
        String diachi = req.getParameter("diachi");
        
        printWriter.print("Ten= " + ten + " / " + "Tuoi= " + tuoi + " / " + "Dia chi= " + diachi);
        
        
    }
    
    
}
