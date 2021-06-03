package poo.poo1.ejemplo2;

import java.time.LocalDate;

public class Ordenador {

    private int ram;
    private double disco;
    private TipoProcesador procesador;
    private LocalDate fechaCompra = LocalDate.now();
    public static int numeroOrdenadores = 0;

    public Ordenador() {
        numeroOrdenadores++;
    }

    public Ordenador(int ram, double disco, TipoProcesador procesador) {
        this.ram = ram;
        this.disco = disco;
        this.procesador = procesador;
        numeroOrdenadores++;
    }

    public int getRam() {
        return ram;
    }

    public double getDisco() {
        return disco;
    }

    public TipoProcesador getProcesador() {
        return procesador;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public void setProcesador(TipoProcesador procesador) {
        this.procesador = procesador;
    }

    //ram:  Gb, disco: 1 Tb, procesador: ARM, fecha compra: 10-10-2010

    @Override
    public String toString() {
        return String.format("ram: %d Gb, disco: %.2f Tb, procesador: %s, fecha compra: %d-%d-%d",
                ram, disco, procesador, fechaCompra.getDayOfMonth(), fechaCompra.getMonthValue(),
                fechaCompra.getYear());
    }

    //método que nos dice el ordenador de mayor ram de un array
    public static int obtenerMayorRAMDeOrdenadores (Ordenador[] ordenadores) {


        return 0;
    }
}
