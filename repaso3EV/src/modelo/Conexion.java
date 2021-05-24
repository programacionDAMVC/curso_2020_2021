package modelo;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/*
driver=jdbc:sqlite:
bd=BD/biblioteca.bd
 */

public class Conexion {
    private static Conexion conexion;
    private Connection connection;

    private Conexion() throws SQLException, IOException {
        Properties propiedades = new Properties();
        propiedades.load(new FileReader("propiedades/bd.properties"));
        String driver = propiedades.getProperty("driver");
        String bd    = propiedades.getProperty("bd");
        SQLiteConfig config = new SQLiteConfig();
        config.enforceForeignKeys(true);
        //conexión
        connection = DriverManager.getConnection(
                driver + bd, config.toProperties());

    }

    public Connection getConexion() {
        return connection;
    }

    public static Conexion getInstance() throws SQLException, IOException {
        if (conexion == null) {
            Runtime.getRuntime().addShutdownHook(new HookCierreConexion());
            conexion = new Conexion();
        }
        return conexion;
    }
    static class HookCierreConexion  extends Thread  {
        @Override
        public void run() {
            try {
                Conexion conexion5 = new Conexion();
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
