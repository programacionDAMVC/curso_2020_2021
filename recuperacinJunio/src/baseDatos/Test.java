package baseDatos;

import baseDatos.dao.AnimalDAO;
import baseDatos.dao.AnimalDAOSQL;
import baseDatos.dto.Animal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try (Connection conexion1 = Conexion.getInstance().getConexion();
             Connection conexion2 = Conexion.getInstance().getConexion();
             Connection conexion3 = Conexion.getInstance().getConexion()) {
            System.out.println(conexion1);
            System.out.println(conexion2);
            System.out.println(conexion3);
            AnimalDAO dao = new AnimalDAOSQL();
            List<Animal> lista = dao.listarTodosAnimales();
            System.out.println(lista.size());
            System.out.println(lista.get(99));
            System.out.println(lista.get(0));
            Animal animal12 = dao.obtenerAnimalPorId(12);
            System.out.printf("Animal 12: %s%n", animal12);
            Animal animal63 = dao.obtenerAnimalPorId(63);
            System.out.printf("Animal 63: %s%n", animal63);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
