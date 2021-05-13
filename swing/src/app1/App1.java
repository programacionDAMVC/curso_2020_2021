package app1;

import app1.vista.App1Vista;

public class App1 {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                App1Vista vista = new App1Vista();
                //crear modelo
                //crear controlador
            }
        });
    }
}
