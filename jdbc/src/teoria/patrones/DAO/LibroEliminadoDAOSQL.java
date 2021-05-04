package teoria.patrones.DAO;

import teoria.conexion.Conexion5;
import teoria.patrones.DTO.LibroEliminado;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibroEliminadoDAOSQL  implements LibroEliminadoDAO{
    private static Connection conexion;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    static {
        try {
            conexion = Conexion5.getInstance().getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<LibroEliminado> buscarLibrosEliminados() throws SQLException {
        List<LibroEliminado> listaLibrosEliminado = new ArrayList<>();
        String sql = "select * from historial_libro;";
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        while (resultado.next()) {
            String nombreLibro  = resultado.getString("nombre");
            String autor        = resultado.getString("autor");
            String editorial    = resultado.getString("editorial");
            String sFechaBaja   = resultado.getString("fecha_baja");
            LocalDateTime ldtFechaBaja = LocalDateTime.parse(sFechaBaja, formatter);
            LibroEliminado libroEliminado = new LibroEliminado(nombreLibro, autor, editorial, ldtFechaBaja);
            listaLibrosEliminado.add(libroEliminado);
        }
        return listaLibrosEliminado;
    }

    @Override
    public List<LibroEliminado> buscarLibrosEliminadosPorEditorial(String editorial) throws SQLException {
        List<LibroEliminado> libroEliminadosPorEditorial = new ArrayList<>();
        String sql ="select * from historial_libro where editorial=?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, editorial);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            String nombreLibro  = resultado.getString("nombre");
            String autor        = resultado.getString("autor");
            String edit    = resultado.getString("editorial");
            String sFechaBaja   = resultado.getString("fecha_baja");
            LocalDateTime ldtFechaBaja = LocalDateTime.parse(sFechaBaja, formatter);
            LibroEliminado libroEliminado = new LibroEliminado(nombreLibro, autor, edit, ldtFechaBaja);
            libroEliminadosPorEditorial.add(libroEliminado);
        }
        return libroEliminadosPorEditorial;
    }

    @Override
    public List<LibroEliminado> buscarLibrosEliminadosEnUnAnno(int anno) throws SQLException {
        List<LibroEliminado> listaLibroEliminadosPorAnno  = new ArrayList<>();
        /*List<LibroEliminado> listaLibrosEliminados = buscarLibrosEliminados();
        //recorrer la lista y trabajando con el atributo fechaBaja, comparamos con anno
       *//* for (LibroEliminado libro: listaLibrosEliminados) {
            //si coincide los añadimos a la lista
            if (libro.getFechaBaja().getYear() == anno)
                listaLibroEliminadosPorAnno.add(libro);
        }*//*
        //usando programación funcional (stream y filter)
        listaLibroEliminadosPorAnno = listaLibrosEliminados.stream().
                filter(libro -> libro.getFechaBaja().getYear() == anno).
                collect(Collectors.toList());*/
        //crear la sentencia para un PreparedStatement
        String sql = "select * from historial_libro where fecha_baja like ?;";
        //crear el PreparedStatement
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        //setear el PreparedStatemen
        sentencia.setString(1, anno + "%");
        //ejecutar la sentencia y obtener el ResultSet
        ResultSet resultado = sentencia.executeQuery();
        //recorrer el ResultSet y rellenar la lista
        while (resultado.next()) {
            String nombreLibro  = resultado.getString("nombre");
            String autor        = resultado.getString("autor");
            String editorial    = resultado.getString("editorial");
            String sFechaBaja   = resultado.getString("fecha_baja");
            LocalDateTime ldtFechaBaja = LocalDateTime.parse(sFechaBaja, formatter);
            LibroEliminado libroEliminado = new LibroEliminado(nombreLibro, autor, editorial, ldtFechaBaja);
            listaLibroEliminadosPorAnno.add(libroEliminado);
        }
        return listaLibroEliminadosPorAnno;
    }
}
