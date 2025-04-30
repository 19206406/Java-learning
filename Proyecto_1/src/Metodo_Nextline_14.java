package PACKAGE_NAME;

import java.util.Scanner;

public class Metodo_Nextline_14 {
    public static void main(String[] args) {
        String text1, text2;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese texto1...");
        text1 = input.nextLine();
        System.out.println("Ingrese texto2...");
        text2 = input.nextLine();

        System.out.println(text1);
        System.out.println(text2);
    }
}
