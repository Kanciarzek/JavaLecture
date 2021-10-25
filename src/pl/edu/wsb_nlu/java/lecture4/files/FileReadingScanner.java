package pl.edu.wsb_nlu.java.lecture4.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingScanner {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("file.txt"));
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
