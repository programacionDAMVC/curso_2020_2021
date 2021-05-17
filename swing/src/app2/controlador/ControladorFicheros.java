package app2.controlador;

import app2.modelo.Ficheros;
import app2.vista.Vista;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ControladorFicheros {

    private Vista vista;
    private Ficheros modelo;
    private static String rutaAbsoluta = "";
    public ControladorFicheros(Vista vista, Ficheros modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.getGuardarButton().setEnabled(false);
        gestionarEventos();
    }

    private void gestionarEventos() {
        vista.getAbrirButton().addActionListener(e -> cargarFichero());
        vista.getGuardarButton().addActionListener(e -> guardarTexto());

    }

    private void guardarTexto() {
        /*if (rutaAbsoluta.length() == 0) {
            JOptionPane.showMessageDialog(vista.getFrame(), "No se ha abierto ningún fichero");
            return;
        }*/
        String textoAGuardar = vista.getTextArea1().getText();
        try {
            modelo.escribirEnFichero(textoAGuardar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarFichero() {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Solo ficheros de texto", "txt");
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(vista.getFrame());
        if (returnVal == JFileChooser.CANCEL_OPTION)
            return;
        if(returnVal == JFileChooser.APPROVE_OPTION) {
          //  System.out.println("You chose to open this file: " +
          //          chooser.getSelectedFile().getAbsolutePath());
            rutaAbsoluta = chooser.getSelectedFile().getAbsolutePath();
            vista.getGuardarButton().setEnabled(true);
        }
        modelo.setRutaFichero(Paths.get(rutaAbsoluta));
        try {
            vista.getTextArea1().setText(modelo.leerTexto());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
