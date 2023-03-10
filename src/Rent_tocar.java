/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Jus
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author mysqltest
 */
public class Rent_tocar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Connection conn = null;
try {
    // db parameters - ptest is the name of the database
    String url       = "jdbc:mysql://localhost:3306/rent_tocar";
    String user      = "root";
    String password  = "ouioui";
   
    // create a connection to the database
    conn = DriverManager.getConnection(url, user, password);
    // more processing here
    // ...   
    Statement stmt=conn.createStatement(); 
    ResultSet rs=stmt.executeQuery("select * from car"); 
    while(rs.next()) 
    System.out.println(rs.getInt(1)+"  "+rs.getInt(2)); 
conn.close(); 
} catch(SQLException e) {
   System.out.println(e.getMessage());
} finally {
    try{
           if(conn != null)
             conn.close();
    }catch(SQLException ex){
           System.out.println(ex.getMessage());
    }
}
}  
    
}
