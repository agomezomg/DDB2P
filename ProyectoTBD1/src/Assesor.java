
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
public class Assesor extends MechanicAssesor {
    
    private final ArrayList<Mechanic> assignedGroup;
    
    public Assesor(String amName, String amID, int amCompanyPhone) {
        super(amName, amID, amCompanyPhone);
        assignedGroup = new ArrayList<>();
    }

}
