package poo.test;

import poo.poo2.Persona;
import poo.poo2.excepciones.DNIException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestPersona {
    public static void main(String[] args) {
        //crear una lista dinámica de objetos persona
        List<Persona> listaPersonas = new ArrayList<>();
       /* //añadimos 4 personas
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

        String[] dnisAValidar = new String[]{ "12345678a", "12345678z","12345678", "123a",
                "123456789a", "123456789", "12345678ab", "12345678ñ", "11111111H"};

        for (int i = 0; i < dnisAValidar.length; i++) {
            if (Persona.validarFormatoDNI(dnisAValidar[i]))
                System.out.printf("DNI válido %s%n", dnisAValidar[i]);
        }
        for (String dni: dnisAValidar ){
            if (Persona.validadDNI(dni))
                System.err.printf("dni %s es correcto%n", dni);
        }
*/
       Persona persona1 = new Persona();
       persona1.setNombreCompletoPersona("jacinto guerreo gómez");
       persona1.setFechaNacimiento(LocalDate.of(2010,10,10));
       String dni1 = "123456781";
       try {
           persona1.setDni(dni1);
           listaPersonas.add(persona1);
       //    listaPersonas.add(new Persona("rocío martínez bellavista", "11111111h",
       //            LocalDate.of(2000, 12, 31)));

       } catch (DNIException e) {
           System.err.printf("el dni %s %s%n", dni1, e.getMessage());
       }
        try {
            listaPersonas.add(new Persona("rocío martínez bellavista", "11111111h",
                    LocalDate.of(2000, 12, 31)));
        } catch (DNIException e) {
            e.printStackTrace();
        }
        try {
            Persona persona2 = new Persona("isabel fernández álvares", "12345678Z",
                    LocalDate.of(2001, 1, 1));
            listaPersonas.add(persona2);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        System.out.println(listaPersonas);
    }
}
