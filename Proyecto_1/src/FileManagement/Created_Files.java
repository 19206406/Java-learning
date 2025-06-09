package PACKAGE_NAME.FileManagement;

import java.io.File;
import java.io.IOException;

public class Created_Files {

    public static void main(String[] args) {

        // definicion variable del archivo
        File file = new File("ejemplo1.txt");

        if (file.exists()) {
            System.out.println("El archivo ya existe");
        } else {
            try {
                // crear el archivo
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("Archivo creado: " + file.getName());
                } else {
                    System.out.println("Error creando archivo");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
