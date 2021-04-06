package ejercicios.ejercicio2;

import java.util.List;

public class Hexadecimal {
    private String valor;

    public Hexadecimal(String valor) throws NoHexadecimalException {
        //si no matches con formato hexadecimal  012..9abcdef
        if (! valor.toLowerCase().matches("[0-9a-f]+"))
             throw new NoHexadecimalException();
        //sino
        this.valor = valor;
    }

    public long calcularValorDecimal() {
        return Long.parseLong(valor, 16);
    }

    public static long calcularSumaListaValores (List<Hexadecimal> lista) {
        long suma = 0;
        for (Hexadecimal numero: lista) {
            suma += numero.calcularValorDecimal();
        }
        return suma;
    }

    @Override
    public String toString() {
        return String.format("Valor en hexadecimal: %s", valor);
    }
}
