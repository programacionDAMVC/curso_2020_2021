package teoria.conexion;
//conexión configurando PRAGMA FOREIGN_KEY=ON
import org.sqlite.SQLiteConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion2 {

    private static Connection conexion;
    public static Connection getConexion(String bd) throws SQLException {
        SQLiteConfig config = new SQLiteConfig();
        config.enforceForeignKeys(true);

        Connection conexion = DriverManager.getConnection(
                "jdbc:sqlite:" + bd, config.toProperties());
        return conexion;
    }
}