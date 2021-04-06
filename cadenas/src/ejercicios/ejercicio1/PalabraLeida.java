package ejercicios.ejercicio1;

/**
 * Clase para analizar un atributo cadena
 */
public class PalabraLeida {
    //atributo que nos pide el ejercicio
    private String valor;

    /**
     * Constructor
     * @param valor inicializando el atributo
     */
    public PalabraLeida(String valor) {
        this.valor = valor;
    }

    /**
     * getter
     * @return el atributo cadena
     */
    public String getValor() {
        return valor;
    }

    /**
     * toString sobreescrito
     * @return representacion en cadena del objeto
     */
    @Override
    public String toString() {
        return String.format("Contenido del atributo: %s", valor);
    }

    /**
     *
     * @return el número de caracteres del atributo
     */
    public int obtenerNumeroDeCaracteres() {
        return valor.length();
    }

    /**
     * * @return el número de letras del atributo
     */
    public int obtenerNumeroDeLetras() {
        int contador = 0;
        for (int i = 0; i < valor.length(); i++) {
            if (Character.isLetter(valor.charAt(i)))
                contador++;
        }
        return contador;
    }

    /**
     *
     * @return true y solo true si el atributo empieza por vocal
     * se tiene en cuenta las vocales acentuadas
     */
    public boolean empiezaPorVocal() {
        return valor.toLowerCase().matches("^[aeiouáéíóú].*$");  //^ significa empieza en
    }

    /**
     * @return true y solo true si el atributo acaba por vocal
     * se tiene en cuenta las vocales acentuadas
     */
    public boolean acabaEnPorVocal() {
        return valor.toLowerCase().matches("^.*[aeiouáéíóú]$"); //$ significa acaba en
    }

    /**
     *
     * @return nº de vocales que tiene el atributo
     * se tiene en cuenta las vocales acentuadas
     */
    public int obtenerNumeroDeVocales() {
        int contador = 0;
        for (int i = 0; i < valor.length(); i++) {
            if (("" + valor.toLowerCase().charAt(i)).matches("[aeiouáéíóú]"))
                contador++;
        }
        return contador;
    }

    /**
     *
     * @param letra a comparar, tipo char
     * @return true si contiene la letra
     * se ignora minúsculas y mayúsculas en ambas
     */
    public boolean contieneLetra(char letra) {
        return valor.toLowerCase().contains((letra + "").toLowerCase());
    }

    /**
     *
     * @param palabraComparacion palabra a comparar
     * @return true si el igual el atributo que la palabra a comparar
     * se ignora minúsculas y mayúsculas en ambas
     */
    public boolean sonIguales(String palabraComparacion) {
      //  return valor.toLowerCase() == palabraComparacion.toLowerCase(); mal, comporamos referencias
        return valor.equalsIgnoreCase(palabraComparacion);
    }

    /**
     *
     * @return true si el atributo es un palíndromo
     */
    public boolean esPalindromo () {
      /*  StringBuilder stringBuilder = new StringBuilder(valor);
        stringBuilder.reverse(); //es mutable, quien cambia es stringBuider
        return valor.equalsIgnoreCase(stringBuilder.toString());*/
      return valor.equalsIgnoreCase(new StringBuilder(valor).reverse().toString());
     //   return this.sonIguales(new StringBuilder(valor).reverse().toString());
    }



}
