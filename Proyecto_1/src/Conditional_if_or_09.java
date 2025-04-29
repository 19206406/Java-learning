package PACKAGE_NAME;

public class Conditional_if_or_09 {
    public static void main(String[] args) {
        boolean sunday = true;
        boolean vacation = true;
        boolean license = true;

        // Ingresando datos
        if (sunday == true || vacation == true || license) {
            System.out.println("Acceso deneagado a la empresa");
        } else {
            System.out.println("Acceso concedido");
        }
    }
}
