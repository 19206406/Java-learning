package PACKAGE_NAME.Arrays;

import java.util.Arrays;

public class Arrays_Methods_25 {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 2, 5, 4, 3, 4, 5, 6, 7, 8};
        String[] chars = {"b", "a", "f", "s", "e"};

        // ver valores como texto
        System.out.println("Array original: " + Arrays.toString(numbers));

        // organizar un array de enteros
        Arrays.sort(numbers);
        System.out.println("Arrary organizado: " + Arrays.toString(numbers));
        Arrays.sort(chars);
        System.out.println("Array organizado: " + Arrays.toString(chars));

        // compara valores de arrays
        int[] numbers1 = { 1, 2, 3 };
        int[] numbers2 = { 1, 2, 3 };

        boolean equalsArrays = Arrays.equals(numbers1, numbers2);
        System.out.println("Son iguales: " + equalsArrays);

        // como llenar un array automaticamente
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 1);
        System.out.println("Llenado: " + Arrays.toString(fillArray));

        // como copiar un array
        int[] original = { 18, 19, 17 };
        int[] copy = Arrays.copyOf(original, 3);
        System.out.println("Copiado: " + Arrays.toString(copy));
    }
}
