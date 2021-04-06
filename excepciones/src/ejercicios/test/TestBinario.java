package ejercicios.test;

import ejercicios.ejercicio2.Binaria;
import ejercicios.ejercicio2.NoBinarioException;

public class TestBinario {
    public static void main(String[] args) {
        try {
            Binaria b = new Binaria("1100110");
            System.out.println(b);
            System.out.printf("Valor en decimal: %d%n", b.calcularValorDecimal());
        } catch (NoBinarioException e) {
            System.out.println(e.getMessage());
        }
    }
}
