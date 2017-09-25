
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conectar {

    Connection conectar = null;

    public Connection Conexion() {
    Connection conectar=null;

        try{
            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName("127.0.0.1");
            //ds.setPort();//No Need of port for local servers
            ds.setDatabaseName("proyecto");
            ds.setUser("root");
            ds.setPassword("");
            conectar = ds.getConnection();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}

