package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe gère la lecture des fichiers log.
 */
public class FileManager {

    /**
     * Lit un fichier log et retourne son contenu sous forme de liste de lignes.
     *
     * @param filePath Le chemin du fichier log à lire.
     * @return Une liste de chaînes représentant les lignes du fichier log.
     * @throws IOException Si une erreur d'entrée/sortie se produit lors de la lecture du fichier.
     */
    public static List<String> readLogFile(String filePath) throws IOException {
        List<String> logs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                logs.add(line);
            }
        }
        return logs;
    }
}

