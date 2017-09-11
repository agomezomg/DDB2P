/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lana
 */
public abstract class AsesorMecanico {

    private final String amName;
    private final int amID;
    private final int amCompanyPhone;

    public AsesorMecanico(String amName, int amID, int amCompanyPhone) {
        this.amName = amName;
        this.amID = amID;
        this.amCompanyPhone = amCompanyPhone;
    }

    public String getAmName() {
        return amName;
    }

    public int getAmID() {
        return amID;
    }

    public int getAmCompanyPhone() {
        return amCompanyPhone;
    }

}
