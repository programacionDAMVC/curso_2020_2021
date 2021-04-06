package teoria.interfaces.comparacion;


import java.time.LocalDate;
import java.util.*;

public class Test {
    public static void main(String[] args) {
   //     List<Persona> conjuntoPersonas = new ArrayList<>();
        Set<Persona> conjuntoPersonas = new HashSet<>();
        LocalDate fechaBase = LocalDate.now(); //fecha base
        String dniBase = "12345678";
        conjuntoPersonas.add(new Persona(fechaBase.minusYears(15),
                "juan", "abolafía", "germán", dniBase + "a"));
        conjuntoPersonas.add(new Persona(fechaBase.minusYears(15),
                "juan", "abolafía", "germán", dniBase + "a")); //mismo objeto antes
        conjuntoPersonas.add(new Persona(fechaBase.minusYears(25),
                "juani", "abolafía", "abolafia", dniBase + "b"));
        conjuntoPersonas.add(new Persona(fechaBase.minusYears(31),
                "juan", "german", "germán", dniBase + "c"));
        conjuntoPersonas.add(new Persona(fechaBase.minusYears(12),
                "elisa", "pérez", "germán", dniBase + "d"));
        conjuntoPersonas.add(new Persona(fechaBase.minusYears(55),
                "rosa", "mena", "germán", dniBase + "e"));
        conjuntoPersonas.add(new Persona(fechaBase.minusYears(25),
                "manuel", "abolafía", "germán", dniBase + "z"));
        conjuntoPersonas.add(new Persona(fechaBase.minusYears(15),
                "manuel", "abolafía", "germán", dniBase + "x"));
       // conjuntoPersonas.forEach(System.out::println);
        List<Persona> listaPersonas = new ArrayList<>();
        for (Persona persona: conjuntoPersonas) {
            listaPersonas.add(persona);
        }
        listaPersonas.forEach(System.out::println);
        Collections.sort(listaPersonas);
        System.out.println("------------------------");
        listaPersonas.forEach(System.out::println);
        Collections.sort(listaPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.calcularEdad() - persona2.calcularEdad();
            }
        });
        System.out.println("------------------------");
        listaPersonas.forEach(System.out::println);
    }
}
