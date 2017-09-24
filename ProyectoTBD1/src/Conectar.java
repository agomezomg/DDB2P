
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conectar {

    Connection conectar = null;

    public Connection Conexion() {
        try {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3305/phpmyadmin", "root", "");
                MysqlDataSource ds = new MysqlDataSource();
                ds.setServerName("127.0.0.1");
                //ds.setPort();//No Need of port for local servers
                ds.setDatabaseName("proyecto");
                ds.setUser("root");
                Scanner sc = new Scanner(System.in);
                System.out.println("PASSWORD PROMPT: ");
                String pass = "empty";
                ds.setPassword(pass);
                conectar = con;
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Connection failed due to the following error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
