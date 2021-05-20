package app5.controlador;

import app5.modelo.DAOS.CategoriaDAO;
import app5.modelo.DAOS.CategoriaDAOSQL;
import app5.modelo.DAOS.LibroDAO;
import app5.modelo.DAOS.LibroDAOSQL;
import app5.modelo.DTOS.Libro;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class ModeloTabla extends AbstractTableModel {
    private static final String[] COLUMNAS = {"ID", "TÍTULO", "AUTOR", "EDITORIAL", "CATEGORÍA"};
    private static final LibroDAO libroDAO = new LibroDAOSQL();
    private static  List<Libro> libros;
    private static  final CategoriaDAO categoriaDAO = new CategoriaDAOSQL();
    private static Map<Integer, String> mapCategorias;

    public ModeloTabla() throws SQLException {
        libros = libroDAO.listarLibros();
        mapCategorias = categoriaDAO.mapearCategorias();
    }

    @Override
    public int getRowCount() {
        return libros.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public Object getValueAt(int row, int column)
    {
        Object celda = null;
        switch (column) {
            case 0:
                celda = libros.get(row).getIdLibro();
                break;
            case 1:
                celda = libros.get(row).getNombreLibro();
                break;
            case 2:
                celda = libros.get(row).getAutor();
                break;
            case 3:
                celda  = libros.get(row).getEditorial();
                break;
            case 4:
                celda = mapCategorias.get(libros.get(row).getIdCategoria());
                break;
        }
        return celda;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 1 || columnIndex == 2 || columnIndex == 3;
    }

    public void removeRow (int row) throws SQLException {
        if (row < 0)
            return;
        ////eliminar de la base de datos
        int idLibro = libros.get(row).getIdLibro();
        libroDAO.borrarLibroPorId(idLibro);
        //eliminar de lista
        libros.remove(row);
        fireTableDataChanged();


    }
}
