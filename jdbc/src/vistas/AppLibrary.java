package vistas;

import teoria.patrones.DAO.CategoriaDAO;
import teoria.patrones.DAO.CategoriaDAOSQL;
import teoria.patrones.DAO.LibroDAO;
import teoria.patrones.DAO.LibroDAOSQL;
import teoria.patrones.DTO.Libro;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class AppLibrary {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JLabel titleAppLabel;
    private JPanel bottomPanel;
    private JButton buttonCreate;
    private JButton buttonPrevious;
    private JButton buttonUpdaate;
    private JButton buttonNext;
    private JButton buttonDelete;
    private JPanel centralPanel;
    private JTextField textFielID;
    private JTextField textFieldTitle;
    private JTextField textFieldAuthor;
    private JTextField textFieldEidtorial;
    private JTextField textFieldCategory;
    private static LibroDAO libroDAO = new LibroDAOSQL();
    private static List<Libro> libros;
    private static CategoriaDAO categoriaDAO = new CategoriaDAOSQL();
    private static Map<Integer, String> mapCategorias;
    private static int pagina = 0;

    static {
        try {
            mapCategorias = categoriaDAO.crearDiccionarioCategorias();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            libros = libroDAO.listarLibros();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public AppLibrary() {
        JFrame frame = new JFrame("LIBRERÍA");
        frame.setContentPane(mainPanel);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(pantalla.width / 3, pantalla.height / 3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
       // System.out.println(libros.get(pagina));
        mostrarLibro();
        buttonNext.addActionListener(e -> {
           /* pagina++;
            if (pagina == libros.size())
                pagina = 0;*/
           pagina = ++pagina % libros.size();
            mostrarLibro();
        });
    }

    private void mostrarLibro() {
        System.out.println(pagina);
        textFielID.setText(libros.get(pagina).getIdLibro() + "");
        textFieldTitle.setText(libros.get(pagina).getNombreLibro());
        textFieldAuthor.setText(libros.get(pagina).getAutor());
        textFieldEidtorial.setText(libros.get(pagina).getEditorial());
        textFieldCategory.setText(mapCategorias.get(libros.get(pagina).getIdCategoria()));
    }
}
