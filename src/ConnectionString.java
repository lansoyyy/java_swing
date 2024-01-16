

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionString {
    
    
    Connection con = null;
    
     public static Connection DbConnection(){
         try{
         
             Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:d:\\Downloads\\Semi\\JAVA\\DATABASE\\Certificates.db3");
            JOptionPane.showMessageDialog(null,"Connected");
            return con;
            
            
         }
         catch(HeadlessException | ClassNotFoundException | SQLException e){
             JOptionPane.showMessageDialog(null , "Database Connection Lost"+ e);
             return null;
             
         }
     
     
     }
    
    
}
