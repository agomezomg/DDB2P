import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;


public class Conectar {
    Connection conectar=null;
    public Connection Conexion(){
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
