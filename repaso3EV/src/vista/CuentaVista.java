package vista;

import javax.swing.*;
import java.awt.*;

public class CuentaVista {
    private JPanel panel1;
    private JTable table1;

    public JTable getTable1() {
        return table1;
    }

    public CuentaVista() {
        JFrame frame = new JFrame("Título");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dimension.width / 2, dimension.height /2);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
