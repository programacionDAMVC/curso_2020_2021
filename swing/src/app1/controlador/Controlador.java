package app1.controlador;

import app1.modelo.Diccionario;
import app1.vista.App1Vista;

import java.awt.event.ActionEvent;

public class Controlador {
    private Diccionario modelo;
    private App1Vista vista;

    public Controlador(Diccionario modelo, App1Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        registrarEventos();
    }

    private void registrarEventos() {
        vista.getEspanolButton().addActionListener(e -> manejarBotones(e));
        vista.getInglesButton().addActionListener(e -> manejarBotones(e));
    }

    private void manejarBotones(ActionEvent e) {
       // System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Español"))
            traducirCastellano();
        else
            traducirIngles();
    }

    private void traducirIngles() {
        String palabra = vista.getTraduccion().getText();
       // System.out.println(palabra);
        String traduccion = modelo.getDiccionario().get(palabra);
       // System.out.println(traduccion);
        vista.getPalabraTraducida().setText(traduccion);
    }

    private void traducirCastellano() {
        String palabra = vista.getTraduccion().getText();
        String traduccion = modelo.devolverKey(palabra);
        vista.getPalabraTraducida().setText(traduccion);
    }


}
