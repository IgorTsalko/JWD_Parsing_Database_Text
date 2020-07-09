package by.epamtc.tsalko.main.controller;

import by.epamtc.tsalko.main.model.*;

import java.util.Map;

public class DeviceFactory {

    public Device createDevice(String deviceName, Map<String, String> parameters) {
        return switch (deviceName) {
            case "Laptop" -> createLaptop(parameters);
            case "Oven" -> createOven(parameters);
            case "Refrigerator" -> createRefrigerator(parameters);
            case "Speakers" -> createSpeakers(parameters);
            case "TabletPC" -> createTabletPC(parameters);
            case "VacuumCleaner" -> createVacuumCleaner(parameters);
            default -> null;
        };
    }

    private Laptop createLaptop(Map<String, String> parameters) {
        double batteryCapacity = Double.parseDouble(parameters.get("BATTERY_CAPACITY"));
        String OS = parameters.get("OS");
        double memoryRom = Double.parseDouble(parameters.get("MEMORY_ROM"));
        double systemMemory = Double.parseDouble(parameters.get("SYSTEM_MEMORY"));
        double CPU = Double.parseDouble(parameters.get("CPU"));
        double displayInchs = Double.parseDouble(parameters.get("DISPLAY_INCHS"));

        return new Laptop(batteryCapacity, OS, memoryRom, systemMemory, CPU, displayInchs);
    }

    private Oven createOven(Map<String, String> parameters) {
        double powerConsumption = Double.parseDouble(parameters.get("POWER_CONSUMPTION"));
        double weight = Double.parseDouble(parameters.get("WEIGHT"));
        double capacity = Double.parseDouble(parameters.get("CAPACITY"));
        double depth = Double.parseDouble(parameters.get("DEPTH"));
        double height = Double.parseDouble(parameters.get("HEIGHT"));
        double width = Double.parseDouble(parameters.get("WIDTH"));

        return new Oven(powerConsumption, weight, capacity, depth, height, width);
    }

    private Refrigerator createRefrigerator(Map<String, String> parameters) {
        double powerConsumption = Double.parseDouble(parameters.get("POWER_CONSUMPTION"));
        double weight = Double.parseDouble(parameters.get("WEIGHT"));
        double freezerCapacity = Double.parseDouble(parameters.get("FREEZER_CAPACITY"));
        double overallCapacity = Double.parseDouble(parameters.get("OVERALL_CAPACITY"));
        double height = Double.parseDouble(parameters.get("HEIGHT"));
        double width = Double.parseDouble(parameters.get("WIDTH"));

        return new Refrigerator(powerConsumption, weight,freezerCapacity,
                                overallCapacity,height, width);
    }

    private Speakers createSpeakers(Map<String, String> parameters) {
        double powerConsumption = Double.parseDouble(parameters.get("POWER_CONSUMPTION"));
        double numberOfSpeakers = Double.parseDouble(parameters.get("NUMBER_OF_SPEAKERS"));
        String frequencyRange = parameters.get("FREQUENCY_RANGE");
        double cordLength = Double.parseDouble(parameters.get("CORD_LENGTH"));

        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    private TabletPC createTabletPC(Map<String, String> parameters) {
        double batteryCapacity = Double.parseDouble(parameters.get("BATTERY_CAPACITY"));
        double displayInches = Double.parseDouble(parameters.get("DISPLAY_INCHES"));
        double memoryRom = Double.parseDouble(parameters.get("MEMORY_ROM"));
        double flashMemoryCapacity = Double.parseDouble(parameters.get("FLASH_MEMORY_CAPACITY"));
        String color = parameters.get("COLOR");

        return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    private VacuumCleaner createVacuumCleaner(Map<String, String> parameters) {
        double powerConsumption = Double.parseDouble(parameters.get("POWER_CONSUMPTION"));
        String filterType = parameters.get("FILTER_TYPE");
        String bagType = parameters.get("BAG_TYPE");
        String wandType = parameters.get("WAND_TYPE");
        double motorSpeedRegulation = Double.parseDouble(parameters.get("MOTOR_SPEED_REGULATION"));
        double cleaningWidth = Double.parseDouble(parameters.get("CLEANING_WIDTH"));

        return new VacuumCleaner(powerConsumption, filterType, bagType, wandType,
                                motorSpeedRegulation, cleaningWidth);
    }
}
