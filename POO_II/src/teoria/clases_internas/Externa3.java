package teoria.clases_internas;

public class Externa3 {

    private String atributo = "hola";
    private static String estatico = "hello";

    public class Interna3 {
        private int valor;
        public Interna3(int valor) {
            this.valor = valor;
        }
        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }
    }
    @Override
    public String toString() {
        return String.format("ATRIBUTO: %s, ESTÁTICO %s", atributo, estatico);
    }
}
