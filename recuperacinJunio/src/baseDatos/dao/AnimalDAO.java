package baseDatos.dao;

import baseDatos.dto.Animal;

import java.sql.SQLException;
import java.util.List;

public interface AnimalDAO {
    //crud: create, read, update y delete
    //select * from animal; :
    List<Animal> listarTodosAnimales() throws SQLException;
    // select * from animal where id = 15;
    Animal obtenerAnimalPorId(int id) throws SQLException;
    //insert into  animal (nombreComun, nombreCientifico)  VALUES ("perro", "cannis");
    void insertarAnimal(Animal animal);
    // update animal set nombreComun="chucho" where id = 101;
    void actualizarNombreComunAnimal(String nuevoNombreComun, int id);
    //delete from animal where id = 101;
    void borrarAnimalPorId (int id);
}
