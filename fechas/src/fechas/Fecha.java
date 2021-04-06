package fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fecha {

    public static DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-LL-yy");

    public static LocalDate crearFecha (int dia, int mes, int anno) {
        return LocalDate.of(anno, mes, dia);
    }
    public static LocalDate obtenerFechaActual () {
        return LocalDate.now();
    }
    public static String formetearFechaEspannol (LocalDate fecha) { //    dd/mm/yyyy
        return String.format("%d/%d/%d", fecha.getDayOfMonth(), fecha.getMonthValue(), fecha.getYear());
    }
    public static String formatearFechasCastellano (LocalDate fecha) {
        return fecha.format(fechaFormateada).toString();
    }
    public static int calcularAnnosTranscurridos (LocalDate fecha1, LocalDate fecha2) {
        Period period = Period.between(fecha1, fecha2);
        return period.getYears();
    }

//    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(formetearFechaEspannol(LocalDate.now()));
//        System.out.println(formatearFechasCastellano(LocalDate.now()));
//    }

}
