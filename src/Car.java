

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

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
    private double discount=0;
    private int popularity ;
    protected CarPanel panel;
    private Icon icon;
    // Constructor car 
    public Car (int id,double price,String description,int popu,boolean stat,double discount,ImageIcon ic){
        carID=id;
        
        this.Price= price;
        this.description=description;
        popularity =popu;
        etat = stat;
        this.discount=discount;
        icon = ic;
        panel = new CarPanel();
        Image myimg=ic.getImage();
        Image scaledimg=myimg.getScaledInstance(220, 190, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(scaledimg);
        panel.ImageLabel.setIcon(scaledIcon);
        panel.jTextArea2.setText(description);
        panel.PrixCase.setText(Double.toString(Price));
        panel.jLabel4.setText(Double.toString(discount*100));
        if (discount == 0){
            panel.jLabel4.setVisible(false);
            panel.DiscountTextLabel.setVisible(false);
        }
        else {
            panel.jLabel4.setVisible(true);
            panel.DiscountTextLabel.setVisible(true);
        }

    }
    
    //Car Methods
    public void popularity(){
       popularity +=1;
    }
    
    protected static void RentActionPerformed() {                                         
           System.out.println("try");
    }     
    
    public void setImage(Icon im){
        icon = im;
    }
    // Methods to set Discount
    public void setDiscount(double discount){
        this.discount= discount;
        if (discount != 0){
            discount= discount*100;
            panel.jLabel4.setText(Double.toString(discount));
            panel.jLabel4.setVisible(true);
            panel.DiscountTextLabel.setVisible(true);
        }
        else{
            panel.jLabel4.setVisible(false);
            panel.DiscountTextLabel.setVisible(false);
        }
    }
  
    
    public void resetPopularity(){
        popularity =0;
    }
    


    //public void SKAMPrice();
    //Getters
    
    
    
    public ImageIcon getIcon() {    
        return (ImageIcon) icon;
    }

    public int getCarID() {
        return carID;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
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

    public double getDiscount() {
        return discount;
    }
    
    
}
