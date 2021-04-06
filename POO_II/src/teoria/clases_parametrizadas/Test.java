package teoria.clases_parametrizadas;

public class Test {
    public static void main(String[] args) {

        ClaseParametrizada<String> claseParametrizada1 = new ClaseParametrizada<>();
        claseParametrizada1.insertarElemento("hola");
        claseParametrizada1.insertarElemento(" ");
        claseParametrizada1.insertarElemento("mundo");
        System.out.printf("Contenido de la lista de String: %n%s%n", claseParametrizada1.getLista());

        ClaseParametrizada<Persona> claseParametrizada2 = new ClaseParametrizada<>();
        claseParametrizada2.insertarElemento(new Persona("federico", 34));
        claseParametrizada2.insertarElemento(new Persona("Luisa", 45));
        System.out.printf("Contenido de la lista de Persona: %n%s%n", claseParametrizada2.getLista());

        ClaseParametrizada<Double> claseParametrizada3 = new ClaseParametrizada<>();
        claseParametrizada3.insertarElemento(3.3);
        claseParametrizada3.insertarElemento(-5e23);
        System.out.printf("Contenido de la lista de Persona: %n%s%n", claseParametrizada3.getLista());

    }
}
