package teoria.introduccion.equals_hashcode;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Persona persona1 = new Persona(
                "juan pérez", "12345678a", LocalDate.of(2000,2, 12));
        Persona persona2 = new Persona(
                "juani pérez", "12345664b", LocalDate.of(2000,2, 12));
        Persona persona3 = new Persona(
                "sebastian pérez", "12345678a", LocalDate.of(2000,2, 12));
        System.out.println("Comparando referencias");
        System.out.println(persona1 == persona2);
        System.out.println(persona1 == persona3);
        System.out.println("Comparando montículo");
        System.out.println(persona1.equals(persona2));
        System.out.println(persona1.equals(persona3));



    }
}
