package by.epamtc.tsalko.main.controller;

import java.util.HashMap;
import java.util.Map;

public class lineParser {

    public Map<String, String> parsLine(String line) {
        Map<String, String> parameters = new HashMap<>();
        String lineParameters = line.replaceAll(".*: ", "").trim();

        for (String paramPair : lineParameters.split(",")) {
            String key = paramPair.replaceAll("=.*", "").trim();
            String value = paramPair.replaceAll(".*=", "").trim();
            parameters.put(key, value);
        }

        return parameters;
    }

}
