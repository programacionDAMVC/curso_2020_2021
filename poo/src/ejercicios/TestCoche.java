package ejercicios;

public class TestCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        System.out.printf("Nuevo coche con %.2f litros de combustible y %.2f km que puede recorrer%n",
                coche1.getCantidadCombustible(),  coche1.calcularKmARecorrer());
        coche1.echarCombustible(5);

        Coche coche2 = new Coche();
        System.out.printf("Nuevo coche con %.2f litros de combustible y %.2f km que puede recorrer%n",
                coche2.getCantidadCombustible(),  coche2.calcularKmARecorrer());
        coche2.echarCombustible(5);

        System.out.printf("Coche1 con %.2f litros de combustible y %.2f km que puede recorrer%n",
                coche1.getCantidadCombustible(),  coche1.calcularKmARecorrer());
        System.out.printf("Coche2 con %.2f litros de combustible y %.2f km que puede recorrer%n",
                coche2.getCantidadCombustible(),  coche2.calcularKmARecorrer());

    }
}
