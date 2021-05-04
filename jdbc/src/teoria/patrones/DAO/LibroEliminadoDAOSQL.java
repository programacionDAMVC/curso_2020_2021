package teoria.patrones.DAO;

import teoria.conexion.Conexion5;
import teoria.patrones.DTO.LibroEliminado;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
    public List<LibroEliminado> buscarLibrosEliminadosPorEditorial(String editorial) {
        return null;
    }

    @Override
    public List<LibroEliminado> buscarLibrosEliminadosEnUnAnno(int anno) throws SQLException {
        List<LibroEliminado> listaLibrosEliminado = buscarLibrosEliminados();
        //recorrer la lista y trabajando con el atributo fechaBaja, comparamos con anno
        //si coincide los añadimos a la lista
        return listaLibrosEliminado;
    }
}
