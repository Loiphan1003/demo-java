package Demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/test-Servlet1"})
public class Servlet1 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Xin chao Loi");
        
        Cookie cookie = new Cookie("name" , "Loi");
        cookie.setMaxAge(10);
        resp.addCookie(cookie);
        Cookie cookie2 = new Cookie("Age" , "20");
        cookie.setMaxAge(10);
        resp.addCookie(cookie2);
    }
    
}
