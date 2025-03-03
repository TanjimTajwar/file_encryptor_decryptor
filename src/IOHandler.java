import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOHandler {
    public String readFile(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

    public void writeFile(String filePath, String data) {
        try {
            Files.write(Paths.get(filePath), data.getBytes());
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
