package app5.modelo.DAOS;

import app5.modelo.Conexion5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    public Map<Integer, String> mapearCategorias() throws SQLException {
        Map<Integer, String> map = new HashMap<>();
        String sql = " select * from categoria;";
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        while (resultado.next()){
            map.put(resultado.getInt(1), resultado.getString(2));
        }
        return map;
    }



    public static void main(String[] args) throws SQLException {
        CategoriaDAO c = new CategoriaDAOSQL();
        Map<Integer, String> map = c.mapearCategorias();
        Set<Integer> listaKeys = map.keySet();
        for (Integer key: listaKeys) {
            System.out.printf("%d : %s%n", key, map.get(key));
        }
    }
}
