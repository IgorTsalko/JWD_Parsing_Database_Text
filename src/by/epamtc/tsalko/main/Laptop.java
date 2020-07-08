package by.epamtc.tsalko.main;

import java.util.Map;

public class Laptop extends Device {

    private final double BATTERY_CAPACITY;
    private final String OS;
    private final double MEMORY_ROM;
    private final double SYSTEM_MEMORY;
    private final double CPU;
    private final double DISPLAY_INCHS;

    public Laptop(double BATTERY_CAPACITY, String OS, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, double DISPLAY_INCHS) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    public Laptop(Map<String, String> parameters) {
        BATTERY_CAPACITY = Double.parseDouble(parameters.get("BATTERY_CAPACITY"));
        OS = parameters.get("OS");
        MEMORY_ROM = Double.parseDouble(parameters.get("MEMORY_ROM"));
        SYSTEM_MEMORY = Double.parseDouble(parameters.get("SYSTEM_MEMORY"));
        CPU = Double.parseDouble(parameters.get("CPU"));
        DISPLAY_INCHS = Double.parseDouble(parameters.get("DISPLAY_INCHS"));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS +
                '}';
    }
}
