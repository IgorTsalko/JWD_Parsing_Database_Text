package by.epamtc.tsalko.main;

import java.util.Map;

public class Refrigerator extends Device {

    private final double POWER_CONSUMPTION;
    private final double WEIGHT;
    private final double FREEZER_CAPACITY;
    private final double OVERALL_CAPACITY;
    private final double HEIGHT;
    private final double WIDTH;

    public Refrigerator(double POWER_CONSUMPTION, double WEIGHT, double FREEZER_CAPACITY, double OVERALL_CAPACITY, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public Refrigerator(Map<String, String> parameters) {
        POWER_CONSUMPTION = Double.parseDouble(parameters.get("POWER_CONSUMPTION"));
        WEIGHT = Double.parseDouble(parameters.get("WEIGHT"));
        FREEZER_CAPACITY = Double.parseDouble(parameters.get("FREEZER_CAPACITY"));
        OVERALL_CAPACITY = Double.parseDouble(parameters.get("OVERALL_CAPACITY"));
        HEIGHT = Double.parseDouble(parameters.get("HEIGHT"));
        WIDTH = Double.parseDouble(parameters.get("WIDTH"));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
