package teoria.listas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Personas {
    public static void main(String[] args) {
        List<Persona> personaList = new ArrayList<>();
        personaList.add(new Persona("juan", LocalDate.of(2000, 12, 1)));
        personaList.add(new Persona("juani", LocalDate.of(2015, 12, 1)));
        personaList.add(new Persona("felipe", LocalDate.of(2005, 12, 1)));
        personaList.add(new Persona("araceli", LocalDate.of(2007, 12, 1)));
        //quiero a juan
        System.out.println(personaList.get(0));
        System.out.println("Mayores de edad:");
        for (Persona p : personaList) {
            if (p.esMayorEdad())
                System.out.println(p);
        }
    }
}
