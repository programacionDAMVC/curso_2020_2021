package teoria.stringbuilder;

public class TesPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("javier", "garcía", "colmenero", "12345678l",
                "avenida de madrid 6, 6º Dcha.");
        System.out.println(persona);
        System.out.println("comprobar los saltos de línea");
    }
}
