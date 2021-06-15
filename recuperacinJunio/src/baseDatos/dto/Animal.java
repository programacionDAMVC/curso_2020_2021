package baseDatos.dto;

public class Animal {
    /*
    id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombreComun TEXT,
        nombreCientifico TEXT
     */
    private int id;
    private String nombreComun;
    private String nombreCientfico;

    public Animal(String nombreComun, String nombreCientfico) {
        this.nombreComun = nombreComun;
        this.nombreCientfico = nombreCientfico;
    }

    public Animal(int id, String nombreComun, String nombreCientfico) {
        this.id = id;
        this.nombreComun = nombreComun;
        this.nombreCientfico = nombreCientfico;
    }

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getNombreCientfico() {
        return nombreCientfico;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setNombreCientfico(String nombreCientfico) {
        this.nombreCientfico = nombreCientfico;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s", id, nombreComun, nombreCientfico);
    }
}
