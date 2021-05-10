package teoria.patrones.DAO;

import teoria.conexion.Conexion5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class CategoriaDAOSQL implements CategoriaDAO {
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
    @Override
    public Map<Integer, String> crearDiccionarioCategorias() throws SQLException {
        Map<Integer, String> map = new HashMap<>();
        String sql = "select * from categoria ;";
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        while (resultado.next())
            map.put(resultado.getInt(1), resultado.getString(2));
        return map;
    }

    public static void main(String[] args) {
        CategoriaDAO categoriaDAO = new CategoriaDAOSQL();
        try {
            Map<Integer, String> mapCategorias = categoriaDAO.crearDiccionarioCategorias();
            System.out.println(mapCategorias);
            System.out.println(mapCategorias.get(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
