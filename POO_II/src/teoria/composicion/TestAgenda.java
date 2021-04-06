package teoria.composicion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestAgenda {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("FILES/datos.csv"));
        Agenda agenda = new Agenda("trabajo");
        String[] linea;
        while (sc.hasNextLine()){
            linea = sc.nextLine().split(",");
            if (Contacto.validarNumeroTelefono(linea[0])) {
                agenda.annadirContacto(new Contacto(linea[1], linea[0]));
            }
        }
        sc.close();
        System.out.println(agenda.obtenerNumeroContactos());
        Contacto contacto = new Contacto("nombre", "953123456");
        agenda.annadirContacto(contacto);
        System.out.println(agenda.obtenerNumeroContactos());
        System.out.printf("Agenda creada %s%n", agenda.getFechaCreacion());
        System.out.printf("Telefono de %s: %s%n" , "nombre", agenda.obtenerNumeroTelefono("nombre"));
        System.out.printf("Contacto de %s: %s%n" , "nombre", agenda.obtenerContacto("nombre"));
        agenda.eliminarContacto(contacto);
        System.out.println(agenda.obtenerNumeroContactos());





    }
}
