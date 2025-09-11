import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        String data = "SMELlY SMELLY SMELLY SMELLY WOOOOO";
        String fileName1 = "example.txt";
        String hiddenFileName2 = ".example2.txt";
        String hiddenFolderPath = ".hidden";
        String hiddenFolderFileName3 = "example3.txt";

        // 1. Using BufferedWriter
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName1))) {
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Make Hidden File
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(hiddenFileName2))) {
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Make Visible File In Hidden Folder
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(hiddenFolderPath, hiddenFolderFileName3)))) {
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File directory = new File("directory");
        if (!directory.exists()) {
            directory.mkdir();
        }
        

    }
}