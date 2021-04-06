package teoria;

public class TestConstructores {
    public static void main(String[] args) {
        Constructores constructores1 = new Constructores();
        System.out.printf("Valor del atributo %s%n", constructores1.getAtributo());
        constructores1.setAtributo("hola");
        System.out.printf("Valor del atributo %s%n", constructores1.getAtributo());

        Constructores constructores2 = new Constructores("adios");
        System.out.printf("Valor del atributo %s%n", constructores2.getAtributo());

        Constructores constructores3  = new Constructores("hello", true);
        System.out.printf("Valor del atributo %s%n", constructores3.getAtributo());
        Constructores constructores4 = new Constructores("Bye", false);
        System.out.printf("Valor del atributo %s%n", constructores4.getAtributo());



    }
}
