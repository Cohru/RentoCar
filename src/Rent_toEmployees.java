
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class Rent_toEmployees {
    private Connection conn;
    
    public void RecupEmployees  (ArrayList<Employees> admin)
     {
            
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
            ResultSet rs=stmt.executeQuery("select * from employee"); 
            while(rs.next()) {
                
            Employees e = new Employees(rs.getString(2),rs.getString(3),rs.getInt(1));
            admin.add(e);

            }
            conn.close(); 
        }
        catch( Exception e )
        {
        System.out.println("Error Occured " + e.toString());
        }

}
}