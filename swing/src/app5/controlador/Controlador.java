package app5.controlador;

import app5.modelo.DTOS.Libro;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

public class Controlador {
    private app5.vista.App5 vista;
    private ModeloTabla modelo;
    private JComboBox comboBox;
    private TableRowSorter<TableModel> sorter;


    public Controlador(app5.vista.App5 vista, ModeloTabla modelo) throws SQLException {
        this.vista = vista;
        this.modelo = modelo;
        generarTabla();
        registrarEventos();
    }

    private void registrarEventos() {
        vista.getButtonDelete().addActionListener(e -> borrarFila());
        vista.getButtonAdd().addActionListener(e -> addRow());
        vista.getCancelarButton().addActionListener(e -> ocultarAdd());
        vista.getGuardarButton().addActionListener(e -> guardarLibro());
        vista.getButtonFilter().addActionListener(e -> filtrar());
    }

    private void filtrar() {
        String filtro = vista.getTextFieldFilter().getText();
        sorter.setRowFilter(RowFilter.regexFilter(filtro));
     //   vista.getButtonDelete().setEnabled(false);
     //   if (filtro.length() == 0)
      //      vista.getButtonDelete().setEnabled(true);
    }

    private void guardarLibro() {

        String titulo = vista.getTextFieldTitulo().getText();
        String autor  = vista.getTextFieldAutor().getText();
        String editorial = vista.getTextFieldEditorial().getText();
        String sCategoria = (String) comboBox.getSelectedItem();
        int idCategoria = 0;
        for (int id : ModeloTabla.mapCategorias.keySet()) {
            if(sCategoria.equals(ModeloTabla.mapCategorias.get(id))) {
                idCategoria = id;
                break;
            }
        }
        Libro libroNuevo = new Libro(titulo, autor, editorial, idCategoria);
        try {
            modelo.addRow(libroNuevo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        vista.getRightPanel().setVisible(false);
    }

    private void ocultarAdd() {
        vista.getTextFieldAutor().setText("");
        vista.getTextFieldEditorial().setText("");
        vista.getTextFieldTitulo().setText("");
        vista.getRightPanel().setVisible(false);
    }

    private void addRow() {
        vista.getRightPanel().setVisible(true);
    }

    private void borrarFila() {
       // System.out.println("pulsado borrar");
        int row = vista.getTableData().getSelectedRow();
        int r = vista.getTableData().convertRowIndexToModel(row);
      //  System.out.println("Fila seleccionada: " + row);
        try {
            modelo.removeRow(r);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void generarTabla() {
        sorter = new TableRowSorter<TableModel>(modelo);
        vista.getTableData().setModel(modelo);
        vista.getTableData().setRowSorter(sorter);
        vista.getRightPanel().setVisible(false);
        comboBox = vista.getComboBoxCategoria();
        for (int id : ModeloTabla.mapCategorias.keySet()) {
            comboBox.addItem(ModeloTabla.mapCategorias.get(id));
        }
    }
}
