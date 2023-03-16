/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class Rent {
    private Customers client;
    private Car voiture;
    private String beginning;
    private String end;

    public Rent(Customers client, Car voiture, String beginning, String end) {
        this.client = client;
        this.voiture = voiture;
        this.beginning = beginning;
        this.end = end;
    }

    public void setBeginning(String beginning) {
        this.beginning = beginning;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    
    
}
