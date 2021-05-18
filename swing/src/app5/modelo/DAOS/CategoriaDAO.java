package app5.modelo.DAOS;

import java.sql.SQLException;
import java.util.Map;

public interface CategoriaDAO {
    Map<Integer, String> mapearCategorias() throws SQLException;
}
