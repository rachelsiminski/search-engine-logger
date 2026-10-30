package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    private static String action;

    public static void main(String[] args) {

        action = "Launch";

        logAction(action);


    }

    private static void logAction(String action){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logs.txt"));

            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String formattedDate = now.format(formatter);

            bufferedWriter.write(formattedDate + " " + action);

            //System.out.println(formattedDate);

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Error creating logs.txt file");
            //throw new RuntimeException(e);
        }

    }


}
