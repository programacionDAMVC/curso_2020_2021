package teoria;

//ejemplo de sobrecarga de métodos porque tienen todos el mismo nombre, pero argumentos distinto
//ejemplo también de lista dinámica
public class ListaDinamica {
    public static void main(String... args) {
        int numero1 = 1, numero2 = 2, numero3 = 3, numero4 = 4, numero5 = 5;
        System.out.printf("La suma de valores vale %d%n", sumaValores(numero1, numero2));
        System.out.printf("La suma de valores vale %d%n", sumaValores(numero1, numero2, numero3));
        System.out.printf("La suma de valores vale %d%n", sumaValores(1.0 * numero1, numero2));
        System.out.printf("La suma de valores vale %d%n", sumaValores(numero1, numero2, numero3, numero4));
        System.out.printf("La suma de valores vale %d%n", sumaValores(numero1, numero2, numero3, numero4, numero5));
    }

  public static int sumaValores(int valor1, int valor2) {
        System.out.println("Método 1");
        return valor1 + valor2;
    }

    public static int sumaValores(double valor1, double valor2) {
        System.out.println("Método 2");
        return (int) (valor1 + valor2);
    }

    public static int sumaValores(int valor1, int valor2, int valor3) {
        System.out.println("Método 3");
        return valor1 + valor2 + valor3;
    }

    public static int sumaValores(int... valores) {
        System.out.println("Método 4");
        int suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        return suma;
    }

}
