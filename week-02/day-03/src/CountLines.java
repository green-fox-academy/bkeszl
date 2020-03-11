import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String fileName = "example-files/my-file.txt";
        System.out.println(countLines(fileName));
    }

    private static int countLines(String input) {
        int lineCount = 0;
        try {
            Path myFilePath = Paths.get(input);
            List<String> myFileLines = Files.readAllLines(myFilePath);
            for (String line: myFileLines) {
                lineCount++;
            }
            return lineCount;
        } catch (IOException e) {
            return 0;
        }
    }
}
