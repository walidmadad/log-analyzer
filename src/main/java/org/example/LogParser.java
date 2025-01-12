package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser {
    private static final Pattern logPattern = Pattern.compile("\\[(.*?)\\] \\[(.*?)\\] (.*)");

    public static LogEntry parseLogLine(String logLine){
        Matcher matcher = logPattern.matcher(logLine);
        if(matcher.matches()){
            String date = matcher.group(1);
            String type = matcher.group(2);
            String message = matcher.group(3);
            return new LogEntry(date, type, message);
        }
        return null;
    }
}

record LogEntry(String date, String type, String message){ }