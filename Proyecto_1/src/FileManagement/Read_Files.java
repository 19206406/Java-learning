package PACKAGE_NAME.FileManagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Read_Files {

    public static void main(String[] args) {

        try {

            File file = new File("ejemplo1.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
