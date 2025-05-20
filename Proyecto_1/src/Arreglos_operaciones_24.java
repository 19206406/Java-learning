package PACKAGE_NAME;

public class Arreglos_operaciones_24 {
    public static void main(String[] args) {
        int ventas1[] = {500, 600, 400, 100, 650};
        int ventas2[] = {600, 800, 500, 350, 900};
        int total[] = new int[ventas1.length];
        int suma = 0;

        System.out.println("Suma de valores");
        for (int i = 0; i < ventas1.length; i++) {
            total[i] = ventas1[i] + ventas2[i];
            suma += total[i];
            System.out.println(total[i]);
        }

        System.out.println("Suma total = " + suma);

        System.out.println("Resta de valores");
        for (int i = 0; i < ventas1.length; i++) {
            total[i] = ventas1[i] - ventas2[i];
            suma += total[i];
            System.out.println(total[i]);
        }
    }
}
