package vistas;

import javax.swing.*;

public class VistaIntroduccion {
    private JPanel panelPrincipal;
    private JPanel panelSuperior;
    private JLabel etiquetaTitulo;
    private JPanel panelInferior;
    private JButton botonMayuscula
            ;
    private JPanel panelCentral;
    private JLabel etiquetaNombre;
    private JTextField textFieldNombre;

    public static void main(String[] args) {
        JFrame frame = new JFrame("título de la ventana");
        VistaIntroduccion vista = new VistaIntroduccion();
        frame.setContentPane(vista.panelPrincipal);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
