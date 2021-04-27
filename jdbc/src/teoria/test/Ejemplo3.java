package teoria.test;

import teoria.conexion.Conexion4;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Ejemplo3 {
    public static void main(String[] args) {
        Connection conexion = null;
        Connection conexion_1 = null;
        try {
            Conexion4 conexion4 = Conexion4.getInstance();
            conexion = conexion4.getConexion();
            System.out.println(conexion);
            Conexion4 conexion4_1 = Conexion4.getInstance();
            conexion_1 = conexion4_1.getConexion();
            System.out.println(conexion_1);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexion_1 != null) {
                try {
                    conexion_1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
