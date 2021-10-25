package pl.edu.wsb_nlu.java.lecture4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadingNIO {
    public static void main(String[] args) {
        Path path = Paths.get("file.txt");
        try {
            List<String> stringList = Files.readAllLines(path);
            for (String s: stringList)
                System.out.println(s);
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
