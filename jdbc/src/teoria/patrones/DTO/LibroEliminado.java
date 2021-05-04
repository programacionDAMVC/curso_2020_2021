package teoria.patrones.DTO;

import java.time.LocalDateTime;

public class LibroEliminado {
    /*id INTEGER PRIMARY KEY AUTOINCREMENT,
nombre TEXT,
autor TEXT,
editorial TEXT,
fecha_baja TEXT
*/
    private String nombreLibro;
    private String autor;
    private String editorial;
    private LocalDateTime fechaBaja;

    public LibroEliminado() {
    }

    public LibroEliminado(String nombreLibro, String autor, String editorial, LocalDateTime fechaBaja) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaBaja = fechaBaja;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDateTime getFechaBaja() {
        return fechaBaja;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", nombreLibro, autor, editorial, fechaBaja);
    }
}
