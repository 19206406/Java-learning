package PACKAGE_NAME.Arrays;

public class Arreglos_bucles_22 {
    public static void main(String[] args) {
        String[] productos = {"", "Martillo", "Destornillador", "Taladro", "Llave inglesa", "Pinzas"};

        /*for (int f = 0; f < productos.length; f++) {
            System.out.println("Producto: " + f + " " + productos[f]);
        }*/

        // recorrer array con bucle while
        int f = 0;
        while (f < productos.length) {
            System.out.println("Producto: " + productos[f]);
            f++;
        }
    }
}
