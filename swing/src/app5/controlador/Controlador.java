package app5.controlador;

import javax.swing.*;
import java.sql.SQLException;

public class Controlador {
    private app5.vista.App5 vista;
    private ModeloTabla modelo;

    public Controlador(app5.vista.App5 vista, ModeloTabla modelo) throws SQLException {
        this.vista = vista;
        this.modelo = modelo;
        generarTabla();
        registrarEventos();
    }

    private void registrarEventos() {
        vista.getButtonDelete().addActionListener(e -> borrarFila());
        vista.getButtonAdd().addActionListener(e -> addRow());
    }

    private void addRow() {
        vista.getRightPanel().setVisible(true);
        JComboBox comboBox = vista.getComboBoxCategoria();
        modelo.
        comboBox.addItem("ejemplo");
    }

    private void borrarFila() {
       // System.out.println("pulsado borrar");
        int row = vista.getTableData().getSelectedRow();
      //  System.out.println("Fila seleccionada: " + row);
        try {
            modelo.removeRow(row);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void generarTabla() {
        vista.getTableData().setModel(modelo);
        vista.getRightPanel().setVisible(false);
    }
}
