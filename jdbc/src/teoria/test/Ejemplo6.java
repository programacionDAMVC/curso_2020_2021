package teoria.test;

import teoria.patrones.DAO.LibroDAO;
import teoria.patrones.DAO.LibroDAOSQL;
import teoria.patrones.DTO.Libro;

import java.sql.SQLException;
import java.util.List;

public class Ejemplo6 {
    public static void main(String[] args) {
        LibroDAO daoLibro = new LibroDAOSQL();
        try {
            List<Libro> listaLibrosTotal = daoLibro.listarLibros();
            listaLibrosTotal.forEach(System.out::println);
            List<Libro> listaLibrosPorCategoria = daoLibro.listarLibrosPorCategoria(8);
            System.out.println("-----------------------------------------------");
            for (Libro libro: listaLibrosPorCategoria) {
                System.out.printf("%-25s%-15s%-10s%n", libro.getNombreLibro(), libro.getAutor(), libro.getEditorial());
            }
            System.out.println("-----------------------------------------------");
            boolean borrado = daoLibro.borrarLibroPorId(44);
            System.out.printf("Borrado libro %B%n", borrado);
            System.out.println("-----------------------------------------------");
            Libro libro = new Libro("El Quijote", "Cervantes", "Anaya", 2);
            boolean insertado = daoLibro.insertarLibro(libro);
            System.out.printf("Insertado libro %B%n", insertado);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
