package app5.vista;

import javax.swing.*;
import java.awt.*;

public class App5 {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JTextField textFieldFilter;
    private JButton buttonFilter;
    private JPanel bottonPanel;
    private JButton buttonDelete;
    private JButton buttonAdd;
    private JScrollPane centralPanel;
    private JTable tableData;
    private JPanel rightPanel;
    private JTextField textFieldTitulo;
    private JTextField textFieldAutor;
    private JTextField textFieldEditorial;
    private JComboBox comboBoxCategoria;
    private JButton guardarButton;

    public JComboBox getComboBoxCategoria() {
        return comboBoxCategoria;
    }

    public JButton getButtonAdd() {
        return buttonAdd;
    }

    public JPanel getRightPanel() {
        return rightPanel;
    }

    public JTable getTableData() {
        return tableData;
    }

    public JButton getButtonDelete() {
        return buttonDelete;
    }

    public App5() {
        JFrame frame = new JFrame();
        frame.setTitle("Library APP");
        frame.setContentPane(mainPanel);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dimension.width / 2, dimension.height /2);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
