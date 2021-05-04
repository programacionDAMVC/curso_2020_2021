package teoria.test;

import teoria.patrones.DAO.LibroEliminadoDAO;
import teoria.patrones.DAO.LibroEliminadoDAOSQL;
import teoria.patrones.DTO.LibroEliminado;

import java.sql.SQLException;
import java.util.List;

public class ejemplo7 {
    public static void main(String[] args) {
        LibroEliminadoDAO eliminadoDAO = new LibroEliminadoDAOSQL();
        try {
            List<LibroEliminado> eliminados = eliminadoDAO.buscarLibrosEliminados();
            eliminados.forEach( libro -> System.out.println(libro));
            System.out.println("--------------------------------------------");
            List<LibroEliminado> eliminadosPorAnno = eliminadoDAO.buscarLibrosEliminadosEnUnAnno(2020);
            eliminadosPorAnno.forEach(System.out::println);
            System.out.println("--------------------------------------------");
            List<LibroEliminado> eliminadosPorEditorial = eliminadoDAO.buscarLibrosEliminadosPorEditorial("SM");
            for (LibroEliminado libro: eliminadosPorEditorial) {
                System.out.println(libro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
