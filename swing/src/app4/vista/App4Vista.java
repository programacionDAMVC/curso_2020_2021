package app4.vista;

import javax.swing.*;
import java.awt.*;

public class App4Vista {
    private JPanel panelPrincipal;
    private JPanel panelSuperior;
    private JTextField textFiltro;
    private JButton buttonFiltro;
    private JScrollPane panelCentral;
    private JTable table1;

    public App4Vista() {
        JFrame frame = new JFrame("Ejemplo tabla");
        frame.setContentPane(panelPrincipal);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dimension.width /2 , dimension.height /2);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
