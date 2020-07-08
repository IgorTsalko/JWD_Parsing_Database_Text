package by.epamtc.tsalko.main;

import java.util.Map;

public class Speakers extends Device {

    private final double POWER_CONSUMPTION;
    private final double NUMBER_OF_SPEAKERS;
    private final String FREQUENCY_RANGE;
    private final double CORD_LENGTH;

    public Speakers(double POWER_CONSUMPTION, double NUMBER_OF_SPEAKERS, String FREQUENCY_RANGE, double CORD_LENGTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
        this.CORD_LENGTH = CORD_LENGTH;
    }

    public Speakers(Map<String, String> parameters) {
        POWER_CONSUMPTION = Double.parseDouble(parameters.get("POWER_CONSUMPTION"));
        NUMBER_OF_SPEAKERS = Double.parseDouble(parameters.get("NUMBER_OF_SPEAKERS"));
        FREQUENCY_RANGE = parameters.get("FREQUENCY_RANGE");
        CORD_LENGTH = Double.parseDouble(parameters.get("CORD_LENGTH"));
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", FREQUENCY_RANGE=" + FREQUENCY_RANGE +
                ", CORD_LENGTH=" + CORD_LENGTH +
                '}';
    }
}
