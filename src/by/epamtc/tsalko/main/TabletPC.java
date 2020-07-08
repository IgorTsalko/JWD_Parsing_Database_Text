package by.epamtc.tsalko.main;

import java.util.Map;

public class TabletPC extends Device {

    private final double BATTERY_CAPACITY;
    private final double DISPLAY_INCHES;
    private final double MEMORY_ROM;
    private final double FLASH_MEMORY_CAPACITY;
    private final String COLOR;

    public TabletPC(double BATTERY_CAPACITY, double DISPLAY_INCHES, double MEMORY_ROM, double FLASH_MEMORY_CAPACITY, String COLOR) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
        this.MEMORY_ROM = MEMORY_ROM;
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
        this.COLOR = COLOR;
    }

    public TabletPC(Map<String, String> parameters) {
        BATTERY_CAPACITY = Double.parseDouble(parameters.get("BATTERY_CAPACITY"));
        DISPLAY_INCHES = Double.parseDouble(parameters.get("DISPLAY_INCHES"));
        MEMORY_ROM = Double.parseDouble(parameters.get("MEMORY_ROM"));
        FLASH_MEMORY_CAPACITY = Double.parseDouble(parameters.get("FLASH_MEMORY_CAPACITY"));
        COLOR = parameters.get("COLOR");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", DISPLAY_INCHES=" + DISPLAY_INCHES +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", FLASH_MEMORY_CAPACITY=" + FLASH_MEMORY_CAPACITY +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }
}
