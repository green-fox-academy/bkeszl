import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Logs {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    public static void main(String[] args) {
        Path filePath = Paths.get("example-files/logs.txt");



    }
    public static String[] unique(Path input) {
        try {
            List<String> logList = Files.readAllLines(input);
            List<String> ipAdresses = new ArrayList<>();
            for (String line: logList) {
                ipAdresses.add(line.substring(26,37));
            }
            Collections.sort(ipAdresses);
            List<String> ipAdressesUnique = ipAdresses.stream().distinct().collect(Collectors.toList());


        } catch (IOException a) {
            a.printStackTrace();
        }

        return returnArray;
    }
}
