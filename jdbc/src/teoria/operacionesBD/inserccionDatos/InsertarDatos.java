package teoria.operacionesBD.inserccionDatos;


import teoria.conexion.Conexion5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {
    private  static Connection conexion;

    static {
        try {
            conexion = Conexion5.getInstance().getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean insertarUsuario (String nombre, String apellidos) throws SQLException {
        Statement statement = conexion.createStatement();
        String sql = "insert into usuario (nombre, apellidos) values ('" + nombre + "','" + apellidos + "');";
        int resultado = statement.executeUpdate(sql);
        return resultado != 0;
    }
}
