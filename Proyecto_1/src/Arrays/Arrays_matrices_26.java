package PACKAGE_NAME.Arrays;

import java.util.Arrays;

public class Arrays_matrices_26 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];

        // filling row 1 of the matrix
        numbers[0][0] = 8;
        numbers[0][1] = 7;
        numbers[0][2] = 4;

        // filling row 2 of the matrix
        numbers[1][0] = 5;
        numbers[1][1] = 3;
        numbers[1][2] = 1;

        // filling row 3 of the matrix
        numbers[2][0] = 2;
        numbers[2][1] = 8;
        numbers[2][2] = 6;

        System.out.println(Arrays.toString(numbers[1]));
    }
}
