package teoria.com.iesvirgendelcarmen.fechas;

import java.time.LocalDate;
import java.time.Period;

public class Fechas1 {

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.printf("Fecha actual %s%n", fechaActual);
        LocalDate fechaNacimiento  =LocalDate.of(2000, 02, 29);
        System.out.printf("Fecha nacimiento %s%n", fechaNacimiento);
        mostrarAnnos(fechaNacimiento);
        System.out.printf("Años trancurridos desde %s hasta hoy son %d%n",
                fechaNacimiento, obtenerAnnos(fechaNacimiento) );
        System.out.printf("¿Es mayor de edad con esta fecha de nacimiento %s? %B%n",
                fechaNacimiento, esMayorEdad(fechaNacimiento));
        System.out.printf("¿Es mayor de edad con esta fecha de nacimiento %d/%d/%d? %B%n",
                fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(),
                fechaNacimiento.getYear(), esMayorEdad(fechaNacimiento));
    }

    public static void mostrarAnnos(LocalDate fecha){
        Period period = Period.between(fecha, LocalDate.now());
        int annos = period.getYears();
        System.out.printf("Años trancurridos desde %s hasta hoy son %d%n", fecha, annos );
    }
    public static int obtenerAnnos (LocalDate fecha) {
        Period period = Period.between(fecha, LocalDate.now());
        return period.getYears();
    }
    public static boolean esMayorEdad (LocalDate fecha) {
        Period period = Period.between(fecha, LocalDate.now());
        return period.getYears() >= 18;
    }
}
