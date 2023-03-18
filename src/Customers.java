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
    
    //public void Rent()
    //public void browse();
    //private double calculBill(); // mettre si business une reduc de ....

    public Customers(String name,String email, String Passeword) {
        this.name = name;
        this.email= email;
        this.Passeword = Passeword;
    }
    
    public String getEmail(){
        return email;
    }
}
