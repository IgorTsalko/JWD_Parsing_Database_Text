package by.epamtc.tsalko.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParserDatabaseText {

    private Path filePath = Paths.get("E:/Studies/Java/testFolder/appliances_db.txt");

    public List<Device> findDevices(String name, String parameter, String parameterValue) {
        List<Device> devices = new ArrayList<>();

        try (BufferedReader fileReader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                if (line.startsWith(name) && line.contains(parameter + "=" + parameterValue)) {
                    devices.add(createDevice(line, name));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return devices;
    }

    private Device createDevice(String line, String name) {
        Map<String, String> parameters = createParameters(line);

        return switch (name) {
            case "Laptop" -> new Laptop(parameters);
            case "Oven" -> new Oven(parameters);
            case "Refrigerator" -> new Refrigerator(parameters);
            case "Speakers" -> new Speakers(parameters);
            case "TabletPC" -> new TabletPC(parameters);
            case "VacuumCleaner" -> new VacuumCleaner(parameters);
            default -> null;
        };

    }

    private Map<String, String> createParameters(String line) {
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
