
package Demo;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns={"/test-request"})
public class RequestDemo extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
     
        System.out.println("Phuong thuc cua request: " + request.getMethod());
        request.getContentType();
        request.getContextPath();
        System.out.println(request.getServerName());
        System.out.println(request.getServletPath());
    }
}
