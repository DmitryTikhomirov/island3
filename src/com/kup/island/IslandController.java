package com.kup.island;

import com.kup.entities.animals.predators.EatingMap;
import com.kup.simulation.SimulationSettings;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IslandController {
    private final IslandMap map;
    private final EatingMap eatingMap;
    private final SimulationSettings simulationSetting;

    public IslandController(IslandMap map, EatingMap eatingMap, SimulationSettings simulationSetting) {
        this.map = map;
        this.eatingMap = eatingMap;
        this.simulationSetting = simulationSetting;
    }
}
