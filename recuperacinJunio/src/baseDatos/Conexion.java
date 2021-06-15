package baseDatos;

import org.sqlite.SQLiteConfig;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    private static Conexion conexion;
    private Connection connection;

    private Conexion() throws SQLException, IOException {

        //conexión
        String bd = "baseDatos/animal.bd";
        connection = DriverManager.getConnection("jdbc:sqlite:" + bd);

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
                Connection connection = conexion5.getConexion();
                if (connection != null) {
                    connection.close();
                    System.out.println("connection closed");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
