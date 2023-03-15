
import java.util.ArrayList;
import javax.swing.Icon;

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
    protected static ArrayList<Car> Carlist = new ArrayList<Car>();
    protected static ArrayList<Customers> client =null;
    
    public Employees(String name,String Passeword){
        this.name=name;
        this.Passeword=Passeword;
        
    }
    
    
    public static void addcar(int id,double price,String description,Icon im){
        Car voiture = new Car(id,price,description,im);
        Carlist.add(Carlist.size()+1,voiture);
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
