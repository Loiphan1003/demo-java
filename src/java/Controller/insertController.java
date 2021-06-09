package Controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns = {"/insert-product"})
@MultipartConfig
public class insertController extends HttpServlet {

    protected void loadImage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        try {
            String id = req.getParameter("product-id");
            String nameP = req.getParameter("product-name");
            String price = req.getParameter("product-price");

            // Create path components to save the file
            Part part = req.getPart("product-image");
            String realPath = req.getServletContext().getRealPath("./assets/img");
            String fileName = part.getSubmittedFileName();
            part.write(realPath + "/" + fileName);
            String img = "./assets/img/" + fileName;

            System.out.println(id);
            System.out.println(nameP);
            System.out.println(price);
            System.out.println(img);

            productDao pd = new productDao();
            pd.insertP(id, nameP, price, img);
            System.out.println("Them san pham thanh cong");
//            }

        } catch (Exception e) {

        }

        resp.sendRedirect("/Demo/admin");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        loadImage(req, resp);

    }

}
