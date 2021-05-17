package app4;

import app4.vista.App4Vista;

public class App4 {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                App4Vista vista = new App4Vista();
            }
        });
    }
}
