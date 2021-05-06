package teoria.conexion;
//conexión configurando PRAGMA FOREIGN_KEY=ON
import org.sqlite.SQLiteConfig;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion3 {

    private static Connection conexion;

    public static Connection getConexion() throws SQLException, IOException {
        //acceso al fichero de propiedades
        Properties propiedades = new Properties();
        propiedades.load(new FileReader("propiedades/bd.properties"));
        String driver = propiedades.getProperty("driver");
        String bd    = propiedades.getProperty("bd");
        //configuración adicional sqlite
        SQLiteConfig config = new SQLiteConfig();
        config.enforceForeignKeys(true);
        //conexión
        Connection conexion = DriverManager.getConnection(
                driver + bd, config.toProperties());
        return conexion;
    }
}