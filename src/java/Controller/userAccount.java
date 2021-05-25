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

    public Account checkLogin(String user, String pass) {
//        List<Account> list = new ArrayList<>();
        String query = "select * from Account where name = ? and password= ? ";

        try {
            conn = new connectDB().getConnection();
//            System.out.println(conn.getCatalog());
//            System.out.println("Ket noi thanh cong");
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            System.out.println("Thuc hien query thanh cong");
            while (rs.next()) {
                Account a = (new Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
                return a;
            }
        } catch (Exception e) {

        }
        return null;
    }

    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account ";

        try {
            conn = new connectDB().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
            }
            System.out.println("Lay thong tin thanh cong");
        } catch (Exception e) {

        }

        return list;
    }

    public Account insertUser(String name, String pass, String email) {
        String query = "insert into Account(name,password,isAdmin,email) values(?,?,0,?)";
        try {
            conn = new connectDB().getConnection();
            System.out.println(conn.getCatalog() + "Ket noi thanh cong");
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.executeUpdate();
            System.out.println("Thuc hiem query thanh cong");
//            rs = ps.executeQuery();
//            while(rs.next()){
//                Account a = new Account(
//                        rs.getString(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getString(4)
//                );
//                return a;            
//            }
            System.out.println("Dang ky thanh cong");    
        } catch (Exception e) {

        }
        return null;
    }

    public Account findByName(String name){
        String query="select * from Account where name = ? ";
        try{
            conn = new connectDB().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while(rs.next()){
                Account a = new Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                return a;
            }
            
        }catch(Exception e){
        
        }
        
        return null;
    }
    
    
    public static void main(String[] args) {
        userAccount login = new userAccount();
        List<Account> a = login.getAllAccount();
        for(Account o : a ){
            System.out.println(o);
        }

//        Account a = login.insertUser("loi2", "12345", "phanvuloi.it@gmail.com");
        
//        Account a2 = login.findByName("loi2");
//        System.out.println(a2);

    }
}
