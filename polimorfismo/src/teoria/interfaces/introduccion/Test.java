package teoria.interfaces.introduccion;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<A> lista  =new ArrayList<>();
     //   lista.add(new A());
        lista.add(new B());
      //  lista.add(new C());
        lista.add(new D());
        for (A a: lista ) {
            a.metodo1();
            System.out.println(a.metodo2());
        }

        //ejemplo de herencia  múltiple en Java
        //public class J extends C implements A, E
        J j1 = new J();
        C j2 = new J();
        A j3 = new J();
        E j4 = new J();
        A b1 = new B(); //ejemplo claro de polimorfismo
    }
}
