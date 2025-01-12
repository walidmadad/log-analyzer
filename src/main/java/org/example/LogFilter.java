package org.example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Cette classe fournit des méthodes pour filtrer les logs selon des critères.
 */
public class LogFilter {

    /**
     * Filtre les logs pour ne garder que ceux d'un type spécifique (par exemple, ERROR).
     *
     * @param logs La liste des logs à filtrer.
     * @param type Le type de log à filtrer (par exemple, "ERROR").
     * @return Une liste de logs filtrée par type.
     */
    public static List<LogEntry> filterByType(List<LogEntry> logs, String type) {
        return logs.stream()
                .filter(log -> log.type().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }
}

