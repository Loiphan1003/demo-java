package Controller;

import Model.Product;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@MultipartConfig()
@WebServlet(urlPatterns = {"/insert-image"})
public class insertImageController extends HttpServlet {

    protected void loadImage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.setContentType("text/html");
        try {
            
            String filename = null;
            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();

            // Configure a repository (to ensure a secure temp location is used)
            ServletContext servletContext = this.getServletConfig().getServletContext();
            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
            factory.setRepository(repository);

            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            // Parse the request
            List<FileItem> items = upload.parseRequest(req);
            // Process the uploaded items
            Iterator<FileItem> iter = items.iterator();
            HashMap<String, String> fields = new HashMap<>();
            while (iter.hasNext()) {
                FileItem item = iter.next();

                if (item.isFormField()) {
                    fields.put(item.getFieldName(), item.toString());
                    String name = item.getFieldName();
                    String value = item.getString();
                    System.out.println("name" + name);
                    System.out.println("value" + value);
                } else {
                    filename = item.getName();
                    System.out.println("filename: " + filename);
                    if (filename == null || filename.equals("")) {
                        break;
                    } else {
                        Path path = Paths.get(filename);
                        String storePath = servletContext.getRealPath("/assets/img");
                        File uploadFile = new File(storePath + "/" + path.getFileName());
                        item.write(uploadFile);
                        System.out.println(storePath + "/" + path.getFileName());
                    }
                }
            }
            System.out.println("Upload thanh cong");
        } catch (Exception e) {

        }
        
//        req.getRequestDispatcher("insert.jsp").forward(req, resp);
        
        resp.sendRedirect("insert.jsp");
    }
    
   
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        loadImage(req, resp);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        loadImage(req, resp);

    }
}
