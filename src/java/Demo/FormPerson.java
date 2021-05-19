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

@WebServlet(urlPatterns={"/test-form"})
public class FormPerson extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        PrintWriter printWriter = resp.getWriter();
        
        printWriter.println("<form action='/Demo/them-nguoi-dung' method='post'>");
        printWriter.println("Ten: <input type ='text' name = ten>");
        printWriter.println("Tuoi: <input type ='text' name = tuoi>");
        printWriter.println("Dia chi: <input type ='text' name = diachi>");
        printWriter.println("<input type ='submit' value = 'submit'>");
        printWriter.println("</form>");
    }
    
    
}
