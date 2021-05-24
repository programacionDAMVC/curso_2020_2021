package modelo.dao;

import modelo.Conexion;
import modelo.dto.Cuenta;
import modelo.ficheros.AuxiliarFicheros;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CuentaDAOSQL implements CuentaDAO {

    private Connection conexion = Conexion.getInstance().getConexion();
    private Path path;
    public CuentaDAOSQL(Path path) throws IOException, SQLException {
        this.path = path;
    }

    @Override
    public List<Cuenta> obtenerTodasCuentas() throws SQLException, IOException {
        List<Cuenta> cuentas = new ArrayList<>();
        String sql = "select * from cuenta;";
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        while (resultado.next())
            cuentas.add(new Cuenta(resultado.getInt(1), resultado.getString(2), resultado.getString("last_name"),
                    resultado.getString("iban"), resultado.getDouble(5)));
        if (sentencia != null)
            sentencia.close();
        if (resultado != null)
            resultado.close();
        String fecha = LocalDateTime.now().toString();
        String log = String.format("%s :::: %s%n", fecha, sentencia.toString());
        System.out.printf("Escrito log: %B%n", AuxiliarFicheros.escribirLogs(path, log));
        return cuentas;
    }

    @Override
    public boolean borrarCuenta(int idCuenta) throws SQLException, IOException {
        String sql1 = "select * from cuenta where id = ?;";
        PreparedStatement sentencia1 = conexion.prepareStatement(sql1);
        sentencia1.setInt(1, idCuenta);
        sentencia1.executeQuery();
        String fecha = LocalDateTime.now().toString();
        String log = String.format("%s :::: %s%n", fecha, sentencia1.toString());
        System.out.printf("Escrito log: %B%n", AuxiliarFicheros.escribirLogs(path, log));
        String sql = "delete from cuenta where id = ?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, idCuenta);
        int resultado = sentencia.executeUpdate();

        fecha = LocalDateTime.now().toString();
        log = String.format("%s :::: %s, %d%n", fecha, sentencia.toString(), resultado);
        System.out.printf("Escrito log: %B%n", AuxiliarFicheros.escribirLogs(path, log));
        return resultado != 0;
    }

    @Override
    public boolean insertarCuenta(Cuenta cuentaSinID) {
        return false;
    }

    @Override
    public boolean actualizarCuentaPorID(Cuenta cuentaConID) {
        return false;
    }

    public static void main(String[] args) {
        try {
            CuentaDAO dao = new CuentaDAOSQL(Paths.get("ficheros/sql.log"));
            /*List<Cuenta> cuentas = dao.obtenerTodasCuentas();
            cuentas.forEach(System.out::println);*/
            dao.borrarCuenta(997);
         //   dao.insertarCuenta(new Cuenta("first", "last", "iban", 0));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
