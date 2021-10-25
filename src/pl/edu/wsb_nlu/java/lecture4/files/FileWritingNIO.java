package pl.edu.wsb_nlu.java.lecture4.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWritingNIO {
    public static void main(String[] args) {
        Path path = Paths.get("file3.txt");
        try {
            Files.write(path, "I love Java!".getBytes());
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }

}
