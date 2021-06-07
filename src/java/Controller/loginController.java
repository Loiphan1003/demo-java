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
                req.setAttribute("mess", "wrong account name or password");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
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
            String user = req.getParameter("name");
            String pass = req.getParameter("pass");
            String repeatpass = req.getParameter("repeat-pass");
            String mail = req.getParameter("email");
            if (repeatpass.equals(pass)) {
                userAccount uA = new userAccount();
                Account check = uA.checkUserExist(user);
                if (user.equals(check)) {
                    resp.sendRedirect("login.jsp");
                } else {
                    Account a = uA.insertUser(user, pass, mail);
                    System.out.println("Dang ky thanh cong");
                    resp.sendRedirect("home");
                }
            } else {
                resp.sendRedirect("login.jsp");
            }

        } catch (Exception e) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        register(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        login(req, resp);
    }

}
