package by.epamtc.tsalko.main;

import java.util.Map;

public class VacuumCleaner extends Device {

    private final double POWER_CONSUMPTION;
    private final String FILTER_TYPE;
    private final String BAG_TYPE;
    private final String WAND_TYPE;
    private final double MOTOR_SPEED_REGULATION;
    private final double CLEANING_WIDTH;

    public VacuumCleaner(double POWER_CONSUMPTION, String FILTER_TYPE, String BAG_TYPE, String WAND_TYPE, double MOTOR_SPEED_REGULATION, double CLEANING_WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
    }

    public VacuumCleaner(Map<String, String> parameters) {
        POWER_CONSUMPTION = Double.parseDouble(parameters.get("POWER_CONSUMPTION"));
        FILTER_TYPE = parameters.get("FILTER_TYPE");
        BAG_TYPE = parameters.get("BAG_TYPE");
        WAND_TYPE = parameters.get("WAND_TYPE");
        MOTOR_SPEED_REGULATION = Double.parseDouble(parameters.get("MOTOR_SPEED_REGULATION"));
        CLEANING_WIDTH = Double.parseDouble(parameters.get("CLEANING_WIDTH"));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", FILTER_TYPE=" + FILTER_TYPE +
                ", BAG_TYPE=" + BAG_TYPE +
                ", WAND_TYPE=" + WAND_TYPE +
                ", MOTOR_SPEED_REGULATION=" + MOTOR_SPEED_REGULATION +
                ", CLEANING_WIDTH=" + CLEANING_WIDTH +
                '}';
    }
}
