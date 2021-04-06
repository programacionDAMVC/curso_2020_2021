package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ejercicio sobre colecciones dinámicas
 * @author manuel
 * @version 1.0.0
 * */
public class ColeccionDinamica {

    /**
     * @hidden
     * */
    public static void main(String[] args) {
        //Declare un ArrayList para guardar objetos de tipo String.
        List<String> listaCadenas = new ArrayList<>();  //creamos una lista de String VACÍA
        //Leemos las cadenas con un Scanner, hasta que encuetre fin o FIN, voy aceptar Fin
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce cadenas, para terminar escribe fin");
        while (true) {
            cadena = sc.nextLine();  //permito como cadena "hola", "hola amigo"  SON DOS CADENAS DISTINTAS
            //Si cadena es fin (variantes) salimos del bucle
          //  if (cadena == "fin")  NO FUNCIONA, SOLO PARA TIPOS PRIMITIVOS, int, double, char, boolean ...
          //  if (cadena.equals("fin")) NO FUNCIONA, SOLO PARA fin, NO VALE PARA FIN, ni para Fin
            if (cadena.equalsIgnoreCase("fin"))
                break;
            //añado la cadena a la lista
            listaCadenas.add(cadena);
        }
    //    sc.close();
        System.out.println("LISTA ORIGINAL");
        System.out.println(listaCadenas);  //comprobación
        System.out.println("LISTA DE CADENAS DE MAYOR LONGITUD");
        System.out.println(obtenerCadenasMayorLongitud(listaCadenas));
        System.out.println("Introduce cadena a buscar");
        String cadenaABuscar = sc.nextLine();
        System.out.printf("%s ¿Existe? %b%n", cadenaABuscar, existeCadena(listaCadenas, cadenaABuscar));
        System.out.println("Introduce una nueva cadena:");
        String cadenaNueva = sc.nextLine();
        System.out.printf("%s ¿Añadida correctamente? %b%n", cadenaNueva, annadirCadena(listaCadenas, cadenaNueva));
        System.out.println("Nueva lista");
        System.out.println(listaCadenas);
        System.out.println("Indica cadena a elimninar");
        String cadenaAEliminar = sc.nextLine();
        System.out.printf("%s ¿Ha sido eliminada? %b%n", cadenaAEliminar, eliminarCadena(listaCadenas, cadenaAEliminar));
        System.out.println(listaCadenas);
        sc.close();
    }

    /**
     * Método que nos devuelve una listas de cadenas con la mayor longitud
     * @param listaOriginal lista a buscar las cadenas de mayor longitud
     * @return lista con las cadenas de mayor longitud
     */
    public static List<String> obtenerCadenasMayorLongitud (List<String> listaOriginal) {

        //["imp", "uno", "dos", "cinco"]   devolvemos ["cinco"]
        //["imp", "uno", "dos", "ci"]   devolvemos ["imp", "uno", "dos"]
        //primero definimos la lista que vamos a devolver, la de las cadenas mas largas
       // List<String> listaCadenasMasLargas; típico error, hay que inicializar la lista
        List<String> listaCadenasMasLargas = new ArrayList<>();  //lista vacía []
        int longituCadenaMasLarga = 0;
        for (String cadena: listaOriginal) {
      //  for (int i = 0; i < listaOriginal.size() ; i++) {

            //si la cadena es mas pequeña, la ignoro
//           if (cadena.length() < longituCadenaMasLarga) {
//                //no  hago nada
//            }
//            //si la cadena tiene la misma longitud que la mas grande actual, la añado a la lista
//            else if (cadena.length() == longituCadenaMasLarga) {
//                listaCadenasMasLargas.add(cadena);
//            }
//            //si la cadena tiene la mayor longitud que la mas grande actual, limpiar lista, añado la nueva cadena
//            else {
//                listaCadenasMasLargas.clear();
//                listaCadenasMasLargas.add(cadena);
//                longituCadenaMasLarga = cadena.length();
//            }

            //CADENA MAS LARGA QUE LAS QUE HAY EN LA LISTA
            if (cadena.length() > longituCadenaMasLarga) {
                listaCadenasMasLargas.clear();
                longituCadenaMasLarga = cadena.length();
                listaCadenasMasLargas.add(cadena);
                continue;
            }
            //CADENA DE IGUAL LONGITUD
            if (cadena.length() == longituCadenaMasLarga) {
                listaCadenasMasLargas.add(cadena);
            }

            //CADENA DE MAYOR O IGUAL LONGITUD
//            if (cadena.length() >= longituCadenaMasLarga) {
//                if (cadena.length() > longituCadenaMasLarga) {
//                    listaCadenasMasLargas.clear();
//                    longituCadenaMasLarga = cadena.length();
//                }
//                listaCadenasMasLargas.add(cadena);
//            }
        }
        return listaCadenasMasLargas;
    }

    /**
     * Un método que se le pase por argumento una cadena y nos diga si dicha
     * cadena se encuentra en la colección anterior.
     * @param listaCadenas lista de cadenas donde buscar si existe o no una cadena
     * @param cadenaABuscar cadena a buscar
     * @return true si y solo si, existe dicha cadena en la lista
     */
    public static boolean existeCadena (List<String> listaCadenas, String cadenaABuscar) {
//       for (String cadena: listaCadenas) {
//            if (cadena.equals(cadenaABuscar)) {
//                return true;
//            }
//        }
//        return false;
       return listaCadenas.contains(cadenaABuscar);
    }

    /**
     *  Método que nos sirva para añadir nuevas cadenas a la colección.
     * @param listaCadenas lista de cadenas donde añadir la nueva cadena
     * @param cadenaNueva cadena a añadir
     * @return true si y solo si, se ha añadido correctamente
     */
    public static boolean annadirCadena (List<String> listaCadenas, String cadenaNueva) {
        return  listaCadenas.add(cadenaNueva);
    }

    /**
     * Método que elimina una cadena, siempre que exista
     * @param listaCadenas lista de cadenas donde eliminar la cadena
     * @param cadenaAEliminar cadena a eliminar
     * @return true si solo si, se elimina la cadena de la lista, porque existe en ella
     */
    public static boolean eliminarCadena (List<String> listaCadenas, String cadenaAEliminar) {
        return listaCadenas.remove(cadenaAEliminar);
    }
}
