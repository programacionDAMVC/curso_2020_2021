package teoria.test;

import teoria.conexion.Conexion5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Ejemplo4 {
    public static void main(String[] args) {
        try {
            Conexion5 conexion5 = Conexion5.getInstance();
            Connection connection = conexion5.getConexion();
            for (int i = 0; i < 1_000; i++) {
                //simulamos operaciones sobre la BD
                System.out.println("Haciendo operaciones sobre la BD");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
