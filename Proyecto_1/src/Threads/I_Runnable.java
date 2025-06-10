package PACKAGE_NAME.Threads;

class Message implements Runnable { // ventaja de heredar de una clase y una interfaz al mismo tiempo

    public void run() {
        System.out.println("Hilo en ejecución");
    }
}

public class I_Runnable {

    public static void main(String[] args) {
        var object1 = new Message();
        var thread = new Thread(object1);
        thread.start();
    }
}
