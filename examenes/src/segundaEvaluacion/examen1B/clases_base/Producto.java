package segundaEvaluacion.examen1B.clases_base;

public class Producto {

    private String nombreProducto;
    private double precio;
    private String codigo;

    public Producto(String nombreProducto, double precio, String codigo) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f", codigo, nombreProducto, precio);
    }
}
