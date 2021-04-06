package teoria.introduccion.llamada_super;

public class Dos extends Uno {
    private int valor = 8;
    public Dos () {
        this(15);
       // this(10);
    }

    public Dos(int valor) {
        this.valor = valor;
        System.out.println("Creando objeto de la clase Dos, inicializando valor de atributo a 10");
    }


}
