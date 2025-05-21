package PACKAGE_NAME.Arrays;

public class Arrays_matrices_27 {
    public static void main(String[] args) {
        int[][] quantities = {
                {10, 20, 80},
                {50, 70, 60},
                {40, 30, 90}
        };

        for (int i = 0; i < quantities.length; i++) {
            for (int j = 0; j < quantities.length; j++) {
                System.out.println(quantities[i][j]);
            }
            System.out.println(" ");
        }
    }
}
