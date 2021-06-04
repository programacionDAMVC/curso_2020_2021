package poo.test;

import poo.poo2.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestPersona {
    public static void main(String[] args) {
        //crear una lista dinámica de objetos persona
        List<Persona> listaPersonas = new ArrayList<>();
        //añadimos 4 personas
        Persona persona1 = new Persona("juan garcía lomas", "12345678a", LocalDate.of(2000,11,11));
        Persona persona2 = new Persona("juani garcía pérez", "22345678a", LocalDate.of(2000,12,11));
        Persona persona3 = new Persona("", "", LocalDate.of(2001, 1,1));
        persona3.setNombreCompletoPersona("esteban colmenero millán");
        persona3.setDni("3264578d");
        Persona persona4 = new Persona();
        persona4.setNombreCompletoPersona("estíbaliz cordan camino");
        persona4.setDni("12345678g");
        persona4.setFechaNacimiento(LocalDate.of(2015, 4,5));
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona4);
        listaPersonas.add(persona3);
        //recorrer con foreach la lista y llamar a toString y a es mayorEdad()
        for (Persona persona: listaPersonas) {
            System.out.printf("%s - ¿mayor de edad? %b%n", persona, persona.esMayorEdad());
        }
    }
}
