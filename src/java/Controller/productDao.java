
package Controller;

import Model.Product;
import Model.connectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class productDao {
    Connection conn = null;
    PreparedStatement ps = null;      
    ResultSet rs = null;
    
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product";
        try{           
            conn = new connectDB().getConnection();
            System.out.println(conn.getCatalog());
//            System.out.println("Ket noi database thanh cong");
            ps =  conn.prepareStatement(query);
            rs = ps.executeQuery();
//            System.out.println("Thuc hien querry thanh cong");
            while(rs.next()){
                list.add(new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
            }
            
//            System.out.println("Lay du lieu thanh cong");
        }catch(Exception ex){
            System.out.println("Lay du lieu that bai " + ex);
        }
        return list;
    }
    
    public Product insertP(String id ,String nameP, String price, String img ){
        String query = " insert into Product (id,name,price,image ) values (?,?,?,? ) ";
        try{
            conn = new connectDB().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, nameP);
            ps.setString(3, price);
            ps.setString(4, img);
            rs = ps.executeQuery();
//            System.out.println("Thuc hien query thanh cong");
            while(rs.next()){
                Product p = (new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
                return p;
            }
        }catch(Exception e){
        
        }
        return null;
    }
    
    public Product getProduct(String id){
        String query = "select * from Product where id = ?";
        try{
            conn = new connectDB().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                Product p = (new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
                return p;
            }
        
        }catch(Exception e){
        }
        return null;
    }
    
    
    public void deleteP(String id){
        String query = "delete from Product where id = ?";
        try{
            conn = new connectDB().getConnection();
            System.out.println("Ket noi DB thanh cong");
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
//            System.out.println("Xoa 1 san pham thanh cong");
//            while(rs.next()){
//                Product p = new Product()
//            }
        }catch(Exception e){
        
        }        
    }
    
    public void updateP(String id, String nameP, String price, String image){
        String query = "update Product set name =?, price =?, image =? where id =? ";
        try{
            conn = new connectDB().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nameP);
            ps.setString(2, price);
            ps.setString(3, image);
            ps.setString(4, id);
            ps.executeUpdate();
            System.out.println("Update san pham thanh cong");
        }catch(Exception e){
        
        }
    }
    
    public int sumP(){
        productDao pd = new productDao();
        List<Product> p = pd.getAllProduct();
//        System.out.println("Sum thanh cong");
        return p.size();
        
    }
    
    public Product findByID(String id){
        String query = "Select * from Product where id = ?";
        try{
            conn = new connectDB().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                Product p = new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(4)
                );
                return p;
            }
            
        }catch(Exception e){
        
        }
        
        return null;
    }
    
   
    
    
    public static void main(String [] args){
        productDao pd = new productDao(); 
       
        List<Product> p = pd.getAllProduct();
        for(Product i:p){
            System.out.println(i);
        }
    }

    
}
