package app5;

import app5.controlador.ModeloTabla;
import app5.controlador.Controlador;

import java.sql.SQLException;

public class App5 {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                app5.vista.App5 vista = new app5.vista.App5();
                try {
                    ModeloTabla modelo = new ModeloTabla();
                    new Controlador(vista, modelo);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
