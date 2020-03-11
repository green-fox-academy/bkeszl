import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        try {
            Path myFilePath = Paths.get("example-files/my-file.txt");
            List<String> linesOfMyFile = Files.readAllLines(myFilePath);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Gimme a name to write: ");
            String input = scanner.nextLine();
            linesOfMyFile.add(input);
            Files.write(myFilePath, linesOfMyFile);

        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}