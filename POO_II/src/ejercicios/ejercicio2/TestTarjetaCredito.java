package ejercicios.ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class TestTarjetaCredito {
    public static void main(String[] args) {
       // System.out.println(generarNumeroCuentaAleatorio());
        TarjetaCredito tarjetaCredito1 = new TarjetaCredito("juanito pérez", "123456");
        mostrarDatosTarjeta(tarjetaCredito1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce titular de la cuenta: ");

        String titular = scanner.nextLine();

        System.out.println("Introduce número de cuenta");
        String cuenta = scanner.nextLine();
        TarjetaCredito tarjetaCredito2 = new TarjetaCredito(titular, cuenta);
        mostrarDatosTarjeta(tarjetaCredito2);

        System.out.println("Introduce titular de la cuenta: ");
        titular = scanner.nextLine();
        TarjetaCredito tarjetaCredito3 = new TarjetaCredito(titular, generarNumeroCuentaAleatorio());
        mostrarDatosTarjeta(tarjetaCredito3);

        System.out.println("Introduce titular de la cuenta: ");
        titular = scanner.nextLine();
        System.out.println("Introduce número de cuenta sin DC");
        String cuentaSinDC = scanner.nextLine();
        String cuentaConDC = cuentaSinDC + TarjetaCredito.Helper.calcularDigitoControl(cuentaSinDC);
        TarjetaCredito tarjetaCredito4 = new TarjetaCredito(titular,cuentaConDC );
        mostrarDatosTarjeta(tarjetaCredito4);
    }

    private static void mostrarDatosTarjeta(TarjetaCredito tarjetaCredito1) {
        System.out.println(tarjetaCredito1);
        System.out.printf("¿Válida la tarjeta? %B%n",
                TarjetaCredito.validarNumeroTarjeta(tarjetaCredito1.getNumeroTarjeta()));
    }
    private static String generarNumeroCuentaAleatorio () {
       /* String numero = "";
        for (int i = 0; i < 16; i++) {
            numero += new Random().nextInt(10);
            //numero += (int) (Math.random() * 10);
        }*/
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 16; i++)
            stringBuilder.append( new Random().nextInt(10));

        return stringBuilder.toString();
    }

}
