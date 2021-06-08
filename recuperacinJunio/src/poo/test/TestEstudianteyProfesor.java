package poo.test;

import poo.poo2.Curso;
import poo.poo2.Estudiante;
import poo.poo2.Persona;
import poo.poo2.Profesor;
import poo.poo2.excepciones.DNIException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestEstudianteyProfesor {
    public static void main(String[] args) {
        List<Persona> listaEstudiantesYProfesores = new ArrayList<>();
        try {
            Estudiante estudiante1 = new Estudiante("joaquin zafra carrillo", "12345678z",
                    LocalDate.of(2000,10,1), Curso.PRIMERO_DAM);
            listaEstudiantesYProfesores.add(estudiante1);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        Estudiante estudiante2 = new Estudiante(Curso.SEGUNDO_DAM);
        estudiante2.setNombreCompletoPersona("elisa gutierrez carmona");
        estudiante2.setFechaNacimiento(LocalDate.of(1998, 1, 1));
        try {
            estudiante2.setDni("11111111h");
            listaEstudiantesYProfesores.add(estudiante2);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        try {
            Persona estudiante3 = new Estudiante("ramón castro pérez", "12345678z", LocalDate.of(1998, 2, 28),
                    Curso.SEGUNDO_DAM);
            listaEstudiantesYProfesores.add(estudiante3);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        try {
            Profesor profesor1 = new Profesor("javier infantes caballero", "12345678Z",
                    LocalDate.of(1980, 11, 11), LocalDate.of(2000,1, 22));
            listaEstudiantesYProfesores.add(profesor1);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        Persona profesor2 = new Profesor(LocalDate.of(2010, 5, 7));
        profesor2.setNombreCompletoPersona("agustina campos martínez");
        profesor2.setFechaNacimiento(LocalDate.of(2001, 7, 8));
        try {
            profesor2.setDni("11111111h");
            listaEstudiantesYProfesores.add(profesor2);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        //recorremos la lista y mostramos los dni de los tres estudiantes:
        for (Persona persona: listaEstudiantesYProfesores) {
            System.out.printf("DNI: %S%n", persona.getDni());
            System.out.printf("Nombe completo: %S%n", persona.getNombreCompletoPersona());
            System.out.printf("Fecha nacimiento: %d/%d/%d%n", persona.getFechaNacimiento().getDayOfMonth(),
                    persona.getFechaNacimiento().getMonthValue(), persona.getFechaNacimiento().getYear());
            if (persona instanceof Estudiante)
                System.out.printf("Curso: %S%n", ( (Estudiante) persona).getCurso());
            else
                System.out.printf("Años trabajados: %d%n", ((Profesor) persona).calcularAnnosTrabajados() );
        }

        //llamar al método toString
        for (Persona persona: listaEstudiantesYProfesores) {
            System.out.println(persona);
        }


    }
}
