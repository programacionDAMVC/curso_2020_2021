package teoria.conexion;
//implementando hook cierre de conexión

import org.sqlite.SQLiteConfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion5 {

    private static Conexion5 conexion5;
    private Connection conexion;

    private Conexion5() throws SQLException, IOException {
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

    public static Conexion5 getInstance() throws SQLException, IOException {
        if (conexion5 == null) {
            Runtime.getRuntime().addShutdownHook(new HookCierreConexion());
            conexion5 = new Conexion5();
        }
        return conexion5;
    }
    static class HookCierreConexion  extends Thread  {
        @Override
        public void run() {
            try {
                Conexion5 conexion5 = new Conexion5();
                Connection conexion = conexion5.getConexion();
                if (conexion != null) {
                    conexion.close();
                    System.out.println("cerrada la conexión");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
