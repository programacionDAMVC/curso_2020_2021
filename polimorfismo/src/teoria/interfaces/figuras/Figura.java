package teoria.interfaces.figuras;

import java.util.List;

public interface Figura {

    double PI = 3.14;
   // protected NombreFigura nombreFigura;

    /*public Figura(NombreFigura nombreFigura) {
        this.nombreFigura = nombreFigura;
    }*/
    NombreFigura getNombreFigura();

    double calcularPerimetro();

    double calcularArea();

    //método que devuelva la líneas de un fichero csv
    //nombre de la figura, perimetro, area
    default String devolverDatosParaCSV () {
        return String.format("%S;%.3f;%.3f",
                getNombreFigura(), calcularPerimetro(), calcularArea());
    }

    static Figura devolverFiguarMayorArea (List<Figura> listaFiguras) {
        Figura figuraMayorArea = null;
     //   double mayorArea = Double.MIN_VALUE; opción 1
        double mayorArea = -1;  //no puede haber áreas negativa
        for (Figura figura: listaFiguras) {
            if (figura.calcularArea() > mayorArea) {
                figuraMayorArea = figura;
                mayorArea = figura.calcularArea();
            }
        }
        return figuraMayorArea;
    }

}
