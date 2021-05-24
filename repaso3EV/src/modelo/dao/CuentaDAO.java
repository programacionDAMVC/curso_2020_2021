package modelo.dao;

import modelo.dto.Cuenta;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface CuentaDAO {
    List<Cuenta> obtenerTodasCuentas() throws SQLException, IOException;
    boolean borrarCuenta(int idCuenta) throws SQLException, IOException;
    boolean insertarCuenta(Cuenta cuentaSinID);
    boolean actualizarCuentaPorID(Cuenta cuentaConID);
}
