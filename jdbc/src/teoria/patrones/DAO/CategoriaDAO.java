package teoria.patrones.DAO;

import java.sql.SQLException;
import java.util.Map;

public interface CategoriaDAO {
    Map<Integer, String > crearDiccionarioCategorias () throws SQLException;
}
