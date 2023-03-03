/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class Car {
    private int carID;
    private double Price;
    private boolean etat;// si la voiture est libre pour pouvoir faire le tri plus faiclement
    private String description; // inserer des informations style nombre de place les cheveaux 
    private double discount;
    private int popularity;
    
    // Constructor car 
    public Car (int id,double price,String description){
        carID=id;
        
        this.Price= price;
        this.description=description;
        popularity = 0;
        etat = false;
    }
    
    //Car Methods
    public void popularity(){
       popularity +=1;
    }
    
    
    // Methods to set Discount
    public void setDiscount(double discount){
        this.discount= discount;
    }
  
    
    public void resetPopularity(){
        popularity =0;
    }
    


    //public void SKAMPrice();
    //Getters
    public int getCarID() {    
        return carID;
    }
    public double getPrice() {
        return Price;
    }

    public boolean isEtat() {
        return etat;
    }

    public String getDescription() {
        return description;
    }

    public int getPopularity() {
        return popularity;
    }
}
