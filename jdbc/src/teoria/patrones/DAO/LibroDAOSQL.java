package teoria.patrones.DAO;

import teoria.conexion.Conexion5;
import teoria.patrones.DTO.Libro;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAOSQL implements LibroDAO {
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
    public List<Libro> listarLibros() throws SQLException {
        List<Libro> listaLibros = new ArrayList<>();
        String sql = "SELECT * FROM libro;";
        Statement sentenciaSQL =  conexion.createStatement();
        ResultSet resultado =  sentenciaSQL.executeQuery(sql);
        while (resultado.next())
            listaLibros.add(new Libro(resultado.getInt(1), resultado.getString(2), resultado.getString(3),
                    resultado.getString(4), resultado.getInt(5)));
        return listaLibros;
    }

    @Override
    public List<Libro> listarLibrosPorCategoria(int idCategoria) throws SQLException {
        List<Libro> listaLibros = new ArrayList<>();
        String sql = "select * from libro where idCategoria=?;";
        PreparedStatement sentencia =  conexion.prepareStatement(sql);
        sentencia.setInt(1, idCategoria);
        ResultSet resultado =  sentencia.executeQuery();
        while (resultado.next())
            listaLibros.add(new Libro(resultado.getInt(1), resultado.getString(2), resultado.getString(3),
                    resultado.getString(4), resultado.getInt(5)));
        return listaLibros;
    }

    @Override
    public boolean borrarLibroPorId(int idLibro) throws SQLException {
        String sql = " DELETE FROM libro WHERE id = ?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, idLibro);
        int resultado = sentencia.executeUpdate();
        return resultado != 0;

    }

    @Override
    public boolean insertarLibro(Libro libro) throws SQLException {
        String sql = "INSERT INTO libro (nombre, autor, editorial, idCategoria) VALUES (? , ?, ?, ?);";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, libro.getNombreLibro());
        sentencia.setString(2, libro.getAutor());
        sentencia.setString(3, libro.getEditorial());
        sentencia.setInt(4, libro.getIdCategoria());
        int resultado = sentencia.executeUpdate();
        return resultado != 0;
    }
}
