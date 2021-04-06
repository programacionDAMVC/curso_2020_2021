package ejercicios.test;

import ejercicios.ejercicio2.Hexadecimal;
import ejercicios.ejercicio2.NoHexadecimalException;

public class TestHexadecimal {
    public static void main(String[] args) {
        try {
            Hexadecimal hexadecimal = new Hexadecimal("1112Ah");
            System.out.println(hexadecimal);
            System.out.printf("Valor en decimal: %d%n", hexadecimal.calcularValorDecimal());
        } catch (NoHexadecimalException e) {
            System.err.println("No valor hexadecimal");
        }
    }
}
