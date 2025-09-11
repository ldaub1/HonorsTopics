import java.io.FileWriter;

public class FileReader {
    try (FileWriter writer = new FileWriter(".EVIL.txt")) {

    } catch (IOException e) {
        
    }
}
