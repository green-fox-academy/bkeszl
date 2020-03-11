import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        Path toReverseFilePath = Paths.get("example-files/reversed-lines.txt");
        try {
            List<String> strsToReverse = Files.readAllLines(toReverseFilePath);
            List<String> strBack = new ArrayList<>();
            for (String line : strsToReverse) {
                strBack.add(reverseStr(line));
            }
            Files.write(toReverseFilePath, strBack);
        } catch (IOException a){
            a.printStackTrace();
        }

    }
    public static String reverseStr(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <input.length(); i++) {
            builder = builder.insert(i, input.charAt(input.length() - i - 1));
        }
        return builder.toString();
    }
}
