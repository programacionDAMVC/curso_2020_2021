package teoria.introduccion.automoviles;

import java.util.ArrayList;
import java.util.List;

public class TestVehiculo {
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Motocicleta("Honda", "CBR", 500));
        listaVehiculos.add(new Motocicleta("Suzuki", "Marauder", 250));
        listaVehiculos.add(new Motocicleta("Yamaha", "Tenere", 750));
        listaVehiculos.add(new Coche("Ford", "focus", true, false));
        mostrarDatos(listaVehiculos);
    }

    private static void mostrarDatos(List<Vehiculo> listaVehiculos) {
        listaVehiculos.forEach(vehiculo -> System.out.println(vehiculo));
    }
}
