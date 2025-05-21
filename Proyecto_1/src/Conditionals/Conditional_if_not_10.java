package PACKAGE_NAME.Conditionals;

public class Conditional_if_not_10 {
    public static void main(String[] args) {
        System.out.println("===Monitoreo del sistema===");
        var online = false;

        if (!online) {
            System.out.println("Sistema fuera de linea");
        } else {
            System.out.println("Sistema en linea");
        }
    }
}
