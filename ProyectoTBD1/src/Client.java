
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
public class Client extends User {

    private final String clientID;
    private String clientName;
    private int clientPhoneNumber;
    private String clientAddress;
    private String clientEmail;
    private ArrayList<Automobile> registeredCars;
    private String appointmentState;
    private Assesor mainAssesor;

    public Client(String clientID, String clientName, int clientPhoneNumber, String clientAddress, String clientEmail, String citaEstado, Assesor mainAssesor, String username, String password) {
        super(username, password);
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientAddress = clientAddress;
        this.clientEmail = clientEmail;
        this.appointmentState = citaEstado;
        this.mainAssesor = mainAssesor;
    }

    public String getAppointmentState() {
        return appointmentState;
    }

    public void setAppointmentState(String appointmentState) {
        this.appointmentState = appointmentState;
    }

    public Assesor getMainAssesor() {
        return mainAssesor;
    }

    public void setMainAssesor(Assesor mainAssesor) {
        this.mainAssesor = mainAssesor;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(int clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

}
