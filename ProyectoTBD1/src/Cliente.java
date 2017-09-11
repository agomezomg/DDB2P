
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
public class Cliente extends User {

    private String clientID;
    private String clientName;
    private int clientPhoneNumber;
    private String clientAddress;
    private String clientEmail;
    private ArrayList<Automovil> registeredCars;
    private int citaEstado;
    
    public Cliente(String clientID, String clientName, int clientPhoneNumber, String clientAddress, String clientEmail, String username, String password, int citaEstado) {
        super(username, password);
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientAddress = clientAddress;
        this.clientEmail = clientEmail;
        this.registeredCars = new ArrayList<>();
        this.citaEstado = citaEstado;
    }

    public Cliente(String clientID, String username, String password) {
        super(username, password);
        this.clientID = clientID;
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
