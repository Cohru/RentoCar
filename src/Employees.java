
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class Employees // implements Discountvariable
{
    private String name;
    private int EmployeID;
    private static ArrayList<Car> Carlist;
    protected static ArrayList<Customers> client;

    public Employees(String name,int ID){
        this.name=name;
        EmployeID= ID;
    }
    
    
    public void addcar(int id,double price,String description){
        Car voiture = new Car(id,price,description);
        Carlist.add(voiture);
    }
    //public void removeCar(Car voiture){}
    //public void accepteRent(Customers client){}
    //public static void browseCar();
    //public void giveDiscount(Car voiture){]

    
    
}
