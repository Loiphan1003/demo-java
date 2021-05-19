
package Model;

import java.lang.Exception;
import java.sql.Connection;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.DriverManager;


public class connectDB {
       
        static String dbName = "WEBBH";
        static String serverName = "DESKTOP-PDHA0NQ\\SQLEXPRESS";
            
        static int portNumber = 1433;
        static String instance="";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
        static String userID = "sa";
        static String password = "12345";
    // Ket noi SQLServer
        public Connection getConnection()throws Exception {        
            String url = "jdbc:sqlserver://"+serverName+";"+portNumber + "\\" +"databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
        }
//          SQLServerDataSource ds = new SQLServerDataSource();
//         ds.setUser(userID);
//         ds.setPassword(password);
//         ds.setPortNumber(portNumber);
//         ds.setDatabaseName(dbName);
//         ds.setServerName(serverName);
        
        public static void main(String [] args){            
            try{
                System.out.println(new connectDB().getConnection());
                System.out.println("Ket noi thanh cong");

            }catch(Exception e){
                System.out.println("Lay du lieu that bai");
            }
        }
        
        
}
