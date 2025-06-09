package PACKAGE_NAME.FileManagement;

import java.io.File;

public class Delete_Files {

    public static void main(String[] args) {

        File file = new File("ejemplo1.txt");

        if(file.delete()) {
            System.out.println("Archivo borrado: " + file.getName());
        } else {
            System.out.println("No se pudo borrar el archivo");
        }
    }
}
