import controlador.Controlador;
import controlador.ModeloTabla;
import vista.CuentaVista;

import java.io.IOException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    ModeloTabla modeloTabla = new ModeloTabla();
                    CuentaVista vista = new CuentaVista();
                    new Controlador(modeloTabla, vista);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
