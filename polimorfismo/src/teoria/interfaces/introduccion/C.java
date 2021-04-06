package teoria.interfaces.introduccion;

public abstract class C implements A {
    @Override
    public void metodo1() {
        System.out.println("Soy la clase C que  implementa la clase A");
    }

    @Override
    public abstract double metodo2();
}
