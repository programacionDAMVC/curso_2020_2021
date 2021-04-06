package teoria.interfaces.comparacion;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private LocalDate fechaNacimiento;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;

    public Persona(LocalDate fechaNacimiento, String nombre, String apellido1, String apellido2, String dni) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%S,%d", apellido1,apellido2,nombre,dni, calcularEdad());
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni.equalsIgnoreCase(persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
    //orden comparación es apellido1, luego apellido2 y luego nombre
    @Override
    public int compareTo(Persona persona) {
        if (this.apellido1.compareTo(persona.apellido1) != 0)
            return  this.apellido1.compareTo(persona.apellido1);
        if (this.apellido2.compareTo(persona.apellido2) != 0)
         return this.apellido2.compareTo(persona.apellido2);
        return  this.nombre.compareTo(persona.nombre);
    }
}
