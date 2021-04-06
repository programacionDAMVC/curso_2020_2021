package teoria.clases_internas;

public class TestClasesInternas {
    public static void main(String[] args) {
       /* Externa1 externa1 = new Externa1();
        System.out.println(externa1);
        externa1.modificadorInstancia();
        System.out.println(externa1);
        Externa1.modificadorClase();
        System.out.println(externa1);
       Externa2 externa2 = new Externa2();
        System.out.println(externa2);
        System.out.printf("Valor de la variable de clase interna %d%n", Externa2.Interna2.getValor());
       Externa3 externa3 = new Externa3();
        System.out.println(externa3.toString());
        Externa3.Interna3 interna3 = externa3.new Interna3(6);
        System.out.printf("Valor del atributo interno: %d%n", interna3.getValor());
        interna3.setValor(12);
        System.out.printf("Valor del atributo interno: %d%n", interna3.getValor());*/
       Externa4 externa4 = new Externa4();
        System.out.println(externa4);

        externa4.mutador(5);
        System.out.println(externa4);

    }
}
