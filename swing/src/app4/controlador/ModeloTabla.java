package app4.controlador;

import app4.modelo.Datos;

import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel {
    public ModeloTabla() {
        super(Datos.DATA, Datos.TABLE_HEADER);
    }
}
