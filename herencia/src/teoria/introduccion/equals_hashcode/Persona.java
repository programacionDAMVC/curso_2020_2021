package teoria.introduccion.equals_hashcode;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {

    private String nombrePersonaCompleto;
    private String dni; //elemento diferenciador
    private LocalDate fechaNacimiento;

    public Persona(String nombrePersonaCompleto, String dni, LocalDate fechaNacimiento) {
        this.nombrePersonaCompleto = nombrePersonaCompleto;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombrePersonaCompleto() {
        return nombrePersonaCompleto;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", dni, nombrePersonaCompleto, fechaNacimiento);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return dni != null ? dni.equals(persona.dni) : persona.dni == null;
    }

    @Override
    public int hashCode() {
        return dni != null ? dni.hashCode() : 0;
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return dni.equals(persona.dni);

    }

    @Override
    public int hashCode() {
        return 0;
    }*/

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni.equals(persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        return fechaNacimiento != null ? fechaNacimiento.equals(persona.fechaNacimiento) : persona.fechaNacimiento == null;
    }

    @Override
    public int hashCode() {
        int result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        return result;
    }*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni) &&
                Objects.equals(fechaNacimiento, persona.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, fechaNacimiento);
    }
}


