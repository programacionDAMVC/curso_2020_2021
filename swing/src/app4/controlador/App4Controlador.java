package app4.controlador;

import app4.modelo.Datos;
import app4.vista.App4Vista;

import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Vector;

public class App4Controlador {
    private App4Vista vista;
    private ModeloTabla modeloTabla;

    public App4Controlador(App4Vista vista) {
        this.vista = vista;
        modeloTabla = new ModeloTabla();
        vista.getTable1().setModel(modeloTabla);
        registrarEventos();
    }

    private void registrarEventos() {
        vista.getButtonFiltro().addActionListener(e -> filtrarEnTabla());
    }

    private void filtrarEnTabla() {
        String texto = vista.getTextFiltro().getText();
        Object[][] datos = Datos.DATA;
        Object[][] datosFiltrados = new Object[Datos.DATA.length][];
        int contador = 0;
        for (Object[] dato: datos) {
            if (((String) dato[0]).contains(texto))
                //System.out.println(dato[0]);
                datosFiltrados[contador++] = dato;
        }
        //System.out.println(texto);
        modeloTabla.setDataVector(datosFiltrados, Datos.TABLE_HEADER);
    }
}
