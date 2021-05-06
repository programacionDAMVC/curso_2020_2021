package teoria.conexion;
//implementando patrón Singleton

import org.sqlite.SQLiteConfig;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion4 {

    private static Conexion4 conexion4;
    private Connection conexion;

    private Conexion4() throws SQLException, IOException {
        Properties propiedades = new Properties();
        propiedades.load(new FileReader("propiedades/bd.properties"));
        String driver = propiedades.getProperty("driver");
        String bd    = propiedades.getProperty("bd");
        SQLiteConfig config = new SQLiteConfig();
        config.enforceForeignKeys(true);
        //conexión
        conexion = DriverManager.getConnection(
                driver + bd, config.toProperties());

    }

    public Connection getConexion() {
        return conexion;
    }

    public static Conexion4 getInstance() throws SQLException, IOException {
        if (conexion4 == null)
            conexion4 = new Conexion4();
        return conexion4;
    }
}
