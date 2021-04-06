package teoria.introduccion.automoviles;

public class Coche extends Vehiculo {

    private boolean diesel;
    private boolean descapotable;

    public Coche(String fabricante, String modelo, boolean diesel, boolean descapotable) {
        super(4, fabricante, modelo);
        this.diesel = diesel;
        this.descapotable = descapotable;
    }

    public boolean isDiesel() {
        return this.diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean isDescapotable() {
        return this.descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public String toString() {
        return String.format("%s, COCHE diesel %b, descapotable %B", new Object[] { super.toString(), Boolean.valueOf(this.diesel),
                Boolean.valueOf(this.descapotable) });
    }
}
