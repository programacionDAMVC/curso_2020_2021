package ejericicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Personal {
    private List<Persona> listaPersonas;

    public Personal(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public boolean insertarPersona (Persona persona) {
        return listaPersonas.add(persona);
    }

    public List<Persona> obtenerListaPersonasPorPais (String pais) {
        List<Persona> listaPorPais = new ArrayList<>();
        for (Persona persona: listaPersonas) {
            if (persona.getCountry().equalsIgnoreCase(pais))
                listaPorPais.add(persona);
        }
        return listaPorPais;
    }
    public boolean borrarPersonaPorEmail (String email) {
        //suponemos que email es único
        for (Persona persona: listaPersonas) {
            if (persona.getEmail().equalsIgnoreCase(email))
                return listaPersonas.remove(persona);

        }
        return false;
    }
}
