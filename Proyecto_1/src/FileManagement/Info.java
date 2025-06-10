package PACKAGE_NAME.FileManagement;

import java.io.File;
import java.text.SimpleDateFormat;

public class Info {

    public static void main(String[] args) {

        // ruta absoluta del archivo
        File infoFile = new File("C:/Users/SURREGO03-0264/IdeaProjects/Java-learning/Proyecto_1/src/Registers.txt");

        if (infoFile.exists()) {
            System.out.println("Nombre archivo: " + infoFile.getName());
            System.out.println("Ruta: " + infoFile.getParent());
            System.out.println("Puede leerse?: " + infoFile.canRead());
            System.out.println("Puede ejecutarse?: " + infoFile.canExecute()); // puede abrise ?
            System.out.println("Tamaño: " + infoFile.length());

            // ver si es un directorio

            boolean isDirectory = infoFile.isDirectory();
            System.out.println("Es directorio?: " + isDirectory);

            // ver si es archivo
            System.out.println("Es archivo: " + infoFile.isFile());

            // ultima fecha de modificacion
            System.out.println("Ultimo update: " + infoFile.lastModified());

            // Formatear fecha
            var dateModif = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateModif2 = dateModif.format(infoFile.lastModified());

            System.out.println("Ultimo update: " + dateModif2);

        } else {
            System.out.println("El archivo no existe");
        }
    }
}
