package Controller;

//import Model.Product;
import Model.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class loginController extends HttpServlet {

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try {
            String user = req.getParameter("user");
            String pass = req.getParameter("pass");
            
            userAccount login = new userAccount();
            Account a = login.checkLogin(user, pass);
            if (a == null) {
                resp.sendRedirect("login2.jsp");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("acc", a);
                resp.sendRedirect("home");
            }
        } catch (Exception e) {

        }
    }
    
    
    
    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try {
            String user = req.getParameter("user");
            String pass = req.getParameter("pass");
            String mail = req.getParameter("email");
            
            
        } catch (Exception e) {

        }
    }
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        login(req, resp);
    }

}
