package poo.test;

import poo.poo2.Curso;
import poo.poo2.Estudiante;
import poo.poo2.Persona;
import poo.poo2.excepciones.DNIException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestEstudianteyProfesor {
    public static void main(String[] args) {
        List<Persona> listaEstudiantes = new ArrayList<>();
        try {
            Estudiante estudiante1 = new Estudiante("joaquin zafra carrillo", "12345678z",
                    LocalDate.of(2000,10,1), Curso.PRIMERO_DAM);
            listaEstudiantes.add(estudiante1);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        Estudiante estudiante2 = new Estudiante(Curso.SEGUNDO_DAM);
        estudiante2.setNombreCompletoPersona("elisa gutierrez carmona");
        estudiante2.setFechaNacimiento(LocalDate.of(1998, 1, 1));
        try {
            estudiante2.setDni("11111111h");
            listaEstudiantes.add(estudiante2);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        try {
            Persona estudiante3 = new Estudiante("ramón castro pérez", "12345678z", LocalDate.of(1998, 2, 28),
                    Curso.SEGUNDO_DAM);
            listaEstudiantes.add(estudiante3);
        } catch (DNIException e) {
            e.printStackTrace();
        }

        //recorremos la lista y mostramos los dni de los tres estudiantes:
        for (Persona persona: listaEstudiantes) {
            System.out.printf("DNI: %S%n", persona.getDni());
            System.out.printf("Nombe completo: %S%n", persona.getNombreCompletoPersona());
            System.out.printf("Fecha nacimiento: %d/%d/%d%n", persona.getFechaNacimiento().getDayOfMonth(),
                    persona.getFechaNacimiento().getMonthValue(), persona.getFechaNacimiento().getYear());
            System.out.printf("Curso: %S%n", ( (Estudiante) persona).getCurso());
        }

        //llamar al método toString
        for (Persona persona: listaEstudiantes) {
            System.out.println(persona);
        }


    }
}
