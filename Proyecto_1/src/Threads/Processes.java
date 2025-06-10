package PACKAGE_NAME.Threads;

class Process1 extends Thread { // heredar de la clase para trabajar

    public void run() { // definicion del hilo
        /*for (int i = 0; i < 5; i++) {
            System.out.println("Procesando..." + i);
        }*/

        System.out.println("Analizando datos...");

        try {
            Thread.sleep(3000); // 3segundos
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Cargando datos...");

        try {
            Thread.sleep(3000); // 3segundos
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Carga finalizada...");
    }
}

public class Processes {

    public static void main(String[] args) {
        var thread1 = new Process1();
        thread1.start(); // inicia el hilo
    }
}
