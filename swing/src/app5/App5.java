package app5;

public class App5 {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                app5.vista.App5 vista = new app5.vista.App5();
                //modelo
                //controlador
            }
        });
    }
}
