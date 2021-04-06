package segundaEvaluacion.examen1A.test;

import segundaEvaluacion.examen1A.clases_bases.Alumno;
import segundaEvaluacion.examen1A.clases_bases.Profesor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Profesor> listaProfesores = new ArrayList<>();
        Alumno[] alumnos = new Alumno[3];
        do {
            System.out.println("introduce nombre profesor");
            String nombreProfesor = sc.nextLine();
            System.out.println("introduce apellidos profesor");
            String apellidosProfesor = sc.nextLine();
            boolean bPractico = false;
            System.out.println("1: PRÁCTICO\n2: TEORÍA (defecto)");
            System.out.println("introduce opción");
            String sPractico = sc.nextLine();
            if (sPractico.equals("1"))
                bPractico = true;
            String codigo;
            while (true) {
                System.out.println("introduce código");
                 codigo = sc.nextLine();
                if (Profesor.validarCodigoDocencia(codigo))
                    break;
            }
            Profesor profesor = new Profesor(nombreProfesor, apellidosProfesor, bPractico, codigo);
            listaProfesores.add(profesor);
        } while (listaProfesores.size() < 2);

        //System.out.println(listaProfesores);
        int contador = 0;
        while (contador < 3) {
            System.out.println("introduce nombre alumno");
            String nombreAlumno = sc.nextLine();
            System.out.println("introduce apellidos alumno");
            String apellidosAlumno = sc.nextLine();
            String sEdad;
            int iEdad;
            while (true) {
                System.out.println("Introduce edad comprendida entre 16 y 40, ambos inclusive");
                sEdad = sc.nextLine();
                if (! sEdad.matches("[0-9]{1,2}"))
                    continue;
                iEdad = Integer.parseInt(sEdad);
                if ( Alumno.validarEdad(iEdad))
                    break;
            }
            alumnos[contador] = new Alumno(nombreAlumno, apellidosAlumno, iEdad);
            contador++;
        }
        sc.close();
       // System.out.println(Arrays.toString(alumnos));
       // listaProfesores.forEach(System.out::println); una forma de hacerlo
       // listaProfesores.forEach(profesor -> System.out.println(profesor)); otra forma de hacerlo

        for (Profesor profesor: listaProfesores) {
            System.out.println(profesor);
        }
        int contadorAlumnosMayorEdad = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].esMayorEdad())
                contadorAlumnosMayorEdad++;
        }
        System.out.printf("%d alumnos mayores de edad", contadorAlumnosMayorEdad);
    }
}
