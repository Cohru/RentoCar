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
}
