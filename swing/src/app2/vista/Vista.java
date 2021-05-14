package app2.vista;

import javax.swing.*;
import java.awt.*;

public class Vista {
    private JPanel panelPrincipal;
    private JPanel panelSuperior;
    private JPanel panelInferior;
    private JButton abrirButton;
    private JButton guardarButton;
    private JScrollPane panelCentral;
    private JTextArea textArea1;

    public JButton getAbrirButton() {
        return abrirButton;
    }

    public JButton getGuardarButton() {
        return guardarButton;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public Vista() {
        JFrame frame = new JFrame("App MVC 2");
        frame.setContentPane(panelPrincipal);
        Dimension dimension =  Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dimension.width / 2, dimension.height /2);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
