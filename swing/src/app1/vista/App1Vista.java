package app1.vista;

import javax.swing.*;
import java.awt.*;

public class App1Vista {
    private JPanel panelPrincipal;
    private JPanel panelArriba;
    private JPanel panelInferior;
    private JButton inglesButton;
    private JButton espanolButton;
    private JPanel panelCentral;
    private JTextField traduccion;
    private JLabel label;
    private JLabel palabraTraducida;

    public JButton getInglesButton() {
        return inglesButton;
    }

    public JButton getEspanolButton() {
        return espanolButton;
    }

    public JTextField getTraduccion() {
        return traduccion;
    }

    public JLabel getPalabraTraducida() {
        return palabraTraducida;
    }

    public App1Vista() {
        JFrame frame = new JFrame("APP MVC");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setContentPane(panelPrincipal);
        frame.setSize(pantalla.width / 3, pantalla.height /3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
