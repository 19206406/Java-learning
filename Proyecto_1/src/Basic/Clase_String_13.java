package PACKAGE_NAME.Basic;

import java.util.Scanner;

public class Clase_String_13 {
    public static void main(String[] args) {
        String word1, word2;
        Scanner input = new Scanner(System.in);

        // ingreso de datos
        System.out.println("Ingrese primera palabra...");
        word1 = input.next();
        System.out.println("Ingrese segunda palabra...");
        word2 = input.next();

        // comparar texto
        if (word1.equals(word2)) {
            System.out.println(word1 + " es igual a: " + word2);
        } else {
            System.out.println(word1 + " no es igual a: " + word2);
        }

        // compara textos sin tomar en cuenta mayusculas
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println(word1 + " es igual a: " + word2 + "\n" +
                    " sin tomar en cuenta las mayusculas");
        } else {
            System.out.println(word1 + " no es igual a: " + word2 + "\n" +
                    " sin tomar en cuenta las mayusculas");
        }

        // compara cantidad de caracteres
        if (word1.compareTo(word2) == 0) {
            System.out.println(word1 + " tiene las mismas letras que: " + word2);
        } else {
            if (word1.compareTo(word2) > 0) {
                System.out.println(word1 + " tiene mas letras que: " + word2);
            } else {
                System.out.println(word1 + " tiene menos letras que: " + word2);
            }
        }

        // saber caracter de una posición
        char character = word1.charAt(0);
        System.out.println("posición " + word1 + ": " + character);

        // Cantidad de caracteres de una palabra o palabra
        System.out.println("Cantidad de caracteres " + word1 + ": " + word1.length());
        System.out.println("Cantidad de caracteres " + word2 + ": " + word2.length());

        // identificar varios caractes en un texto o palabra
        System.out.println("Primeras 3 letras: " + word1.substring(0, 3));

        // Buscar caracteres que coincidan en dos palabras
        int coincidence = word1.indexOf(word2);
        if ( coincidence == -1 ) {
            System.out.println(word1 + " no contiene: " + word2);
        } else {
            System.out.println(word1 + " tiene coincidencia con: " + word2);
        }

        // llevar a mayuscula
        System.out.println(word1 + " en mayúscula es: " + word1.toUpperCase());

        //llevar a minusculas
        System.out.println(word1 + " en minuscula es: " + word1.toLowerCase());
    }
}
