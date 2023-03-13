    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */


    /**
     *
     * @author Jus
     */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

    /**
     *
     * @author mysqltest
     */
    public class Rent_tocar {
        java.sql.Blob blob;
        public ArrayList<Car> RecupCar(ArrayList<Car> car) throws IOException{
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
            blob = rs.getBlob(6);  
            InputStream in = blob.getBinaryStream();  
            BufferedImage image = ImageIO.read(in);
            Car voiture = new Car(rs.getInt(1),rs.getInt(2),rs.getString(5),new ImageIcon(image));
            System.out.println(rs.getInt(1)+"  "+rs.getDouble(2)+" "+rs.getString(5)); 
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
        return car;
        }  

}
