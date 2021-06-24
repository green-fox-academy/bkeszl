package com.gfa;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Path scorePath = Paths.get("C:\\Users\\keszl\\Desktop\\dev\\greenfox\\bkeszl\\test-automation\\week-03\\day-04\\scores.txt");
        Path namePath = Paths.get(".\\names.txt");
        Path agnosticPath = Paths.get("src" + File.separator + "osAgnosticFile.csv");
        Path configPath = Paths.get("config.txt");

        List<String> names = new ArrayList<>();

//        try {
//             names = Files.readAllLines(namePath);
//        } catch (IOException e) {
//            System.out.println("cant find the name file");
//            e.printStackTrace();
//        }
//
//        System.out.println(names);
//
//        List<String> toAppend = new ArrayList<>(Arrays.asList("Antal"));
//
//        try {
//            Files.write(namePath, toAppend, StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            names = Files.readAllLines(namePath);
//        } catch (IOException e) {
//            System.out.println("cant find the name file");
//            e.printStackTrace();
//        }
//
//        System.out.println(names);
//
////        try {
////            Files.copy(namePath, scorePath);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
////        try {
////            Files.write(configPath, names);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        try {
//            Files.deleteIfExists(configPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        try {
////            Files.move(scorePath, Paths.get("src/scores.txt"), StandardCopyOption.REPLACE_EXISTING);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        try {
//            Files.move(Paths.get("src/scores.txt"),Paths.get("src/scoreboard.txt"),  StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//

        try {
            names = Files.readAllLines(namePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int antalCount = 0;

        for (String name:names) {
            if (name.equals("Antal") || name.equals("Tóni")){
                antalCount++;
            }
        }

        System.out.println(antalCount);


        try {
            List<String> scoreBoard = Files.readAllLines(agnosticPath);
            HashMap<String, Integer> goals = new HashMap<>();

            for (int i = 1; i < scoreBoard.size(); i++) {
                String[] fields = scoreBoard.get(i).split(";");
                goals.put(fields[0], Integer.parseInt(fields[1]));
            }

            System.out.println(goals);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
