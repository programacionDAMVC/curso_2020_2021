package ejercicios.ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Auxiliar {

    public static int calcularTrienios (LocalDate fecha) {
        Period period = Period.between(fecha, LocalDate.now());
        int annos = period.getYears();
        int trienios = annos / 3;
        return trienios;
    }
    public static LocalDate formatearFecha (String fecha) {
        //   mes/dia/año
        String[] linea = fecha.split("/"); //[mes, dia, año]
        String sDia =  linea[1];
        String sMes =  linea[0];
        String sAnno = linea[2];
        int iDia  = Integer.parseInt(sDia);
        int iMes  = Integer.parseInt(sMes);
        int iAnno = Integer.parseInt(sAnno);
        return LocalDate.of(iAnno, iMes, iDia);
    }
    public static Profesor.Materia obtenerMateria (String linea) {
        /*SISTEMAS_INFORMATICOS, ENTORNOS_DE_DESARROLLO, LENGUAJES_DE_MARCAS,
        PROGRAMACION, EMPRESAS, BASE_DE_DATOS*/
        switch (linea) {
            case "SISTEMAS INFORMATICOS" :
                return Profesor.Materia.SISTEMAS_INFORMATICOS;
            case "ENTORNOS DE DESARROLLO" :
                return Profesor.Materia.ENTORNOS_DE_DESARROLLO;
            case "LENGUAJES DE MARCAS" :
                return Profesor.Materia.LENGUAJES_DE_MARCAS;
            case "PROGRAMACION":
                return Profesor.Materia.PROGRAMACION;
            case "EMPRESAS":
                return Profesor.Materia.EMPRESAS;
            case "BASE DE DATOS":
                return Profesor.Materia.BASE_DE_DATOS;
            default:
                return null;
        }

    }

    public static boolean validarDNI(String dni) {
        return dni.matches("^[0-9]{8}[a-zA-Z]$");
    }
}
