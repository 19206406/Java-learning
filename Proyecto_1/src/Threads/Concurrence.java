package PACKAGE_NAME.Threads;

class Greet extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Saludos a todos");
        }
    }
}

class Dismiss extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Adios a todos");
        }
    }
}

public class Concurrence {

    public static void main(String[] args) {
        var greet = new Greet();
        var dismiss = new Dismiss();

        // se estan mostrando en orden pero puede ser diferente x
        greet.run(); // inicio del hilo
        dismiss.run(); // inicio del hilo
    }
}
