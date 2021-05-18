package app5.modelo.DAOS;

import app5.modelo.DTOS.Libro;

import java.sql.SQLException;
import java.util.List;

public interface LibroDAO {
    List<Libro> listarLibros() throws SQLException;
    List<Libro> listarLibrosPorCategoria(int idCategoria) throws SQLException;
    boolean borrarLibroPorId(int idLibro) throws SQLException;
    boolean insertarLibro(Libro libro) throws SQLException;
    int getIDLibro(Libro libro) throws SQLException;
    boolean actualizarLibro(Libro libro) throws SQLException;
}
