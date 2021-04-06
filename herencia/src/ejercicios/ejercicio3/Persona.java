package ejercicios.ejercicio3;

import java.time.LocalDate;

public class Persona {

    private String dni;
    private String nombrePersona;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;

    public Persona(String dni, String nombrePersona, String apellido1, String apellido2, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombrePersona = nombrePersona;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //toString con formato apellido1, apellido2, nombre, dni, fecha_nacimiento*/

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s", apellido1, apellido2, nombrePersona,
                dni, fechaNacimiento);
    }
}
