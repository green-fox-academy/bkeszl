import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"
        try {
            Path myFilePath = Paths.get("example-files/my-file.txt");
            List<String> myFile = Files.readAllLines(myFilePath);
            for (String line: myFile
                 ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }

    }
}