/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class Car {
    private double Price;
    private boolean etat;// si la voiture est libre pour pouvoir faire le tri plus faiclement
    private String description; // inserer des informations style nombre de place les cheveaux 
    private double discount;
    private int popularity;
    
    public Car (double price,String description){
        this.Price= price;
        this.description=description;
        popularity = 0;
        etat = false;
    }
    public void popularity(){
       popularity +=1;
    }
    
    //public void SKAMPrice();
}
