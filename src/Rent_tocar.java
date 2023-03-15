    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */


    /**
     *
     * @author Jus
     */


import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

    /**
     *
     * @author mysqltest
     */
    public class Rent_tocar {
        private Connection conn;
        private java.sql.Blob blob;

        public ArrayList<Car> Recupcar(ArrayList<Car> Carini){
            
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
            while(rs.next()) {
                
            //System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 
            int id = rs.getInt(1);
            double price = rs.getDouble(2);
            String description = rs.getString(5);
            
            blob = rs.getBlob(6);  
            InputStream in = blob.getBinaryStream();  
            BufferedImage image = ImageIO.read(in);
            ImageIcon photo = new ImageIcon(image);
            Car voiture = new Car(id,price,description,photo);
            Carini.add(voiture);

            }
            conn.close(); 
        }
        catch( Exception e )
        {
        System.out.println("Error Occured " + e.toString());
        }
        return Carini;
    }
}  

        
