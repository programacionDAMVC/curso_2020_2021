package teoria.salidaBytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//escribir una frase en un fichero de salida llamado fichero1.txt
public class Ejemplo1 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        //defino el fichero
        File outFile = new File("OUTPUT_FILES/fichero1.txt");
        //frase a escribir
        String frase = "Decía él, que el Cid Ruy Díaz había sido muy buen caballero; pero que no tenía que ver con el caballero de la ardiente espada, que de sólo un revés había partido por medio dos fieros y descomunales gigantes. Mejor estaba con Bernardo del Carpio, porque en Roncesvalle había muerto a Roldán el encantado, valiéndose de la industria de Hércules, cuando ahogó a Anteo, el hijo de la Tierra, entre los brazos. Decía mucho bien del gigante Morgante, porque con ser de aquella generación gigantesca, que todos son soberbios y descomedidos, él solo era afable y bien criado; pero sobre todos estaba bien con Reinaldos de Montalbán, y más cuando le veía salir de su castillo y robar cuantos topaba, y cuando en Allende robó aquel ídolo de Mahoma, que era todo de oro, según dice su historia. Diera él, por dar una mano de coces al traidor de Galalón, al ama que tenía y aun a su sobrina de añadidura.\n" +
                "En efecto, rematado ya su juicio, vino a dar en el más extraño pensamiento que jamás dio loco en el mundo, y fue que le pareció convenible y necesario, así para el aumento de su honra, como para el servicio de su república, hacerse caballero andante, e irse por todo el mundo con sus armas y caballo a buscar las aventuras, y a ejercitarse en todo aquello que él había leído, que los caballeros andantes se ejercitaban, deshaciendo todo género de agravio, y poniéndose en ocasiones y peligros, donde acabándolos, cobrase eterno nombre y fama.\n" +
                "Imaginábase el pobre ya coronado por el valor de su brazo por lo menos del imperio de Trapisonda: y así con estos tan agradables pensamientos, llevado del estraño gusto que en ellos sentía, se dió priesa a poner en efecto lo que deseaba. Y lo primero que hizo, fue limpiar unas armas, que habían sido de sus bisabuelos, que, tomadas de orín y llenas de moho, luengos siglos había que estaban puestas y olvidadas en un rincón. Limpiólas y aderezólas lo mejor que pudo; pero vió que tenían una gran falta, y era que no tenía celada de encaje, sino morrión simple; mas a esto suplió su industria, porque de cartones hizo un modo de media celada, que encajada con el morrión, hacía una apariencia de celada entera. Es verdad que para probar si era fuerte, y podía estar al riesgo de una cuchillada, sacó su espada, y le dió dos golpes, y con el primero y en un punto deshizo lo que había hecho en una semana: y no dejó de parecerle mal la facilidad con que la había hecho pedazos, y por asegurarse de este peligro, lo tornó a hacer de nuevo, poniéndole unas barras de hierro por de dentro de tal manera, que él quedó satisfecho de su fortaleza; y, sin querer hacer nueva experiencia de ella, la diputó y tuvo por celada finísima de encaje. Fue luego a ver a su rocín, y aunque tenía más cuartos que un real, y más tachas que el caballo de Gonela, que tantum pellis, et ossa fuit, le pareció que ni el Bucéfalo de Alejandro, ni Babieca el del Cid con él se igualaban. Cuatro días se le pasaron en imaginar qué nombre le podría: porque, según se decía él a sí mismo, no era razón que caballo de caballero tan famoso, y tan bueno él por sí, estuviese sin nombre conocido; y así procuraba acomodársele, de manera que declarase quien había sido, antes que fuese de caballero andante, y lo que era entones: pues estaba muy puesto en razón, que mudando su señor estado, mudase él también el nombre; y le cobrase famoso y de estruendo, como convenía a la nueva orden y al nuevo ejercicio que ya profesaba: y así después de muchos nombres que formó, borró y quitó, añadió, deshizo y tornó a hacer en su memoria e imaginación, al fin le vino a llamar Rocinante, nombre a su parecer alto, sonoro y significativo de lo que había sido cuando fue rocín, antes de lo que ahora era, que era antes y primero de todos los rocines del mundo. Puesto nombre y tan a su gusto a su caballo, quiso ponérsele a sí mismo, y en este pensamiento, duró otros ocho días, y al cabo se vino a llamar don Quijote, de donde como queda dicho, tomaron ocasión los autores de esta tan verdadera historia, que sin duda se debía llamar Quijada, y no Quesada como otros quisieron decir. Pero acordándose que el valeroso Amadís, no sólo se había contentado con llamarse Amadís a secas, sino que añadió el nombre de su reino y patria, por hacerla famosa, y se llamó Amadís de Gaula, así quiso, como buen caballero, añadir al suyo el nombre de la suya, y llamarse don Quijote de la Mancha, con que a su parecer declaraba muy al vivo su\n" +
                "linaje y patria, y la honraba con tomar el sobrenombre della.";
        //convierto a byte[] esa frase, para poder usar el método write
        byte[] bytes = frase.getBytes();
        //manejo excepciones anterior java 7, forma clásica
        //defino el flujo
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(outFile);
            for (int i = 0; i < 1_000_000; i++) {
                out.write(bytes);
             //   out.flush();
            }

        } catch (FileNotFoundException e) {
            System.err.printf("%s fichero no existe", outFile);
        } catch (IOException e) {
            System.err.println("Error de I/O");
        } finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {
                System.err.println("Error de I/O");
            }
        }
        System.out.printf("Creado fichero %s de %d bytes%n", outFile, outFile.length());
        long fin = System.currentTimeMillis();
        System.out.printf("Tiempo de ejecucion %d ms%n", (fin - inicio));

    }
}
