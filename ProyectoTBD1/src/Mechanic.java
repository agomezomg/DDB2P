
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lana
 */
public class Mechanic extends MechanicAssessor {
    private final ArrayList<Appointment> registeredDates;
    
    public Mechanic(String amName, String amID, int amCompanyPhone) {
        super(amName, amID, amCompanyPhone);
        registeredDates = new ArrayList<>();
    }

    public ArrayList<Appointment> getRegisteredDates() {
        return registeredDates;
    }
    

}
