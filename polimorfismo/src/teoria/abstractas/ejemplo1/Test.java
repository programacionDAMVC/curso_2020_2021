package teoria.abstractas.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<A> lista = new ArrayList<>();
        lista.add(new D());
        lista.add(new B());
       // lista.add(new C()); no se puede crear objetos de clases abstractas
       // lista.add(new A()); no se puede crear objetos de clases abstractas
        for (A a : lista ) {
            a.despedirse();
        }

    }
}
