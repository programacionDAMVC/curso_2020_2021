package teoria.valor_referencia;

public class Ejemplo2 {

    public static void main(String[] args) {
        Persona persona = new Persona("juan");
        System.out.printf("Valor del atributo antes de llamar al método %s%n", persona.getNombre());
        modificar(persona);
        System.out.printf("Valor del atributo desṕues de llamar al método %s%n", persona.getNombre());

    }
    public static void modificar(Persona p) {
        System.out.printf("Valor del atributo en el método antes de modificar %s%n", p.getNombre());
        p.setNombre("felipe");
        System.out.printf("Valor del atributo en el método después de modificar %s%n", p.getNombre());

    }
}
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
