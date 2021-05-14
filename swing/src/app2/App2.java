package app2;


import app2.controlador.ControladorFicheros;
import app2.modelo.Ficheros;
import app2.vista.Vista;

/*
Aplicación que nos permite abrir un fichero de texto,
mostrarlo en un textArea y permite modificarlo y
guardarlo
 */
public class App2 {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Vista vista = new Vista();
                Ficheros modelo = new Ficheros();
                new ControladorFicheros(vista, modelo);
              /*  App1Vista vista = new App1Vista();
                Diccionario modelo = new Diccionario();
                Controlador controlador = new Controlador(modelo, vista);*/
            }
        });
    }
}
