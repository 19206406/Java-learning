package PACKAGE_NAME.Loops;

public class Break_Continue_18 {
    public static void main(String[] args) {
        int kontrolle = 0;
        int f = 0;

        System.out.println("Cargando registros...");
        while (f <= 10) {
            System.out.println("Ciclo: " + f);
            f++;
            if (f == 7) {
                System.out.println("Error de carga, saliendo del sistema");
                break;
            }
        }
        System.out.println("Fin del bucle!");


        for (f = 0; f <= 20; f++) {
            if (f%2 == 0) {
                continue;
            }
            System.out.println("Valor: " + f);
        }
    }
}
