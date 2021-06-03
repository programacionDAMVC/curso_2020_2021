package poo.test;

import poo.poo1.ejemplo2.Ordenador;
import poo.poo1.ejemplo2.TipoProcesador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestOrdenador {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador();
        //0 0 null fecha actual
        System.out.println(ordenador1.toString());
        ordenador1.setRam(16);
        ordenador1.setDisco(1);
        ordenador1.setProcesador(TipoProcesador.INTEL);
        System.out.println(ordenador1); //funciona sin el toString()
        Ordenador ordenador2 = new Ordenador(4, 0.5, TipoProcesador.ARM);
        System.out.println(ordenador2);
        Ordenador ordenador3 = new Ordenador(32, 2, TipoProcesador.ARM);
        System.out.println(ordenador3);

        //colección básica (array) de objetos Ordenador de tamaño tres
        Ordenador[] ordenadores = new Ordenador[3];
        System.out.println(Arrays.toString(ordenadores));
        ordenadores[0] = ordenador1;
        ordenadores[1] = ordenador2;
        ordenadores[2] = ordenador3;
    //    ordenadores[3] = new Ordenador();
        System.out.println(Arrays.toString(ordenadores));
        System.out.printf("Nº de ordenadores %d\n", Ordenador.numeroOrdenadores);
        //colección dinámica de objetos Ordenador
        List<Ordenador> listaOrdenadores = new ArrayList<>();
        System.out.println(listaOrdenadores);
        listaOrdenadores.add(ordenador1);
        listaOrdenadores.add(ordenador2);
        listaOrdenadores.add(ordenador3);
        listaOrdenadores.add(new Ordenador());
        System.out.println(listaOrdenadores);
        System.out.printf("Nº de ordenadores %d\n", Ordenador.numeroOrdenadores);


    }

}
