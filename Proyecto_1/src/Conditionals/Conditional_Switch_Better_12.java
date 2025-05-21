package PACKAGE_NAME.Conditionals;

import java.util.Scanner;

public class Conditional_Switch_Better_12 {
    public static void main(String[] args) {
        int dayWeek;
        Scanner input = new Scanner(System.in);

        // Ingresando datos
        System.out.println("Ingrese día a consultar");
        dayWeek = input.nextInt(); // valores enteros en consola

        switch (dayWeek) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia incorrecto, información erronea");
        }
    }
}
