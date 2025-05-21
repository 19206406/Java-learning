package PACKAGE_NAME.Loops;

import javax.swing.*;

public class Loop_For_Exercices_20 {
    public static void main(String[] args) {

        boolean validate = false;

        for (int f = 0; !validate; f++) {
            String email = JOptionPane.showInputDialog(null, "Ingresa tu email... ");;

            if (email.contains("@") && email.endsWith(".com")) {
                JOptionPane.showMessageDialog(null, "Email ingresado correctamente");
                validate = true;
            } else if (!email.contains("@")) {
                JOptionPane.showMessageDialog(null, "Email no valido " + "\n" +
                        "Debe de ingresar arroba");
            } else {
                JOptionPane.showMessageDialog(null, "Email no válido " + "\n" +
                        "Debe de ingresar el .com");
            }
        }
    }
}
