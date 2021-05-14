package app1.modelo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diccionario {

    /*String[] coleccion = {"hola", "adios"};
    List<String> lista = List.of("hola", "adios");*/

    private Map<String, String> diccionario = Map.of("coche", "car", "hola", "hello",
            "adios", "bye", "mesa", "table", "silla", "chair", "sol", "sun",
            "luna", "moon", "ventana", "window", "tierra", "earth", "planeta", "planet");

    public Map<String, String> getDiccionario() {
        return diccionario;
    }

    public String devolverKey(String value) {
        Set<String> claves = diccionario.keySet();
        for (String clave: claves) {
            if(value.equalsIgnoreCase(diccionario.get(clave)))
                return clave;
        }
        return "";
    }
}
