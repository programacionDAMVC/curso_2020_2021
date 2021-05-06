package teoria.test;
import teoria.conexion.Conexion3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Ejemplo1 {
    public static void main(String[] args) {
        try (Connection conexion1 = Conexion3.getConexion();
                Connection conexion2 = Conexion3.getConexion()) {
            System.out.println(conexion1);  //cada conexión es distinta
            System.out.println(conexion2);

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
