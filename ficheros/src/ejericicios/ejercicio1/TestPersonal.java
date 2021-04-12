package ejericicios.ejercicio1;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TestPersonal {
    private static Scanner sc = new Scanner(System.in);
    private static Personal personal = null;
    public static void main(String[] args) {
        //crear List<Persona> usando el método correspondiente de la clase auxiliar, usando el fichero personal.csv
        try {
            List<Persona> listaPersona = Auxilar.extraerListaDesdeFichero("EXERCISES_FILES/personal.csv");
            //crear una instancia de Personal, necesito List<Persona> creada anteriormente
            personal = new Personal(listaPersona);
            //compruebo mostrando en consola la salida del método obtenerListaPersonasPorPais (String pais) de la clase
            //personal, usando la referencia del objeto Personal y como pais ponemos Poland
            /*List<Persona> personasPolacas = personal.obtenerListaPersonasPorPais("Poland");
            personasPolacas.forEach(System.out::println);*/

            //hacemos un menú con opciones:
            //0 salir de la aplicación
            //1 mostrar personas de un país
            //2 borrar una persona por email

            do {
                mostraMenu();
                //solicitamos por scanner la opción
                String opcion = sc.nextLine();
                //usamos switch
                switch (opcion) {
                    case "0" :
                        System.out.println("Fin de programa");
                        sc.close();
                        return;  //otra posibilidad System.exit(0)
                    case "1" :
                        mostrarPersonasPorPais();
                        break;
                    case "2" :
                        eliminarPersonaPorEmail();
                        break;
                    default:
                        System.out.println("Opción incorrecta, introduce un valor válida");
                        break;
                }
            } while (true);


        } catch (IOException e) {
            System.err.println("No existe el fichero");
        }



    }

    private static void eliminarPersonaPorEmail() {
    }

    private static void mostrarPersonasPorPais() {
        //solicitamos el país por el Scanner que está abierto
        System.out.println("Introduce país");
        String pais = sc.nextLine();
        //Con la referencia Personal llamo al método obtenerListaPersonasPorPais
        List<Persona> personas = personal.obtenerListaPersonasPorPais(pais);
        //mostramos los datos en consola
        personas.forEach(System.out::println);
    }

    private static void mostraMenu() {
        System.out.println("Elige opción:");
        System.out.println("0- SALIR");
        System.out.println("1- MOSTRAR PERSONAL DE UN PAÍS");
        System.out.println("2- BORRAR PESONA POR EMAIL");
    }
}
