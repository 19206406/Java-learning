import javax.swing.*;

public class Joptionpane_05 {
    public static void main(String[] args) {

        // Ingreso de datos con una forma grafica

        String name;
        int age;

        // Ingreso de datos

        name = JOptionPane.showInputDialog(null, "Ingrese su nombre...");
        String age2 = JOptionPane.showInputDialog(null, "Ingrese su edad...");
        age = Integer.parseInt(age2);


        // mostramos datos
        JOptionPane.showMessageDialog(null, "name: " + name + "\n" + "age: " + age);
    }
}
