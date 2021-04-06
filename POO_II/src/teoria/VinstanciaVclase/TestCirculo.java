package teoria.VinstanciaVclase;

import java.util.Arrays;
import java.util.List;

public class TestCirculo {
    public static void main(String[] args) {
        //array de cinco objetos Círculo
        Circulo[] circulos = new Circulo[5];
       // System.out.println(circulos[0].getRadio()); NullPointerException
        for (int i = 0; i < 5; i++) {
            circulos[i] = new Circulo((float) (Math.random() * 10));
            System.out.printf("Índice: %d, Número de círculos creados: %d%n",i, Circulo.numeroCirculos);
        }

       // System.out.println(circulos[0].getRadio());
        System.out.println(Arrays.toString(circulos));
        System.out.printf("Nº de círculos creados %d", Circulo.numeroCirculos);
    }
}
