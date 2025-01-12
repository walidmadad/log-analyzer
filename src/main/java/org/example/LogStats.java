package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Cette classe calcule des statistiques sur les logs.
 */
public class LogStats {

    /**
     * Calcule les statistiques des logs en comptant le nombre d'occurrences de chaque type de log.
     *
     * @param logs La liste des logs à analyser.
     * @return Un map avec les types de log en clés et le nombre d'occurrences en valeurs.
     */
    public static Map<String, Integer> getStats(List<LogEntry> logs) {
        Map<String, Integer> stats = new HashMap<>();
        for (LogEntry log : logs) {
            stats.put(log.type(), stats.getOrDefault(log.type(), 0) + 1);
        }
        return stats;
    }
}

