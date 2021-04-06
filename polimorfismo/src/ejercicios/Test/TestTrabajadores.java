package ejercicios.Test;

import ejercicios.ejercicio1.*;

public class TestTrabajadores {
    public static void main(String[] args) {
        /*//crear cuatro trabajadores, dos oficiales y dos técnicos
        Trabajador trabajador1 = new Oficial("luisa", "perales ruíz", Grado.PRIMERA);
        Trabajador trabajador2 = new Oficial("manuel", "pérez ruíz", Grado.SEGUNDA);
        Trabajador trabajador3 = new Tecnico("alberto", "menéndez ruíz", Titulacion.CICLO_FORMATIVO);
        Trabajador trabajador4 = new Tecnico("rocío", "cánovas ruíz", Titulacion.MEDIO);
        //crear una array de objetos Trabajador de tamaño 4
        Trabajador[] trabajadores = new Trabajador[4];
        trabajadores[0] = trabajador1;
        trabajadores[1] = trabajador2;
        trabajadores[2] = trabajador3;
        trabajadores[3] = trabajador4;
        //recorrer array para mostrar nombre completo titulacion/grado sueldo mensual
        for (Trabajador trabajador: trabajadores) {
            if (trabajador instanceof Tecnico) {
                Tecnico tecnico = (Tecnico) trabajador;
                System.out.printf("%-35s%-20s%-10.2f%n", tecnico.obtenerNombreCompleto(),
                        tecnico.getTitulacion(), tecnico.obtenerSueldoMensual(20));
            }
            else {
                Oficial oficial = (Oficial) trabajador;
                System.out.printf("%-35s%-20s%-20.2f%n", oficial.obtenerNombreCompleto(),
                        oficial.getClase(), oficial.obtenerSueldoMensual(20));
            }

        }
*/
        /*//crear cuatro trabajadores, dos oficiales y dos técnicos
        Oficial trabajador1 = new Oficial("luisa", "perales ruíz", Grado.PRIMERA);
        Oficial trabajador2 = new Oficial("manuel", "pérez ruíz", Grado.SEGUNDA);
        Tecnico trabajador3 = new Tecnico("alberto", "menéndez ruíz", Titulacion.CICLO_FORMATIVO);
        Tecnico trabajador4 = new Tecnico("rocío", "cánovas ruíz", Titulacion.MEDIO);
        //crear una array de objetos Trabajador de tamaño 4
        Trabajador[] trabajadores = new Trabajador[4];
        trabajadores[0] = trabajador1;
        trabajadores[1] = trabajador2;
        trabajadores[2] = trabajador3;
        trabajadores[3] = trabajador4;
        //recorrer array para mostrar nombre completo titulacion/grado sueldo mensual
        for (Trabajador trabajador: trabajadores) {
            if (trabajador instanceof Tecnico) {
                Tecnico tecnico = (Tecnico) trabajador;
                System.out.printf("%-35s%-20s%-10.2f%n", tecnico.obtenerNombreCompleto(),
                        tecnico.getTitulacion(), tecnico.obtenerSueldoMensual(20));
            }
            else {
                Oficial oficial = (Oficial) trabajador;
                System.out.printf("%-35s%-20s%-20.2f%n", oficial.obtenerNombreCompleto(),
                        oficial.getClase(), oficial.obtenerSueldoMensual(20));
            }

        }*/

        //crear cuatro trabajadores, dos oficiales y dos técnicos
        //crear una array de objetos Trabajador de tamaño 4
        Trabajador[] trabajadores = {new Oficial("luisa", "perales ruíz", Grado.PRIMERA),
                new Oficial("manuel", "pérez ruíz", Grado.SEGUNDA),
                new Tecnico("alberto", "menéndez ruíz", Titulacion.CICLO_FORMATIVO),
                new Tecnico("rocío", "cánovas ruíz", Titulacion.MEDIO)
        };

        //recorrer array para mostrar nombre completo titulacion/grado sueldo mensual
        for (Trabajador trabajador: trabajadores) {
            if (trabajador instanceof Tecnico) {
                Tecnico tecnico = (Tecnico) trabajador;
                System.out.printf("%-35s%-20s%-10.2f%n", tecnico.obtenerNombreCompleto(),
                        tecnico.getTitulacion(), tecnico.obtenerSueldoMensual(20));
            }
            else {
                Oficial oficial = (Oficial) trabajador;
                System.out.printf("%-35s%-20s%-20.2f%n", oficial.obtenerNombreCompleto(),
                        oficial.getClase(), oficial.obtenerSueldoMensual(20));
            }

        }
       // Trabajador t =  new Trabajador("luis", "pedro"); no se puede hacer
    }
}
