import java.util.Scanner;

public class InputData_04 {
    public static void main(String[] args) {
        String name;
        int age;

        // Ingreso de datos
        Scanner get = new Scanner(System.in);
        System.out.println("Escribe tu nombre...");
        name = get.next();
        System.out.println("Escribe tu edad...");
        age = get.nextInt();

        // Salida de datos
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
