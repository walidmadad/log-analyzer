package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String filePath = Objects.requireNonNull(Main.class.getResource("/Sample.log")).getPath();

        try {
            List<String> result = FileManager.readLogFile(filePath);
            for (String line : result){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}