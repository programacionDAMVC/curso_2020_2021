package ejercicios;


import javax.swing.*;

public class TestTrianguloRectangulo {
    public static void main(String[] args) {
        String sCateto1 = JOptionPane.showInputDialog("Introduce valor cateto 1");
        String sCateto2 = JOptionPane.showInputDialog("Introduce valor cateto 2");
        double dCateto1 = Double.parseDouble(sCateto1);
        double dCateto2 = Double.parseDouble(sCateto2);
        TrianguloRectangulo t = new TrianguloRectangulo(dCateto1, dCateto2);
    //    TrianguloRectangulo t2 = new TrianguloRectangulo(1, 2);
        System.out.println(t);
       // System.out.println(t2);

        // String resultado = "Triángulo de cateto 1: " + dCateto1 + ", y cateto 2: " + dCateto2;
      //  String resultado = String.format("Triángulo de cateto 1: %.2f y cateto 2: %.2f", dCateto1, dCateto2);
       JOptionPane.showMessageDialog(null, t, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        //mostrar hipotenusa
        //mostrar el área
        //mostrar el perímetro
        //mostrar toString
    }
}
