package PACKAGE_NAME;

import java.util.Scanner;

public class Loop_Do_While_16 {
    public static void main(String[] args) {

        int counter = 1;
        final var value = 5;
        Scanner input = new Scanner(System.in);

        // bucle do while
        //do {
        //    System.out.println("value: " + counter++);
        //} while (counter <= value);
        //System.out.println("Fin del bucle");


        // EJERCICIO CON DO WHILE
        int number = 0;
        int errores = 0;

        do {
            System.out.println("Ingrese el numero 5...");
            number = input.nextInt();

            if (number != 5) {
                System.out.println("No ingresaste el numero 5");
                errores++;
            }
        } while (number != 5);

        System.out.println("Gracias!, fallaste: " + errores + " veces");
    }
}
