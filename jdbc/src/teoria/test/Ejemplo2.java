package teoria.test;

import teoria.patronSingleton.ClaseInstanciaUnica;

//probando patrón Singleton
public class Ejemplo2 {
    public static void main(String[] args) {
        ClaseInstanciaUnica uno = ClaseInstanciaUnica.getInstance();
        ClaseInstanciaUnica dos = ClaseInstanciaUnica.getInstance();
        ClaseInstanciaUnica tres = ClaseInstanciaUnica.getInstance();
        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
    }
}
