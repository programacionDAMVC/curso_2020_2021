package ejericicios.ejercicio1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auxilar {

    public static List<Persona> extraerListaDesdeFichero (String path) throws IOException {
        List<Persona> listaPersona = new ArrayList<>();
        Path pathFile = Paths.get(path);
        //usando Scanner
        /*Scanner in = new Scanner(pathFile);
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
        if (in != null)
            in.close();*/

        //usando readAllLines de la clase Files
        List<String> lineas = Files.readAllLines(pathFile);
        for (String linea: lineas) {
            String[] tokens = linea.split(",");
            Gender gender    = Gender.male;
            if (tokens[3].equalsIgnoreCase("female"))
                gender = Gender.female;
            listaPersona.add(new Persona(tokens[0], tokens[1], tokens[2], gender, tokens[4]));
        }
        return listaPersona;
        //repetir la lógica usando readAllLines de la clase Files
    }

    public static void crearFicheroPersonal (List<Persona> listaPersonas) throws IOException {
        //salida del fichero sea personal_9_2_2021_12_31.csv
        LocalDateTime now = LocalDateTime.now();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EXERCISES_FILES/personal_");
        stringBuilder.append(now.getDayOfMonth());
        stringBuilder.append("_");
        stringBuilder.append(now.getMonthValue());
        stringBuilder.append("_");
        stringBuilder.append(now.getYear());
        stringBuilder.append("_");
        stringBuilder.append(now.getHour());
        stringBuilder.append("_");
        stringBuilder.append(now.getMinute());
        stringBuilder.append(".csv");
        String nombreFichero = stringBuilder.toString();
        File outFile = new File(nombreFichero);
        //PrintWriter primera opción
        PrintWriter out = new PrintWriter(outFile);
        for (Persona persona: listaPersonas) {
            out.println(persona);
            out.flush();
        }
        if (out != null)
            out.close();
        if (outFile.length() > 0)
            System.out.printf("Creado fichero %s de %d bytes%n", outFile.getName(), outFile.length() );
        else
            System.out.println("no se ha podido crear el fichero");

        /*//BufferedWriter de la clase Files
        Path path = Paths.get(nombreFichero);
        BufferedWriter out = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
        for (Persona persona: listaPersonas) {
            out.write(persona.toString());
            out.newLine();
            out.flush();
        }
        if (out != null)
            out.close();
        if (path.toFile().length() > 0)
            System.out.printf("Creado fichero %s de %d bytes%n", path.getFileName(), path.toFile().length() );
        else
            System.out.println("no se ha podido crear el fichero");*/
    }

    public static void main(String[] args) {
        try {
            extraerListaDesdeFichero("EXERCISES_FILES/personal.csv").forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
       /* List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("nombre1", "apellidos1", "email1", Gender.female, "pais1" ));
        lista.add(new Persona("nombre2", "apellidos2", "email2", Gender.male, "pais2" ));
        try {
            crearFicheroPersonal(lista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
