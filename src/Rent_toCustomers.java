
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class Rent_toCustomers {
    private Connection conn;
    private java.sql.Blob blob;

    public void RecupCustomer(ArrayList<Customers> clicli){
            
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
            ResultSet rs=stmt.executeQuery("select * from customer"); 
            while(rs.next()) {
                
            //System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 
            String email = rs.getString(1);
            String name = rs.getString(2);
            String Passeword = rs.getString(3);
            boolean business = rs.getBoolean(4);
            Customers iencli = new Customers(name,email,Passeword,business);
            clicli.add(iencli);
            }
            conn.close(); 
        }
        catch( Exception e )
        {
        System.out.println("Error Occured " + e.toString());
        }

    }
        
}
