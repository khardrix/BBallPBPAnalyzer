package com.bball.analyzer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
//        // Path inside resources (relative to resources root)
////        String filePath = "WNBA_GAMES/NYL/NYL-at-ATL_08232025.csv";
////
////        // Load as stream
////        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(filePath);
////
////        if (inputStream == null) {
////            System.out.println("File not found: " + filePath);
////            return;
////        }
////
////        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
////            String line;
////            while ((line = reader.readLine()) != null) {
////                System.out.println(line);                                               // Print each line of CSV
////            }
////        } catch (Exception e) {
////            e.printStackTrace();
////        }

        String filePath = "WNBA_GAMES/NYL/NYL-at-ATL_08232025.csv";

        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(filePath);
        if (inputStream == null) {
            System.out.println("File not found: " + filePath);
            return;
        }

        PlayParser parser = new PlayParser();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                parser.parsePlay(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print all player stats at end
        parser.printAllStats();
    }
}
