package teoria.patrones.DAO;

import teoria.patrones.DTO.LibroEliminado;

import java.sql.SQLException;
import java.util.List;

public interface LibroEliminadoDAO {
    List<LibroEliminado> buscarLibrosEliminados() throws SQLException;
    List<LibroEliminado> buscarLibrosEliminadosPorEditorial(String editorial);
    List<LibroEliminado> buscarLibrosEliminadosEnUnAnno(int anno) throws SQLException;
}
