package teoria.operacionesBD.selectDatos;

import teoria.conexion.Conexion5;

import java.io.IOException;
import java.sql.*;

public class BusquedaDatos {
    private static Connection conexion;

    static {
        try {
            conexion = Conexion5.getInstance().getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String obtenerLibrosPrestadosUsuarios () throws SQLException {
        StringBuilder sBuilder = new StringBuilder();
        String sql = "select * from librosPrestadosUsuario;";
        Statement statement = conexion.createStatement();
        ResultSet resultado  =statement.executeQuery(sql);
        while (resultado.next()) {
            sBuilder.append(resultado.getString(1));
            sBuilder.append("  ");
            sBuilder.append(resultado.getString(2));
            sBuilder.append("  ");
            sBuilder.append(resultado.getString(3));
            sBuilder.append("  ");
            sBuilder.append(resultado.getString(4));
            sBuilder.append('\n');
        }
        return sBuilder.toString();
    }
    public static void obtenerLibrosNoPrestadosPorEditorial (String editorial) throws SQLException {
        String sql = "select * from librosNoPrestados where editorial='" + editorial + "';";
        System.out.println(sql);
        ResultSet resultado = conexion.createStatement().executeQuery(sql);
        while (resultado.next())  {
            System.out.printf("%-50s%-15s%n", resultado.getString("nombre"), resultado.getString("autor"));
        }

    }
    public static void obtenerLibrosNoPrestadosPorEditorialSeguro (String editorial) throws SQLException {
        String sql = "select * from librosNoPrestados where editorial=?;";
        System.out.println(sql);
        PreparedStatement setencia = conexion.prepareStatement(sql);
        setencia.setString(1, editorial);
        ResultSet resultado = setencia.executeQuery();
        while (resultado.next())  {
            System.out.printf("%-50s%-15s%n", resultado.getString("nombre"), resultado.getString("autor"));
        }
    }
}
