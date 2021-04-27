package teoria.test;

import teoria.conexion.Conexion5;
import teoria.operacionesBD.inserccionDatos.InsertarDatos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Ejemplo5 {
    public static void main(String[] args) {
        try {
            boolean resultado = InsertarDatos.insertarUsuario("gabriel garcía", "lópez lópez");
            System.out.printf("Insertado dato: %B%n", resultado);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
