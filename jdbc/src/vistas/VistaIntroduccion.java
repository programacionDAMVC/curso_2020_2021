package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton botonCierre;

    public VistaIntroduccion() {
        //registro de eventos
        botonMayuscula.addActionListener( e -> {
            //System.out.println("Me acabas de pulsar");
            String nombre = textFieldNombre.getText(); //
            String nombreMayuscula = nombre.toUpperCase();
            System.out.println(nombreMayuscula);
            textFieldNombre.setText(nombreMayuscula);
        });
        botonCierre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("título de la ventana");
        VistaIntroduccion vista = new VistaIntroduccion();
        frame.setContentPane(vista.panelPrincipal);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(pantalla.width / 3, pantalla.height / 2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //CENTRAMOS LA VENTANA
        frame.setVisible(true);
    }
}
