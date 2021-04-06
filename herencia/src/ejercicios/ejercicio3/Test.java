package ejercicios.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Test {

    static final Instituto instituto = new Instituto();
    static final Scanner scanner = new Scanner(System.in);
    static final double RETENCION = 15.5;

    public static void main(String[] args) throws FileNotFoundException {
        leerFichero(); // Leer el fichero profesores.csv y comprobar sout

        while (true) {
            System.out.println(mostrarMenu());
            String sOpcion = scanner.nextLine();
            switch (sOpcion) {
                case "0" :
                    System.out.println("Fin de programa");
                    scanner.close();
                    return;
                case "1" :
                    annadirProfesor();
                    break;
                case "2" :
                    borrarProfesor();
                    break;
                case "3" :
                    ampliarContrato();
                    break;
                case "4" :
                    instituto.mostrarClaustro();
                    break;
                case "5" :
                    System.out.printf("Sueldos a pagar mensualmente: %.2f%n",
                            instituto.calcularSueldosNetos(RETENCION));
                    break;
                default:
                    break;
            }
        }

    }

    private static void ampliarContrato() {
        String dni = "";
        while (true) {
            System.out.println("introduce dni con letra");
            dni =  scanner.nextLine();
            if (Auxiliar.validarDNI(dni))
                break;
        }
        String sAmpliacion = null;
        int iAmpliacion = 0;
        while (true) {
            System.out.println("introduce la ampliación de contrato");
            sAmpliacion = scanner.nextLine();
            if (sAmpliacion.matches("[1-9]|1[01]")) {
                iAmpliacion = Integer.parseInt(sAmpliacion);
                break;
            }
        }
        System.out.printf("Ampliado el contrado de profesor %s, resultado: %B%n",
                dni,instituto.ampliarContratoProfesor(dni, iAmpliacion));
    }

    private static void leerFichero() throws FileNotFoundException {

        Scanner in = new Scanner(new File("ficheros/profesores.csv"));
        String nombreInstituto = in.nextLine();
        instituto.setNombreInstituto(nombreInstituto);
        while (in.hasNextLine()) {
            String[] linea = in.nextLine().split(";");
            if (linea[7].contains("/")) {
                //Aubert;Bord;Marlon;75628864p;6/13/1989;1200.0;SISTEMAS INFORMATICOS;1/18/2004
                instituto.annadirProfesor(new ProfesorTitular(linea[3], linea[0], linea[1], linea[2],
                        Auxiliar.formatearFecha(linea[4]), Double.parseDouble(linea[5]),
                        Auxiliar.obtenerMateria(linea[6]), Auxiliar.formatearFecha(linea[7])));
            } else {
                //Lydon;Harlan;Ryson;84888199D;8/18/1986;1808.4;SISTEMAS INFORMATICOS;3
                instituto.annadirProfesor(new ProfesorInterino(linea[3], linea[0], linea[1], linea[2],
                        Auxiliar.formatearFecha(linea[4]), Double.parseDouble(linea[5]),
                        Auxiliar.obtenerMateria(linea[6]), Integer.parseInt(linea[7])));
            }
        }
        in.close();

    }

    private static void borrarProfesor() {
        while (true) {
            System.out.println("introduce dni con letra");
            String dni =  scanner.nextLine();
            if (Auxiliar.validarDNI(dni)) {
                boolean resultado = instituto.eliminarProfesor(dni);
                System.out.printf("Profesor con dni %s ¿Eliminado? %B%n", dni, resultado);
                break;
            }
        }

    }

    private static void annadirProfesor() {
        System.out.println("introduce nombre del profesor");
        String nombreProfesor = scanner.nextLine();
        System.out.println("introduce apellido1 del profesor");
        String apellido1 = scanner.nextLine();
        System.out.println("introduce apellido2 del profesor");
        String apellido2 = scanner.nextLine();
        String dni;
        while (true) {
            System.out.println("introduce dni del profesor con letra");
            dni = scanner.nextLine();
            if (Auxiliar.validarDNI(dni))
                break;
        }
        String sDia;
        int iDia;
        while (true) {
            System.out.println("introduce día de nacimiento");
            sDia = scanner.nextLine();
            if (!sDia.matches("[0-9]{1,2}")) //programación segura para evitar excepción en parseInt
                continue;
            iDia = Integer.parseInt(sDia);
            if (iDia > 31 || iDia < 1) //pequeña protección de los días 1-31
                continue;
            break;
        }
        String sMes;
        int iMes;
        while (true) {
            System.out.println("introduce mes de nacimiento");
            sMes = scanner.nextLine();
            if (!sMes.matches("[1-9]|1[0-2]")) //programación segura para evitar excepción en parseInt
                continue;
            iMes = Integer.parseInt(sMes);
            break;
        }
        String sAnno;
        int iAnno;
        while (true) {
            System.out.println("introduce año de nacimiento");
            sAnno = scanner.nextLine();
            if (!sAnno.matches("(19|20)[0-9]{2}")) //programación segura para evitar excepción en parseInt
                continue;
            iAnno = Integer.parseInt(sAnno);
            break;
        }
        String sSueldo;
        double dSueldo = 0;
        while (true) {
            System.out.println("Introduce sueldo");
            sSueldo = scanner.nextLine();
            if (sSueldo.matches("[12][0-9]{3}(\\.[0-9]+)?"))
                break;
        }
        Profesor.Materia materia = null;
        String opcionMaterias = "";
        while (!opcionMaterias.matches("[0-5]")) {
            System.out.println("Selecciona materia");
            mostrarMenuMaterias();
            opcionMaterias = scanner.nextLine();
            switch (opcionMaterias) {
                case "0":
                    materia = Profesor.Materia.SISTEMAS_INFORMATICOS;
                    break;
                case "1":
                    materia = Profesor.Materia.ENTORNOS_DE_DESARROLLO;
                    break;
                case "2":
                    materia = Profesor.Materia.LENGUAJES_DE_MARCAS;
                    break;
                case "3":
                    materia = Profesor.Materia.PROGRAMACION;
                    break;
                case "4":
                    materia = Profesor.Materia.EMPRESAS;
                    break;
                case "5":
                    materia = Profesor.Materia.BASE_DE_DATOS;
                    break;
                default:
                    break;
            }

         }
        while (true) {
            System.out.println("Elige opción de profesor:");
            System.out.println("1. Profesor titular");
            System.out.println("2. Profesor interino\n");
            String opcion = scanner.nextLine();
            if (!opcion.matches("[12]"))
                continue;
            if (opcion.equals("1")) {
                System.out.printf("Añadido profesor %B%n",instituto.annadirProfesor(new ProfesorTitular(dni, nombreProfesor, apellido1, apellido2,
                        LocalDate.of(iAnno, iMes, iDia), dSueldo, materia, LocalDate.now())));
                break;
            }
            else {

                String sContrato;
                int iContrato = 0;
                while (true){
                    System.out.println("Introduce meses de contrato, de 1 a 12 meses");
                    sContrato = scanner.nextLine();
                    if (! sContrato.matches("[1-9]|1[0-2]"))
                        continue;
                    iContrato = Integer.parseInt(sContrato);
                    break;

                }
                System.out.printf("Añadido profesor %B%n", instituto.annadirProfesor(new ProfesorInterino(dni, nombreProfesor, apellido1, apellido2,
                        LocalDate.of(iAnno,iMes,iDia), dSueldo, materia, iContrato )));
                break;
            }

        }

    }

    private static void mostrarMenuMaterias() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n0.- SISTEMAS INFORMATICOS.\n");
        stringBuilder.append("1.- ENTORNOS DE DESARROLLO.\n");
        stringBuilder.append("2.- LENGUAJES DE MARCAS.\n");
        stringBuilder.append("3.- PROGRAMACION.\n");
        stringBuilder.append("4.- EMPRESAS.\n");
        stringBuilder.append("5.- BASE DE DATOS.\n\n");
        stringBuilder.append("Elige opción: ");
        System.out.println(stringBuilder);
    }

    private static String  mostrarMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MENÚ\n\n");
        stringBuilder.append("0.- Salir.\n");
        stringBuilder.append("1.- Añadir profesor.\n");
        stringBuilder.append("2.- Borrar profesor.\n");
        stringBuilder.append("3.- Ampliar contrato.\n");
        stringBuilder.append("4.- Mostrar profesores.\n");
        stringBuilder.append("5.- Mostrar sueldos.\n\n");
        stringBuilder.append("Elige opción: ");
        return stringBuilder.toString();
    }
}
