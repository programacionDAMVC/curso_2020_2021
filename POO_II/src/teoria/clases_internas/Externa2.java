package teoria.clases_internas;

public class Externa2 {
    private String atributo = "hola";
    private static String estatico = "hello";

    public static class Interna2 {
        private static int valor = 1;

        public static int getValor() {
            return valor;
        }
    }

    @Override
    public String toString() {
        return String.format("ATRIBUTO: %s, ESTÁTICO %s, INTERNO %s", atributo, estatico, Interna2.getValor());
    }
}
