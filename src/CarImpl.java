
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class CarImpl {
    public void addCar(Car voiture)
  {
    Connection dbConnection = null;
    Statement statement=null;

    String sql = "insert into employee values(" + voiture.getCarID() + ","  + "'" + voiture.getPrice()
                    + "'" + "," + voiture.getPopularity() + voiture.isEtat()+ ","  + "'" + voiture.getDescription()+ ","  + "'" +voiture.getDiscount()+")";

    try
    {
      DataSource dataSource = new DataSource();
      dbConnection = dataSource.createConnection();
      statement = dbConnection.createStatement();
   
      statement.executeUpdate(sql);

      System.out.println("Record is inserted into Employee table for  Employee : " + employee.getName());

    }
    catch( SQLException e )
    {

      e.printStackTrace();

    }
    finally
    {

      if( statement != null )
      {
        try
        {
          statement.close();
        }
        catch( SQLException e )
        {
          e.printStackTrace();
        }
      }

      if( dbConnection != null )
      {
        try
        {
          dbConnection.close();
        }
        catch( SQLException e )
        {
          e.printStackTrace();
        }
      }

    }

  }

}
