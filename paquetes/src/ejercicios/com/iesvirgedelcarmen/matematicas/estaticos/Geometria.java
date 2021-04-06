package ejercicios.com.iesvirgedelcarmen.matematicas.estaticos;

public class Geometria {
    public static double calcularAreaPentagonoRegular (double lado) {
        return 1.72 * lado * lado;
    }
    public static double calcularAreaHexagonoRegular (double lado) {
        return 2.6 * lado * lado;
    }

//    public static void main(String[] args) {
//        double lado = 2.0;
//        System.out.printf("Área pentágono regular %.2f vale %.2f%n",
//                lado, Geometria.calcularAreaPentagonoRegular(lado));
//        System.out.printf("Área hexágono regular %.2f vale %.2f%n",
//                lado, calcularAreaHexagonoRegular(lado));
//    }
}
