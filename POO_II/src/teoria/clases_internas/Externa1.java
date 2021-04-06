package teoria.clases_internas;

public class Externa1 {
  private String atributo = "hola";
  private static String estatico = "hello";

  public void modificadorInstancia () {
    atributo = atributo.toUpperCase();
    estatico = estatico.toUpperCase();
  }
  public static void modificadorClase () {
    estatico = estatico.toLowerCase();
    Externa1 externa1 = new Externa1(); //nuevo objeto, visible solo en este clase, fuera no
    externa1.atributo = externa1.atributo.toLowerCase() ;
    System.out.printf("%n%ndentro del método de clase, nuevo objeto: %s%n%n", externa1);
  }

  @Override
  public String toString() {
    return String.format("ATRIBUTO: %s, ESTÁTICO %s", atributo, estatico);
  }
}

class Out {
}
