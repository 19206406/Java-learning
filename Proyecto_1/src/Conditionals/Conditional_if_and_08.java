package PACKAGE_NAME.Conditionals;

import javax.swing.*;

public class Conditional_if_and_08 {
    public static void main(String[] args) {
        String name;
        int age;

        name = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");
        String age2 = JOptionPane.showInputDialog(null, "Ingresa tu edad: ");
        age = Integer.parseInt(age2);

        // analizando datos
        if (age >= 18 && age <= 59) {
            JOptionPane.showMessageDialog(null, "La persona es mayor de edad");
        }

        if (age >= 60) {
            JOptionPane.showMessageDialog(null, "Eres de la tercera edad");
        } else {
            JOptionPane.showMessageDialog(null, "La persona es menor de edad");
        }
    }
}
