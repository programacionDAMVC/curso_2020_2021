package teoria.patrones.DTO;

import java.util.Objects;

public class Libro implements Comparable<Libro>{

    private int idLibro;
    private String nombreLibro;
    private String autor;
    private String editorial;
    private int idCategoria;

    public Libro(int idLibro, String nombreLibro, String autor, String editorial, int idCategoria) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.editorial = editorial;
        this.idCategoria = idCategoria;
    }

    public Libro(String nombreLibro, String autor, String editorial, int idCategoria) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.editorial = editorial;
        this.idCategoria = idCategoria;
    }

    public Libro() {
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%d", idLibro, nombreLibro, autor, editorial, idCategoria);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return idLibro == libro.idLibro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLibro);
    }

    @Override
    public int compareTo(Libro libro) {
        return this.nombreLibro.compareTo(libro.nombreLibro);
    }
}
