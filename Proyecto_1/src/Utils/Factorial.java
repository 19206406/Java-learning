package PACKAGE_NAME.Utils;

public class Factorial {

    public int factorial(int n) {
        System.out.println(n);
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        var value = new Factorial();
        System.out.println(value.factorial(5));
    }
}
