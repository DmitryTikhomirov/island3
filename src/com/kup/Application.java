package com.kup;

import com.kup.simulation.SimulationStarter;

public class Application {
    public static void main(String[] args) {

        SimulationStarter simulationStarter;
        simulationStarter= new SimulationStarter();
        simulationStarter.start();
        System.out.println("Start");
    }
}