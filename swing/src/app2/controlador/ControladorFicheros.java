package app2.controlador;

import app2.modelo.Ficheros;
import app2.vista.Vista;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ControladorFicheros {
    private Vista vista;
    private Ficheros modelo;

    public ControladorFicheros(Vista vista, Ficheros modelo) {
        this.vista = vista;
        this.modelo = modelo;
        gestionarEventos();
    }

    private void gestionarEventos() {
        vista.getAbrirButton().addActionListener(e -> cargarFichero());

    }

    private void cargarFichero() {

        modelo.setRutaFichero(Paths.get("FICHEROS/texto.txt"));
        try {
            vista.getTextArea1().setText(modelo.leerTexto());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
