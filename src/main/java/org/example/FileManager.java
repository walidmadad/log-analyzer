package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static List<String> readLogFile(String filePath) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<String> logs = new ArrayList<>();
            String line;
            while((line = br.readLine()) != null){
                logs.add(line);
            }
            return logs;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
