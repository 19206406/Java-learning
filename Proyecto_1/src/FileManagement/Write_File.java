package PACKAGE_NAME.FileManagement;

import java.io.FileWriter;
import java.io.IOException;

public class Write_File {

    public static void main(String[] args) {

        try {

            FileWriter writeFile = new FileWriter("ejemplo1.txt", true);
            writeFile.write("\nhay que aprender nuevas cosas");
            writeFile.close();
            System.out.println("Escritura exitosa");

        } catch (IOException e) {
            System.out.println("Error al insertar texto: " + "\n"
                    + e);
        }
    }
}
