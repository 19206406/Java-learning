package PACKAGE_NAME.Loops;

import javax.swing.*;

public class Loop_While_Exercice_19 {
    public static void main(String[] args) {
        final String u_correct = "Usuario01";
        final String p_correct = "Abc123%";

        String username;
        String password;

        int attemps = 0;
        final int max_attemps = 3;

        while (attemps < max_attemps) {
            username = JOptionPane.showInputDialog(null, "Ingrese nombre de usuario...");
            password = JOptionPane.showInputDialog(null, "Ingrese su contraseña...");

            if (username.equals(u_correct) && password.equals(p_correct)) {
                JOptionPane.showMessageDialog(null, "Acceso Correcto!" + "\n" +
                        " Bienvenid@ " + " " + u_correct);
                break;
            } else {
                attemps++;
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos " + "\n" +
                        " Intente de nuevo...");
            }

            if (attemps > 2) {
                JOptionPane.showMessageDialog(null, "Intentos de acceso excedidos " + "\n" +
                        "Contacte a soporte");
            }
        }
    }
}
