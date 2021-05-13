package vistas;
/*el problema de este código es que se mezcla
el modelo, la vista y la lógina de negocio
 */
import teoria.patrones.DAO.CategoriaDAO;
import teoria.patrones.DAO.CategoriaDAOSQL;
import teoria.patrones.DAO.LibroDAO;
import teoria.patrones.DAO.LibroDAOSQL;
import teoria.patrones.DTO.Libro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppLibrary {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JLabel titleAppLabel;
    private JPanel bottomPanel;
    private JButton buttonCreate;
    private JButton buttonPrevious;
    private JButton buttonUpdate;
    private JButton buttonNext;
    private JButton buttonDelete;
    private JPanel centralPanel;
    private JTextField textFielID;
    private JTextField textFieldTitle;
    private JTextField textFieldAuthor;
    private JTextField textFieldEditorial;
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
        buttonPrevious.addActionListener(e-> {
            pagina--;
            if (pagina < 0)
                pagina = libros.size() -1;

            mostrarLibro();
        });
        buttonDelete.addActionListener(e -> {
            //borrado de la BD
            int id = libros.get(pagina).getIdLibro();
            try {
                boolean borrado = libroDAO.borrarLibroPorId(id);
                //eliminamos el libro de la lista
                Libro libro = libros.remove(pagina);
                String mensaje = String.format("Libro borrado: %s", libro.getNombreLibro());
                if (borrado && libro != null)
                    JOptionPane.showMessageDialog(frame, mensaje, "Borrado", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(frame, "No se ha borrado el libro", "Borrado", JOptionPane.ERROR_MESSAGE);

                if (pagina == libros.size())
                    pagina--;
                if (pagina < 0)
                    mostrarVistaVacia();
                else
                    mostrarLibro();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }



        });
        buttonUpdate.addActionListener(e -> {
            int idLibro = Integer.parseInt(textFielID.getText());
            String titulo = textFieldTitle.getText();
            String autor = textFieldAuthor.getText();
            String editorial = textFieldEditorial.getText();
            String sIdCategoria = textFieldCategory.getText();
            int idCategoria = devolverIdCategoria(sIdCategoria);
            if (idCategoria == -1){
                JOptionPane.showMessageDialog(frame, "No se puede actualizar, no existe esa categoría en la BD",
                        "Actualización", JOptionPane.ERROR_MESSAGE);
                mostrarLibro();
                return;
            }
            Libro libro = new Libro(idLibro, titulo, autor, editorial, idCategoria);
            try {
                boolean actualizacion = libroDAO.actualizarLibroPorId(libro);
                String mensaje = String.format("Actualizado libro con id %d", idLibro);
                if (actualizacion) {
                    JOptionPane.showMessageDialog(frame, mensaje, "Actualización", JOptionPane.INFORMATION_MESSAGE);
                    libros.get(pagina).setNombreLibro(libro.getNombreLibro());
                    libros.get(pagina).setAutor(libro.getAutor());
                    libros.get(pagina).setEditorial(libro.getEditorial());
                    libros.get(pagina).setIdCategoria(libro.getIdCategoria());

                }
                else
                    JOptionPane.showMessageDialog(frame, "No se ha podido actualizar el libro", "Actualización", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        buttonCreate.addActionListener(e -> {
            String titulo = null;
            while (true) {
                titulo = JOptionPane.showInputDialog(frame, "Título del libro");

                if (titulo == null)
                    return;
                if (titulo.length() != 0)
                    break;
            }
            String autor = null;
            while (true) {
                autor = JOptionPane.showInputDialog(frame, "Autor del libro");

                if (autor == null)
                    return;
                if (autor.length() != 0)
                    break;
            }
            String editorial = null;
            while (true) {
                editorial = JOptionPane.showInputDialog(frame, "Editorial del libro");

                if (editorial == null)
                    return;
                if (editorial.length() != 0)
                    break;

            }

            Object[] categorias = new String[mapCategorias.size()];
             Set<Integer> claves = mapCategorias.keySet();
             int contador = 0;
            for (Integer clave: claves) {
                categorias[contador] = mapCategorias.get(clave);
                contador++;
            }
            //System.out.println(Arrays.toString(categorias));
            Object categoria = JOptionPane.showInputDialog(frame,
                    "SELECCIONA CATEGORÍA", "Categorías",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    categorias, categorias[0]);
            if (categoria == null)
                return;
            Libro libroNuevo = new Libro(titulo, autor, editorial, devolverIdCategoria(categoria.toString()));
            //añadirlo a lista el nuevo libro
           // libros.add(libroNuevo); añade un id 0 -valor por defecto- no sincronizado con la BD
            //añadirlo a la BD
            try {
                boolean insertar = libroDAO.insertarLibro(libroNuevo);
                if (insertar) {
                    libros = libroDAO.listarLibros();
                    //nos vamos al libro que acabamos de insertar
                    pagina = libros.size() -1;
                    mostrarLibro();
                    JOptionPane.showMessageDialog(frame, "Añadido libro correctamente",
                            "Actualización", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "No se puede añadir libro",
                            "Actualización", JOptionPane.ERROR_MESSAGE);
                }


            } catch (SQLException ex) {
                ex.printStackTrace();
            }


        });
    }
    //este método es del modelo
    private int devolverIdCategoria(String sIdCategoria) {
        Set<Integer> conjuntoClaves = mapCategorias.keySet();
        for (Integer clave: conjuntoClaves) {
            if(mapCategorias.get(clave).equalsIgnoreCase(sIdCategoria))
                return clave;
        }
        return -1;
    }

    private void mostrarVistaVacia() {
        textFielID.setText("");
        textFieldTitle.setText("");
        textFieldAuthor.setText("");
        textFieldEditorial.setText("");
        textFieldCategory.setText("");
        buttonPrevious.setEnabled(false);
        buttonNext.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonUpdate.setEnabled(false);
    }

    private void mostrarLibro() {
        System.out.println(pagina);
        textFielID.setText(libros.get(pagina).getIdLibro() + "");
        textFieldTitle.setText(libros.get(pagina).getNombreLibro());
        textFieldAuthor.setText(libros.get(pagina).getAutor());
        textFieldEditorial.setText(libros.get(pagina).getEditorial());
        textFieldCategory.setText(mapCategorias.get(libros.get(pagina).getIdCategoria()));
    }
}
