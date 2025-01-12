package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A utility class for managing file operations.
 *
 * <p>This class provides methods to handle file operations such as reading the contents
 * of a log file and returning its lines as a list of strings.</p>
 */
public class FileManager {

    /**
     * Reads a log file from the specified file path and returns its contents as a list of strings.
     *
     * <p>Each line of the log file is added as an element in the returned list.</p>
     *
     * @param filePath The path of the log file to be read.
     * @return A list of strings where each string represents a line from the log file.
     * @throws IOException If an I/O error occurs while reading the file.
     * @throws RuntimeException If an error occurs during file reading.
     */
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
