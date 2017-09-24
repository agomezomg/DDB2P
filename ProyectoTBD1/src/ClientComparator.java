/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lana
 */
public class ClientComparator implements Comparator {
    @Override
    public int compare(Client cl1, Client cl2) {
        return cl2.getAppointmentCount() - cl1.getGrade();
    }
}
