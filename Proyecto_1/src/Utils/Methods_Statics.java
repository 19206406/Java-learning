package PACKAGE_NAME.Utils;

class Mathematics {

    // metodo estatico
    public static int sum(int a, int b) {
        return a + b;
    }
}

public class Methods_Statics {

    public static void main(String[] args) {
        int result = Mathematics.sum(18, 19); // no necesitamos crear un objeto para utilizar el metodo
        System.out.println(result);
    }
}
