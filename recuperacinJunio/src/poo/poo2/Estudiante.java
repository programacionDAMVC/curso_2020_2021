package poo.poo2;

import poo.poo2.excepciones.DNIException;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private Curso curso;

    public Estudiante(String nombreCompletoPersona, String dni,
                      LocalDate fechaNacimiento, Curso curso) throws DNIException {
        super(nombreCompletoPersona, dni, fechaNacimiento);
        this.curso = curso;
    }

    public Estudiante(Curso curso) {
        this.curso = curso;
    }
}
