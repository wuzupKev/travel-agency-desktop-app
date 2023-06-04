import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/agenciav","root","AdminDB123");
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getconnection(){
        return con;
    }
    public static void main(String[] args) {
        Conexion con= new Conexion();
    }
    
    
}
