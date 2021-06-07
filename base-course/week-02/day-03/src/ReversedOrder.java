import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        Path toReverseFilePath = Paths.get("example-files/reversed-order.txt");
        try {
            List<String> fileContents = Files.readAllLines(toReverseFilePath);
            List<String> reversedContents = new ArrayList<>();
            for (int i = fileContents.size()-1; 0 <= i ; i--) {
                reversedContents.add(fileContents.get(i));
            }
            Files.write(toReverseFilePath, reversedContents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
