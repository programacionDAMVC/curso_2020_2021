package teoria.conexion;
//conexión simple, sin integeridad referencial
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion1 {

    private static Connection conexion;
    public static Connection getConexion(String bd) throws SQLException {
        Connection conexion = DriverManager.getConnection(
                "jdbc:sqlite:" + bd);
        return conexion;
    }
}
