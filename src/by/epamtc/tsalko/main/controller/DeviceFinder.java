package by.epamtc.tsalko.main.controller;

import by.epamtc.tsalko.main.model.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeviceFinder {

    private LineFinder lineFinder = new LineFinder();
    private lineParser parser = new lineParser();
    private DeviceFactory deviceFactory = new DeviceFactory();

    public List<Device> findSuitableDevices(String deviceName, String... parameters) {
        List<Device> devices = new ArrayList<>();

        List<String> suitableLines = lineFinder.findSuitableLines(deviceName, parameters);
        Map<String, String> params;

        for (String line : suitableLines) {
            params = parser.parsLine(line);
            devices.add(deviceFactory.createDevice(deviceName, params));
        }

        return devices;
    }
}
