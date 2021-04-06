package teoria;

public class TestCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(6.8f);

        System.out.printf("Círculo de radio %.2f%n", c1.getRadio());
        c1.setRadio(7.8f);
        System.out.printf("Círculo de radio %.2f, longitud %.2f y área %.2f%n",
                c1.getRadio(), c1.getLongitud(), c1.getArea());

        Circulo c2 = new Circulo(10);
        System.out.printf("Círculo de radio %.2f%n", c2.getRadio());
        System.out.printf("Círculo de radio %.2f, longitud %.2f y área %.2f%n",
                c2.getRadio(), c2.getLongitud(), c2.getArea());

    }
}
