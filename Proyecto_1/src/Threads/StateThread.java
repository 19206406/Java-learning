package PACKAGE_NAME.Threads;

import java.sql.SQLOutput;

class ThreadMonitor extends Thread {

    public void run() {
        System.out.println("Estado del hilo al comenzar: " + this.getState());

        try {
            // El hilo entra en estado Runnable cuando se llama start
            for (int i = 0; i < 5; i++) {
                System.out.println("Hilo en ejecución: " + i);
                Thread.sleep(2000); // el hilo entra en estado TIMED_WAITING
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Estado del hilo al terminar: " + this.getState());
    }
}

public class StateThread {

    public static void main(String[] args) {

        var thread = new ThreadMonitor();
        System.out.println("Estado del hilo despues de creado: " + thread.getState());
        thread.start(); // hilo RUNNABLE

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Estado luego de esperar: " + thread.getState());

        try {
            thread.join(); // espera a que el hilo termine
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Estado al finalizar el hilo 2: " + thread.getState());
    }
}
