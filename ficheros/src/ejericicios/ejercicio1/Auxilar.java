package ejericicios.ejercicio1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auxilar {
    public static List<Persona> extraerListaDesdeFichero (String path) throws IOException {
        List<Persona> listaPersona = new ArrayList<>();
        Path pathFile = Paths.get(path);
        Scanner in = new Scanner(pathFile);
        while (in.hasNextLine()) {
            String linea = in.nextLine();
            String[] tokens = linea.split(",");
            String firstName = tokens[0];
            String lastName  = tokens[1];
            String email     = tokens[2];
            String sGender   = tokens[3];
            Gender gender    = Gender.male;
            if (sGender.equalsIgnoreCase("female"))
                gender = Gender.female;
            String country   = tokens[4];
            Persona persona = new Persona(firstName, lastName, email, gender, country);
            listaPersona.add(persona);
        }
        in.close();
        return listaPersona;
        //repetir la lógica usando readAllLines de la clase Files
    }
    public static void crearFicheroPersonal (List<Persona> listaPersonas) {
        //salida del fichero sea personal_9_2_2021_12_31.csv
        LocalDateTime now = LocalDateTime.now();
        StringBuilder stringBuilder = new StringBuilder();
        String nombreFichero = "";
        //PrintWriter primera opción
        //BufferedWriter de la clase Files
    }

    public static void main(String[] args) {
        try {
            extraerListaDesdeFichero("EXERCISES_FILES/persnal.csv").forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
