import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Path myPath = Paths.get("example-files/my-file.txt");
        int num = 6;
        String str = "beefycake";

        try {
            writeLines(myPath, num, str);
        } catch (IOException e) {
            System.out.println("Im not raising any errors :)");
        }
    }
    public static void writeLines(Path inPath, int inInt, String inString) throws IOException {
        List<String> stringsToWrite = new ArrayList<>();
        for (int i = 0; i <inInt ; i++) {
            stringsToWrite.add(inString);
        }
        Files.write(inPath, stringsToWrite);
    }
}
