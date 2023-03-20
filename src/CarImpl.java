import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.*;

import javax.imageio.ImageIO;

public class CarImpl {
    private java.sql.Blob blob;

    public void addCar(Car voiture) throws IOException, SQLException {
        Connection dbConnection = null;
        PreparedStatement statement = null;

        BufferedImage image = new BufferedImage(voiture.getIcon().getIconWidth(), voiture.getIcon().getIconHeight(), BufferedImage.TYPE_INT_RGB);
        
        
        
        image.getGraphics().drawImage(voiture.getIcon().getImage(), 0, 0, null);

        // Convertir l'image en BLOB
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", baos);
        byte[] imageBytes = baos.toByteArray();
        
        try {
            DataSource dataSource = new DataSource();
            dbConnection = dataSource.createConnection();

            // Créer un objet Blob à partir des bytes de l'image
            blob = dbConnection.createBlob();
            blob.setBytes(1, imageBytes);

            // Créer la requête SQL paramétrée pour l'insertion de la voiture
            String sql = "INSERT INTO car (car_id, price, popularity, state, description, discount, picture) VALUES (?, ?, ?, ?, ?, ?, ?)";
            statement = dbConnection.prepareStatement(sql);
            statement.setInt(1, voiture.getCarID());
            statement.setDouble(2, voiture.getPrice());
            statement.setInt(3, voiture.getPopularity());
            statement.setBoolean(4, voiture.isEtat());
            statement.setString(5, voiture.getDescription());
            statement.setDouble(6, voiture.getDiscount());
            statement.setBlob(7, blob);

            // Exécuter la requête SQL
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
    
        public void addRent(Rent re) throws IOException, SQLException {
        Connection dbConnection = null;
        PreparedStatement statement = null;

        
        try {
            DataSource dataSource = new DataSource();
            dbConnection = dataSource.createConnection();

            
            java.util.Date beginning = re.getBeginning();
            java.util.Date end = re.getEnd();
            java.sql.Date sqlBeginning = new java.sql.Date(beginning.getTime());
            java.sql.Date sqlEnd = new java.sql.Date(end.getTime());
            
            // Créer la requête SQL paramétrée pour l'insertion de la voiture
            String sql = "INSERT INTO rent (date_debut,date_fin,car_id,email,days) VALUES (?, ?, ?, ?, ?)";
            statement = dbConnection.prepareStatement(sql);
            statement.setDate(1, (Date) sqlBeginning);
            statement.setDate(2, (Date) sqlEnd);
            statement.setInt(3, re.getID());
            statement.setString(4, re.getEmail());
            statement.setLong(5, re.getDays());
    

            // Exécuter la requête SQL
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
        
    public void addCustomers(Customers cli) throws IOException, SQLException {
        Connection dbConnection = null;
        PreparedStatement statement = null;

        
        try {
            DataSource dataSource = new DataSource();
            dbConnection = dataSource.createConnection();

            

            // Créer la requête SQL paramétrée pour l'insertion de la voiture
            String sql = "INSERT INTO customer (email,name,password,business,businessdiscount) VALUES (?, ?, ?, ?, ?)";
            statement = dbConnection.prepareStatement(sql);
            statement.setString(1, cli.getEmail());
            statement.setString(2, cli.getName());
            statement.setString(3, cli.getPasseword());
            statement.setBoolean(4,cli.isBusiness());
            statement.setDouble(5, cli.getBusinessdiscount());
            // Exécuter la requête SQL
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }    
        
        
    public void updatePopularityInDatabase(int id, int newPopularity) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            DataSource dataSource = new DataSource();
            conn = dataSource.createConnection();
            
            String sql = "UPDATE car SET popularity = " + newPopularity + " WHERE car_id = " + id;
            
            stmt = conn.prepareStatement(sql);
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            System.out.println("Successfully updated popularity for car with ID " + id
            );
    } catch (SQLException e) {
        System.out.println("Error updating popularity in database: " + e.getMessage());
    }
    }
        
        
    public void CarStat(int id, boolean et) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            DataSource dataSource = new DataSource();
            conn = dataSource.createConnection();
            String sql = "UPDATE car SET state = " + et + " WHERE car_id = " + id;
            stmt = conn.prepareStatement(sql);
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            System.out.println("Successfully updated popularity for car with ID " + id
            );
    } catch (SQLException e) {
        System.out.println("Error updating popularity in database: " + e.getMessage());
    }

    }
    
    public void CarDiscount(int id, double disc) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            DataSource dataSource = new DataSource();
            conn = dataSource.createConnection();
            String sql = "UPDATE car SET discount = " + disc + " WHERE car_id = " + id;
            stmt = conn.prepareStatement(sql);
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            System.out.println("Successfully updated popularity for car with ID " + id
            );
    } catch (SQLException e) {
        System.out.println("Error updating popularity in database: " + e.getMessage());
    }

    }
}
