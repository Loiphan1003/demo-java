/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/test-config"}, initParams= {
    @WebInitParam(name = "name", value = "Servler") 
})
public class ServletConfigDemo extends HttpServlet  {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = super.getServletConfig().getInitParameter("name");
        
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        
        printWriter.print("Xin chao " + name);
        
    }
    
}
