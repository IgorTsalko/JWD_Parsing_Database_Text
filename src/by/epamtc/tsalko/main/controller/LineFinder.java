package by.epamtc.tsalko.main.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LineFinder {

    private Path filePath = Paths.get("E:/Studies/Java/testFolder/appliances_db.txt");

    public List<String> findSuitableLines(String deviceName, String[] parameters) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader fileReader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                if (line.startsWith(deviceName) && checkForParameters(line, parameters)) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    private boolean checkForParameters(String line, String[] parameters) {
        boolean result = true;

        for (String param : parameters) {
            if (!line.contains(param)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
