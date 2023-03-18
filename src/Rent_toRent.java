
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
public class Rent_toRent {
    private Connection conn;
    
    public void RecupRent(ArrayList<Rent> Renti)
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
            ResultSet rs=stmt.executeQuery("select * from Rent"); 
            while(rs.next()) {

                Rent r= new Rent(rs.getString(4),rs.getInt(3),rs.getDate(1),rs.getDate(2),rs.getInt(5));
                Renti.add(r);
                
            }
            conn.close(); 
        }
        catch( Exception e )
        {
        System.out.println("Error Occured " + e.toString());
        }

    }
    

}
 