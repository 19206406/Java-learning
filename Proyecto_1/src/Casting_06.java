package PACKAGE_NAME;

public class Casting_06 {
    public static void main(String[] args) {
        // De texto a entero
        String numeroTexto = "123";
        int numeroEntero = Integer.parseInt(numeroTexto);
        System.out.println("Numero entero: " + numeroEntero);

        // Entero a texto
        int entero = 456;
        String enteroTexto = String.valueOf(entero);
        System.out.println("Texto: " + enteroTexto);

        // doble a entero
        double numeroDoble = 45.50;
        int dobleEntero = (int)numeroDoble;
        System.out.println("De doble a entero: " + dobleEntero);

        // de entero a doble
        int entero2 = 789;
        double enteroDoble = (double)entero2;
        System.out.println("De entero a doble: " + enteroDoble);
    }
}
