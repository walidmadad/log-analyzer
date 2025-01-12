package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogStats {

    public static Map<String, Integer> getStats(List<LogEntry> logs) {
        Map<String, Integer> stats = new HashMap<>();
        for (LogEntry log : logs) {
            stats.put(log.type(), stats.getOrDefault(log.type(), 0) + 1);
        }
        return stats;
    }
}

