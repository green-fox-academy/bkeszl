import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Double {
    public static void main(String[] args) {
        Path doubles = Paths.get("example-files/duplicated-chars.txt");
        try {
            List<String> lines = Files.readAllLines(doubles);
            List<String> newLines = new ArrayList<>();
            for (String line:lines) {
                //List<Character> srtChars = new ArrayList<>();
                String strChars = "";
                for (int i = 0; i <line.length() ; i+=2) {
                   strChars = strChars.concat(String.valueOf(line.charAt(i)));
                }
                newLines.add(strChars);
            }
            Files.write(Paths.get("example-files/not-anymore-duplicated-chars.txt"), newLines);
        } catch (IOException ignored) {

        }
    }
}
