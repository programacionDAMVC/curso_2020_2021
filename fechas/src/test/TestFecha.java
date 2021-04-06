package test;

import java.time.LocalDate;
import java.util.Scanner;

import static fechas.Fecha.*;

public class TestFecha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduce tu día de nacimiento");
        int diaNacimiento = in.nextInt();
        System.out.println("introduce tu mes de nacimiento");
        int mesNacimiento = in.nextInt();
        System.out.println("introduce tu año de nacimiento");
        int annoNacimiento = in.nextInt();
        in.close();
        LocalDate fechaNacimiento = crearFecha(diaNacimiento, mesNacimiento, annoNacimiento);
        LocalDate fechaActual = obtenerFechaActual();
        System.out.printf("Fecha de nacimiento %s%n", formetearFechaEspannol(fechaNacimiento));
        System.out.printf("Fecha actual %s%n", formatearFechasCastellano(fechaActual));
        System.out.printf("Años trancurridos desde fecha nacimiento hasta hoy %d%n",
                calcularAnnosTranscurridos(fechaNacimiento, fechaActual));
    }
}
