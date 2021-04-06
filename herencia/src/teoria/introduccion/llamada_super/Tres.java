package teoria.introduccion.llamada_super;

public class Tres extends Dos {
    public Tres(){
       System.out.println("creando un objeto de la clase 3");
    }
    public static void main(String[] args) {
        new Tres();
    }
}
