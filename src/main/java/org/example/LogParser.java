package org.example;

import java.util.regex.Pattern;

public class LogParser {
    private static final Pattern logPattern = Pattern.compile("\\[(.*?)\\] \\[(.*?)\\] (.*)");
}

class LogEntry{
    private final String date, type, message;

    public LogEntry(String date, String type, String message){
        this.date = date;
        this.type = type;
        this.message = message;
    }

    public String getType(){return type;}
    public String getDate(){return date;}
    public String getMessage(){return message;}
}