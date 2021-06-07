import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Path fileOne = Paths.get("example-files/my-file.txt");
        Path fileTwo = Paths.get("example-files/copy-file.txt");

        System.out.println(copyFile(fileOne, fileTwo));

    }
    public static boolean copyFile(Path fromThis, Path toThis) throws IOException {
        List<String> toCopy = Files.readAllLines(fromThis);
        try {
            Files.write(toThis, toCopy);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
