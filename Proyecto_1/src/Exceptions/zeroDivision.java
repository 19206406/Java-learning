package PACKAGE_NAME.Exceptions;

import java.util.Scanner;

public class zeroDivision {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese valor 1....");
        int value1 = input.nextInt();
        System.out.println("Ingrese valor 2...");
        int value2 = input.nextInt();

        try {
            int result = value1 / value2;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) { // ArithmeticException
            System.out.println("Error: " + e);
            System.out.println("No se puede divir por cero");
        }
    }
}
