package pl.edu.wsb_nlu.java.lecture4.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));
        writer.write("My message");
        writer.close();
    }
}
