package teoria.patrones.DAO;

import teoria.patrones.DTO.Libro;

import java.sql.SQLException;
import java.util.List;

public interface LibroDAO {
    List<Libro> listarLibros() throws SQLException;
    List<Libro> listarLibrosPorCategoria(int idCategoria) throws SQLException;
    boolean borrarLibroPorId(int idLibro) throws SQLException;
    boolean insertarLibro(Libro libro) throws SQLException;
    boolean actualizarLibroPorId(Libro libro) throws SQLException;
}
