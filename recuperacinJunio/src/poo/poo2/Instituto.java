package poo.poo2;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombreInstituto;
    private List<Persona> personal = new ArrayList<>(); //agregación está en la colección

    public Instituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public Instituto(String nombreInstituto, List<Persona> personal) {
        this.nombreInstituto = nombreInstituto;
        this.personal = personal;
    }

    //método para añadir un profesor o un alumno
    public boolean annadirPersonal (Persona persona) {
        return personal.add(persona);
    }

    //método para eliminar un profesor o un alumno
    public boolean eliminarPersonal (String dni) {
        if (! Persona.validadDNI(dni)) {
            System.out.printf("%S dni no válido%", dni);
            return false;
        }
        for (Persona persona: personal) {
            if (persona.getDni().equalsIgnoreCase(dni)) {
                personal.remove(persona);
                return true;
            }
        }
        return false;
    }
    //método que devuelva el número de profesores

    //idem con alumnos

    //método que devuelva una colección de profesores

    //método que devuelva una colección de alumnos menores de edad
}
