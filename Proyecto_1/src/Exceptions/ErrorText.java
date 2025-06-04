package PACKAGE_NAME.Exceptions;

import java.util.Scanner;

public class ErrorText {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad");
        String amount = input.next();

        try {
            int number = Integer.parseInt(amount);
            System.out.println("Cantidad convertida: " + amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
            System.out.println("El valor no es una cantidad númerica");
        }
    }
}
