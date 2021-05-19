package Controller;

//import Model.Product;
import Model.Account;
import Model.connectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;





public class userAccount {
    Connection conn = null;
    PreparedStatement ps = null;      
    ResultSet rs = null;
    
    public Account checkLogin(String user, String pass){
//        List<Account> list = new ArrayList<>();
        String query = "select * from Account where name = ? and password= ? ";

        try{
            conn = new connectDB().getConnection();
            System.out.println(conn.getCatalog());
            System.out.println("Ket noi thanh cong");
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            System.out.println("Thuc hien query thanh cong");
            while(rs.next()){
                Account a =(new  Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
                return a;
            }
        }catch(Exception e){
        
        }
        return null;
    }
    
    public List<Account> getAllAccount(){
        List<Account> list = new ArrayList<>();
        String query = "select * from Account where isAdmin = 0";        
        
        try{
            conn = new connectDB().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
            }
            System.out.println("Lay thong tin thanh cong");
        }catch(Exception e){
        
        }
        
        return list;
    }
    
    
//    public int sumA(){
//        String query = "select count(*) from Account where isAdmin = 0";
//        
//        try{
//            conn = new connectDB().getConnection();
//            ps = conn.prepareStatement(query);
//            ps.executeUpdate();
//        }catch(Exception e){
//        
//        }
//        return 0;
//    }
    
    
    public static void main(String [] args){
        userAccount login = new userAccount(); 
        List<Account> a = login.getAllAccount();
        System.out.println(a.size());
        
    }
}
