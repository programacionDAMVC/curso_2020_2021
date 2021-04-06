package teoria.composicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String categoriaAgenda;
    private List<Contacto> listaContacto = new ArrayList<>();
    private LocalDate fechaCreacion = LocalDate.now();

    public Agenda(String categoriaAgenda) {
        this.categoriaAgenda = categoriaAgenda;
    }

    public Agenda(String categoriaAgenda, List<Contacto> listaContacto) {
        this.categoriaAgenda = categoriaAgenda;
        this.listaContacto = listaContacto;
    }

    public void annadirContacto (Contacto contacto) {
        listaContacto.add(contacto);
    }
    public void eliminarContacto (Contacto contacto) {
        listaContacto.remove(contacto);
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public int obtenerNumeroContactos () {
        return listaContacto.size();
    }

    public String obtenerNumeroTelefono (String nombre) {
        for (Contacto contacto: listaContacto) {
            if (contacto.getNombreContacto().equalsIgnoreCase(nombre)) {
                return contacto.getNumeroTelefono();
            }
        }
        return "No existe el teléfono";
    }
    public Contacto obtenerContacto (String nombre) {
        for (Contacto contacto: listaContacto) {
            if (contacto.getNombreContacto().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return categoriaAgenda + "-" + listaContacto + "-" + fechaCreacion;
    }
}
