package teoria.test;

import teoria.operacionesBD.inserccionDatos.InsertarActualizarBorrarDatos;
import teoria.operacionesBD.selectDatos.BusquedaDatos;

import java.sql.SQLException;

public class Ejemplo5 {
    public static void main(String[] args) {
        try {
            boolean resultado1 = InsertarActualizarBorrarDatos.insertarUsuario("gabriel garcía", "lópez lópez");
            System.out.printf("Insertado usuario: %B%n", resultado1);
            boolean resultado2 = InsertarActualizarBorrarDatos.insertarLibro("libro nuevo", "autor nuevo", "categora", 1);
            System.out.printf("Insertado libro: %B%n", resultado2);
            boolean resultado3 = InsertarActualizarBorrarDatos.actulizarNombreCategoriaPorId("Varios", 9);
            System.out.printf("Actualizada categoría: %B%n", resultado3);
            boolean resultado4 = InsertarActualizarBorrarDatos.borrarCategoriaPorId(9);
            System.out.printf("Borrada categoría: %B%n", resultado4);
            System.out.println("------------------------------------------");
            System.out.println(BusquedaDatos.obtenerLibrosPrestadosUsuarios());
            System.out.println("------------------------------------------");
            BusquedaDatos.obtenerLibrosNoPrestadosPorEditorial("jj 'OR '1'='1");
            System.out.println("------------------------------------------");
            BusquedaDatos.obtenerLibrosNoPrestadosPorEditorialSeguro("SM");
            System.out.println("------------------------------------------");
            BusquedaDatos.obtenerLibrosNoPrestadosPorEditorialSeguro("jj 'OR '1'='1");
            System.out.println("------------------------------------------");
            boolean resultado5 = InsertarActualizarBorrarDatos.insertarLibroSeguro("libro nuevo", "autor nuevo", "categora", 1);
            System.out.printf("Insertado libro: %B%n", resultado5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
