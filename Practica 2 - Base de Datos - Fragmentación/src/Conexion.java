
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author homer
 */
public class Conexion {
      Connection con;

    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica_2_bd", "root", "root");

        }catch(Exception e){
            System.err.println(e);
        }
    }

    public Connection getConnection(){

        return con;
    }
}


