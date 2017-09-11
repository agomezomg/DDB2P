
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
public class Mecanico extends AsesorMecanico {
    private final ArrayList<Citas> registeredDates;
    
    public Mecanico(String amName, int amID, int amCompanyPhone) {
        super(amName, amID, amCompanyPhone);
        registeredDates = new ArrayList<>();
    }

}
