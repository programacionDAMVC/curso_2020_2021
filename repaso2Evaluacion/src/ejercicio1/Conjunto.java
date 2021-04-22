package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {
    private List<NumeroNatural> elementosConjunto;

    public Conjunto(List<NumeroNatural> elementosConjunto) {
        this.elementosConjunto = elementosConjunto;
    }
    public boolean esVacio () {
        return elementosConjunto.isEmpty();
        // return elementosConjunto.size() == 0;
    }
    public int obtenerNumElemento () {
        return elementosConjunto.size();
    }

    @Override
    public String toString() {
        //return elementosConjunto.toString();
        return String.format("DATOS: %s", elementosConjunto);
    }
    public static List<NumeroNatural> unirConjuntos (List<NumeroNatural> conjunto1, List<NumeroNatural> conjunto2) {
        /*List<NumeroNatural> union = new ArrayList<>();
        for (NumeroNatural numeroNatural: conjunto1) {
            union.add(numeroNatural);
        }
        for (NumeroNatural numeroNatural: conjunto2) {
            union.add(numeroNatural);
        }
        return union;*/

        /*conjunto1.addAll(conjunto2);
        return conjunto1;  se modifica conjunto1*/

        List<NumeroNatural> union = new ArrayList<>();
        union.addAll(conjunto1);
        union.addAll(conjunto2);
        return union;
    }
    public static List<NumeroNatural> hacerInterseccionConjuntos (List<NumeroNatural> conjunto1, List<NumeroNatural> conjunto2) {
        List<NumeroNatural> interseccion = new ArrayList<>();
        List<NumeroNatural> listaMasChica = conjunto1, listaMasGrande = conjunto2;
        if (conjunto1.size() > conjunto2.size()) {
            listaMasChica = conjunto2;
            listaMasGrande = conjunto1;
        }
        for (NumeroNatural numeroNatural: listaMasChica) {
            if (listaMasGrande.contains(numeroNatural))
                interseccion.add(numeroNatural);
        }

        return interseccion;
    }

}
