import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        String data = "My first name is lauren.\nMy middle name is madision.\nMy last name is daub.";
        String fileName1 = "aboutMe.txt";

        // 1. Using BufferedWriter
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName1))) {
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}