package com.kup.simulation;

import com.kup.dialog.UserDialog;
import com.kup.island.IslandController;
import com.kup.island.IslandMap;

public class SimulationStarter {

    private final SimulationSettings simulationSetting;

    private final UserDialog userDialog;
    private final IslandMap islandMap;
    private final IslandController controller;

    public SimulationStarter() {
        this.simulationSetting = new SimulationSettings();
        this.userDialog = new UserDialog(simulationSetting);
        this.islandMap = new  IslandMap(simulationSetting.getHeightMap(), simulationSetting.getWidthMap());
        this.controller = new IslandController(islandMap, null, simulationSetting);
    }

    public void start() {
        controller.getMap().initialize();
        controller.getMap().fill(simulationSetting.getMaxEntityCountOnLocation());
    }
}
