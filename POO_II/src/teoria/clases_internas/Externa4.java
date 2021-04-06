package teoria.clases_internas;

public class Externa4 {
    private String atributo = "hola";
    private static String estatico = "hello";

    public void mutador (int modificador) {
        int valor = 4;
        class Interna4 {
            private int modificador;

            public Interna4(int modificador) {
                this.modificador = modificador;
            }
            public void cambiarAtributo () {
                atributo += modificador;
            }
        }
        Interna4 interna4 = new Interna4(modificador);
        interna4.cambiarAtributo();

    }

    @Override
    public String toString() {
        return String.format("ATRIBUTO: %s, ESTÁTICO %s", atributo, estatico);
    }
}
