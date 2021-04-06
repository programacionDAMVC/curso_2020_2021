package ejercicios.ejercicio2;

import java.util.List;

public class Binaria {
    //atributos
    private String valor;

    //constructor
    public Binaria(String valor) throws NoBinarioException {
        //si no es un valor en binario lanzamos la excepción NoBinarioException
        if ( ! valor.matches("[01]+") )
            throw new NoBinarioException();
        this.valor = valor;
    }

    //método que devuelva el valor en decimal
    // 1011  1 * 2^0 + 1 * 2^1 + 0 * 2^2 + 1 * 2^3
    public int calcularValorDecimal() {
        /*int decimal = 0;
        StringBuilder stringBuilder = new StringBuilder(valor);
        String valorAlReves = stringBuilder.reverse().toString();
        for (int i = 0; i < valorAlReves.length(); i++) {
  //          decimal += Math.pow(2, i) * Integer.parseInt(valorAlReves.charAt(i) + "");
            decimal += Math.pow(2, i) * (valorAlReves.charAt(i) - 48);

        }
        return decimal;*/
        return Integer.parseInt(valor, 2);
    }
    public static int calcularSumaListaValores (List<Binaria> lista) {
        int suma = 0;
        for (Binaria numero: lista) {
            suma += numero.calcularValorDecimal();
        }
        return suma;
    }
    //toString
    @Override
    public String toString() {
        return String.format("Valor en binario: %s", valor);
    }
}
