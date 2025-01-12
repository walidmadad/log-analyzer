package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cette classe est responsable de l'analyse des lignes de logs.
 * Elle utilise une expression régulière pour extraire la date, le type et le message de chaque ligne.
 */
public class LogParser {

    // Expression régulière pour extraire les informations des logs
    private static final Pattern logPattern = Pattern.compile("\\[(.*?)\\] \\[(.*?)\\] (.*)");

    /**
     * Analyse une ligne de log et retourne un objet LogEntry représentant les informations extraites.
     *
     * @param logLine La ligne de log à analyser.
     * @return Un objet LogEntry contenant la date, le type et le message du log.
     *         Retourne null si la ligne ne correspond pas au format attendu.
     */
    public static LogEntry parseLogLine(String logLine) {
        Matcher matcher = logPattern.matcher(logLine);
        if (matcher.matches()) {
            String date = matcher.group(1);
            String type = matcher.group(2);
            String message = matcher.group(3);
            return new LogEntry(date, type, message);
        }
        return null;  // Retourne null si le format de la ligne ne correspond pas.
    }
}

/**
 * Représente une entrée de log avec la date, le type et le message.
 * Ce type de données immuable permet de stocker de manière simple les informations essentielles d'un log.
 */
record LogEntry(String date, String type, String message) { }
