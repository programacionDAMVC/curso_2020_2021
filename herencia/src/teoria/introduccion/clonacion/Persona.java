package teoria.introduccion.clonacion;

import java.util.Objects;

public class Persona implements Cloneable{
    private String nombrePersona;
    private int edad;

    public Persona(String nombrePersona, int edad) {
        this.nombrePersona = nombrePersona;
        this.edad = edad;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", nombrePersona, edad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad &&
                Objects.equals(nombrePersona, persona.nombrePersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombrePersona, edad);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Persona persona1 = new Persona("juan", 23);
        Persona persona2 = persona1;
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona1 == persona2);
        System.out.println(persona1.equals(persona2));
        System.out.println("----------------------");
        Persona persona3 = new Persona("juan", 23);
        System.out.println(persona3);
        System.out.println(persona1 == persona3);
        System.out.println(persona1.equals(persona3));
        System.out.println("----------------------");
        persona2.setEdad(50);
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println("----------------");
        Persona persona4 = new Persona("marisa", 45);
        Persona persona5 = persona4;
        Persona personaClone = (Persona) persona4.clone();
        persona5.setEdad(35);
        System.out.println(persona4);
        System.out.println(persona5);
        System.out.println(personaClone);
    }
}
