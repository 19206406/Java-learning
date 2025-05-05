package PACKAGE_NAME;

public class Loop_For_17 {
    public static void main(String[] args) {

        // bucle ascendente
        //System.out.println("Bucle ascendente");
        //for (int i = 0; i <= 10; i++) {
        //    System.out.println("Vuelta No.: " + i);
        //}
        //System.out.println("Fin de bucle!");
        //System.out.println("");
//
        //// bucle descendente
        //System.out.println("Bucle descendente");
        //for (int i = 10; i >= 0; i--) {
        //    System.out.println("Vuelta No.: " + i);
        //}
        //System.out.println("Fin de bucle!");
        //System.out.println("");

        int suma = 0;
        System.out.println("Sumando valores...");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                suma += i;
                System.out.println("Valor sumado: " + i);
            }
        }

        System.out.println("Fin de la operación");
        System.out.println("Suma de pares: " + suma);
    }
}
