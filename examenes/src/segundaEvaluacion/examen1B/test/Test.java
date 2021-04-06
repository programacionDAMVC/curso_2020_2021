package segundaEvaluacion.examen1B.test;

import segundaEvaluacion.examen1B.clases_base.Empresa;
import segundaEvaluacion.examen1B.clases_base.Producto;
import segundaEvaluacion.examen1B.clases_base.Utilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nombre de la empresa");
        String nombreEmpresa = sc.nextLine();
        String cif;
        while (true){
            System.out.println("cif de la empresa");
            cif = sc.nextLine();
            if (Utilidades.validarCIF(cif))
                break;
        }
        System.out.println("introduce localidad");
        String localidad = sc.nextLine();
        Empresa empresa = new Empresa(nombreEmpresa, cif, localidad);
        List<Producto> productos = new ArrayList<>();
        while (productos.size() < 2) {
            System.out.println("introduce nombre producto");
            String nombreProducto = sc.nextLine();
            double dPrecio;
            String sPrecio;
            while (true){
                System.out.println("introduce precio válido");
                sPrecio = sc.nextLine();
                if (sPrecio.matches("(0|[1-9][0-9]{1,3})(\\.[0-9]{1,2})?")) {
                    dPrecio = Double.parseDouble(sPrecio);
                    break;
                }
            }
            String codigo;
            while (true) {
                System.out.println("introduce código producto válido");
                codigo = sc.nextLine();
                if (Utilidades.validarCodigo(codigo))
                    break;
            }
            productos.add(new Producto(nombreProducto, dPrecio, codigo));

        }
        System.out.println(empresa);
        for (Producto producto: productos ) {
            System.out.println(producto);
        }

    }
}
