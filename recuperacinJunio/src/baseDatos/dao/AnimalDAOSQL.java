package baseDatos.dao;

import baseDatos.Conexion;
import baseDatos.dto.Animal;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAOSQL implements AnimalDAO {
    Connection connection = Conexion.getInstance().getConexion();

    public AnimalDAOSQL() throws IOException, SQLException {}

    @Override
    public List<Animal> listarTodosAnimales() throws SQLException {
        List<Animal> lista = new ArrayList<>();
        String sentenciaSQL = "select * from animal;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sentenciaSQL);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nombreComun =  resultSet.getString(2);
            String nombreCientifico = resultSet.getString("nombreCientifico");
            Animal animal = new Animal(id, nombreComun, nombreCientifico);
            lista.add(animal);
        }
        return lista;
    }

    @Override
    public Animal obtenerAnimalPorId(int id) throws SQLException {
        Animal animal = null;
        String sentenciaSQL = "select * from animal where id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){

            String nombreComun =  resultSet.getString(2);
            String nombreCientifico = resultSet.getString("nombreCientifico");
            animal = new Animal(id, nombreComun, nombreCientifico);
        }
        return animal;
    }

    @Override
    public void insertarAnimal(Animal animal) {

    }

    @Override
    public void actualizarNombreComunAnimal(String nuevoNombreComun, int id) {

    }

    @Override
    public void borrarAnimalPorId(int id) {

    }
}
