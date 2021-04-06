package teoria.introduccion;

public class Clase2 {
    public static void main(String[] args) {
        int numero = -1;
        if (args.length > 0 && args[0].matches("[0-9]+"))
            numero = Integer.parseInt(args[0]);
        if (numero < 0)
            System.out.println("número no inicializado");
        else
            System.out.printf("Valor de número %d%n", numero);
    }
}
