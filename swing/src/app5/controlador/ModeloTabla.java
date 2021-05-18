package app5.controlador;

import app5.modelo.DAOS.LibroDAO;
import app5.modelo.DAOS.LibroDAOSQL;
import app5.modelo.DTOS.Libro;

import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.List;

public class ModeloTabla extends AbstractTableModel {
    private static final LibroDAO libroDAO = new LibroDAOSQL();
    List<Libro> libros = libroDAO.listarLibros();

    public ModeloTabla() throws SQLException {
    }

    @Override
    public int getRowCount() {
        return libros.size();
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return null;
    }
}
