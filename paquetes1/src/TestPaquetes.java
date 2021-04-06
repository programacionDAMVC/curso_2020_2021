import ejercicios.com.iesvirgedelcarmen.matematicas.estaticos.Geometria;
import ejercicios.com.iesvirgedelcarmen.matematicas.poo.Cuadrado;
import ejercicios.com.iesvirgedelcarmen.matematicas.poo.Rectangulo;
import ejercicios.com.iesvirgedelcarmen.matematicas.poo.TrianguloRectangulo;

public class TestPaquetes {

    public static void main(String[] args) {
        double lado = 2.0;
        System.out.printf("Área pentágono regular %.2f vale %.2f%n",
                lado, Geometria.calcularAreaPentagonoRegular(lado));
        System.out.printf("Área hexágono regular %.2f vale %.2f%n",
                lado, Geometria.calcularAreaHexagonoRegular(lado));

        TrianguloRectangulo t = new TrianguloRectangulo(1, 2);
        Cuadrado c            = new Cuadrado(2.2);
        Rectangulo r          = new Rectangulo(2.1, 1.1);

        System.out.println(t);
        System.out.println(c);
        System.out.println(r);
    }
}
