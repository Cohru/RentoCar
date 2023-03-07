
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
    private String EmployeID;
    private String Passeword;
    private static ArrayList<Car> Carlist;
    protected static ArrayList<Customers> client;
    
    public Employees(String name,String ID,String Passeword){
        this.name=name;
        EmployeID= ID;
        this.Passeword=Passeword;
    }
    
    
    public void addcar(int id,double price,String description){
        Car voiture = new Car(id,price,description);
        Carlist.add(voiture);
    }
    
    public void removeCar(int carid){
        for (int i =0;i<Carlist.size();i++){
            if(Carlist.get(i).getCarID() == carid){
                Carlist.remove(i);
            }
        }
    }
    //public void accepteRent(Customers client){}
    //public static void browseCar();
    //public void giveDiscount(Car voiture){]

    
    
}
