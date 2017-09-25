import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lana
 */
public class AppCountCompare implements Comparator<Client> {

    @Override
    public int compare(Client c1, Client c2) {
        int appCount1 = c1.getAppointmentCount();
        int appCount2 = c2.getAppointmentCount();

        if (appCount1 == appCount2) {
            return 0;
        } else if (appCount1 > appCount2) {
            return 1;
        }
        return -1;
    }

}
