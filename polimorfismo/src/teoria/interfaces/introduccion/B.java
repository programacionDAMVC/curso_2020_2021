package teoria.interfaces.introduccion;

public class B implements A {
    @Override
    public void metodo1() {
        System.out.println("Soy la clase B que  implementa la clase A");
    }

    @Override
    public double metodo2() {
      //  VALOR = 8;
        return VALOR / 2.0;
    }
}
