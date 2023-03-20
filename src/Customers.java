/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class Customers {
    private String name;
    private String email;
    private String Passeword;
    private boolean business;
    private double businessdiscount;
    
    //public void Rent()
    //public void browse();
    //private double calculBill(); // mettre si business une reduc de ....

    public Customers(String name,String email,String Passeword,boolean business) {
        this.name = name;
        this.email= email;
        this.Passeword = Passeword;
        this.business = business;
        if (this.business){
            businessdiscount = 0.1;
        }
        
    }
    
    public String getEmail(){
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPasseword() {
        return Passeword;
    }

    public boolean isBusiness() {
        return business;
    }

    public double getBusinessdiscount() {
        return businessdiscount;
    }
    
    
}
