package controlador;

import vista.CuentaVista;

public class Controlador {
    private ModeloTabla modeloTabla;
    private CuentaVista vista;

    public Controlador(ModeloTabla modeloTabla, CuentaVista vista) {
        this.modeloTabla = modeloTabla;
        this.vista = vista;
        generarTabla();
    }

    private void generarTabla() {
        vista.getTable1().setModel(modeloTabla);
    }
}
