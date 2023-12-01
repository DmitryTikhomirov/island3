package com.kup.dialog;

import com.kup.simulation.SimulationSettings;

import java.util.Scanner;

public class UserDialog {
    private final SimulationSettings simulationSetting;

    public UserDialog(SimulationSettings simulationSettings) {
        this.simulationSetting = simulationSettings;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello boy");
            System.out.println("Current settings:");
            System.out.println("Height: " + simulationSettings.getHeightMap());
            System.out.println("Width: " + simulationSettings.getWidthMap());
        }
    }
}
