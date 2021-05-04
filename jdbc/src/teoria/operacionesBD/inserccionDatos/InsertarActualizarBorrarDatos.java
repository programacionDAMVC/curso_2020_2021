package teoria.operacionesBD.inserccionDatos;


import teoria.conexion.Conexion5;

import java.io.IOException;
import java.sql.*;

public class InsertarActualizarBorrarDatos {
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
        String sql = "insert into usuario (nombre, apellidos) values ('" + nombre + "','" + apellidos + "');";
        return operacionesExecuteUpdate(sql);
    }

    public static boolean insertarLibro (String nombre, String autor, String editorial, int idCategoria) throws SQLException {
        String sql = String.format(" insert into libro (nombre, autor, editorial, idCategoria) VALUES ('%s', '%s', '%s', %d);", nombre, autor, editorial, idCategoria);
        return operacionesExecuteUpdate(sql);
    }
    public static boolean actulizarNombreCategoriaPorId(String nombre, int idCategoria) throws SQLException {
        String sql = "UPDATE categoria set nombre=  '" + nombre + "' WHERE id=" + idCategoria + ";";
        return operacionesExecuteUpdate(sql);
    }
    public static boolean borrarCategoriaPorId (int id) throws SQLException {
        String sql = "DELETE FROM categoria WHERE id=" + id +";";
        return operacionesExecuteUpdate(sql);

    }
    private static boolean operacionesExecuteUpdate(String sql) throws SQLException {
        Statement statement = conexion.createStatement();
        int resultado = statement.executeUpdate(sql);
        return resultado != 0;
    }
    public static boolean insertarLibroSeguro (String nombre, String autor, String editorial, int idCategoria) throws SQLException {
        String sql = " insert into libro (nombre, autor, editorial, idCategoria) VALUES ( ?, ?, ?, ?);";
        PreparedStatement setencia = conexion.prepareStatement(sql);
        setencia.setString(1, nombre);
        setencia.setString(2, autor);
        setencia.setString(3, editorial);
        setencia.setInt(4, idCategoria);
        int resultado =  setencia.executeUpdate();
        return resultado != 0;
    }

    }
