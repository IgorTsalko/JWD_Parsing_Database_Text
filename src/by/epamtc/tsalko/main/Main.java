package by.epamtc.tsalko.main;

import by.epamtc.tsalko.main.controller.DeviceFinder;
import by.epamtc.tsalko.main.model.Device;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DeviceFinder deviceFinder = new DeviceFinder();

        List<Device> devices;
        devices = deviceFinder.findSuitableDevices("Laptop", "OS=Windows", "DISPLAY_INCHS=18");

        for (Device d : devices) {
            System.out.println(d);
        }
    }
}
