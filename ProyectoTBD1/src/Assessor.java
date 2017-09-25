
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
public class Assessor extends MechanicAssessor {
    
    private final ArrayList<Mechanic> assignedGroup;
    
    public Assessor(String amName, String amID, int amCompanyPhone) {
        super(amName, amID, amCompanyPhone);
        assignedGroup = new ArrayList<>();
    }

}
