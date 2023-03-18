
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hucor
 */
public class Rent {
    private String email;
    private int ID;
    private Date beginning;
    private Date end;
    private long days;

    public Rent(String email, int ID, Date beginning, Date end, long days) {
        this.email = email;
        this.ID = ID;
        this.beginning = beginning;
        this.end = end;
        this.days = days;
    }
    


    public void setBeginning(Date beginning) {
        this.beginning = beginning;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getEmail() {
        return email;
    }

    public int getID() {
        return ID;
    }

    public Date getBeginning() {
        return beginning;
    }

    public Date getEnd() {
        return end;
    }

    public long getDays() {
        return days;
    }
    
    
}
