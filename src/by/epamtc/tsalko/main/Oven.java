package by.epamtc.tsalko.main;

import java.util.Map;

public class Oven extends Device {

    private final double POWER_CONSUMPTION;
    private final double WEIGHT;
    private final double CAPACITY;
    private final double DEPTH;
    private final double HEIGHT;
    private final double WIDTH;

    public Oven(double POWER_CONSUMPTION, double WEIGHT, double CAPACITY, double DEPTH, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.CAPACITY = CAPACITY;
        this.DEPTH = DEPTH;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public Oven(Map<String, String> parameters) {
        POWER_CONSUMPTION = Double.parseDouble(parameters.get("POWER_CONSUMPTION"));
        WEIGHT = Double.parseDouble(parameters.get("WEIGHT"));
        CAPACITY = Double.parseDouble(parameters.get("CAPACITY"));
        DEPTH = Double.parseDouble(parameters.get("DEPTH"));
        HEIGHT = Double.parseDouble(parameters.get("HEIGHT"));
        WIDTH = Double.parseDouble(parameters.get("WIDTH"));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
