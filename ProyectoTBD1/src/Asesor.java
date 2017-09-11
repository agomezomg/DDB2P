
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
public class Asesor extends AsesorMecanico {
    
    private final ArrayList<Mecanico> assignedGroup;
    
    public Asesor(String amName, int amID, int amCompanyPhone) {
        super(amName, amID, amCompanyPhone);
        assignedGroup = new ArrayList<>();
    }

}
