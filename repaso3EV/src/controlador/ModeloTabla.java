package controlador;

import modelo.dao.CuentaDAO;
import modelo.dao.CuentaDAOSQL;
import modelo.dto.Cuenta;

import javax.swing.table.AbstractTableModel;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

public class ModeloTabla extends AbstractTableModel {
    private CuentaDAO dao = new CuentaDAOSQL(Paths.get("ficheros/sql.log"));
    private List<Cuenta> cuentas;
    private String[] cabecera = {"ID", "FIRST NAME", "LAST NAME", "IBAN", "BALANCE"};

    public ModeloTabla() throws IOException, SQLException {
        this.cuentas = dao.obtenerTodasCuentas();
    }

    @Override
    public int getRowCount() {
        return cuentas.size();
    }

    @Override
    public int getColumnCount() {
        return cabecera.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return cuentas.get(row).getId();
            case 1:
                return cuentas.get(row).getFirstName();
            case 2:
                return cuentas.get(row).getLastName();
            case 3:
                return cuentas.get(row).getIban();
            case 4:
                return cuentas.get(row).getSaldo();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return  cabecera[column];
    }
}
