package by.epamtc.tsalko.main;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ParserDatabaseText parser = new ParserDatabaseText();

        List<Device> devices;
        devices = parser.findDevices("Speakers", "FREQUENCY_RANGE", "2-3.5");

        for (Device d : devices) {
            System.out.println(d);
        }
    }
}
