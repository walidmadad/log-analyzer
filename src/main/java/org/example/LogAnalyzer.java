package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LogAnalyzer {

    public static void main(String[] args) {
        String filePath = Objects.requireNonNull(LogAnalyzer.class.getResource("/Sample.log")).getPath(); // Exemple de fichier log

        try {
            // Charger les logs depuis le fichier
            List<String> logLines = FileManager.readLogFile(filePath);

            // Parser les logs en objets LogEntry
            List<LogEntry> logs = logLines.stream()
                    .map(LogParser::parseLogLine)
                    .filter(log -> log != null)
                    .toList();

            // Afficher tous les logs
            logs.forEach(System.out::println);

            // Filtrer les logs d'erreurs (ERROR)
            List<LogEntry> errors = LogFilter.filterByType(logs, "ERROR");
            System.out.println("\nErrors:");
            errors.forEach(System.out::println);

            // Afficher les statistiques des logs
            Map<String, Integer> stats = LogStats.getStats(logs);
            System.out.println("\nStatistics:");
            stats.forEach((type, count) -> System.out.println(type + ": " + count));
        } catch (IOException e) {
            System.err.println("Error reading the log file: " + e.getMessage());
        }
    }
}

