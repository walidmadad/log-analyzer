package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class LogFilter {

    public static List<LogEntry> filterByType(List<LogEntry> logs, String type) {
        return logs.stream()
                .filter(log -> log.type().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }
}

