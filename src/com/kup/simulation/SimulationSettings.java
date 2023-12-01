package com.kup.simulation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimulationSettings {
    private int widthMap = 100;
    private int heightMap = 20;
    private int maxEntityCountOnLocation = 100;   //максимальное количество животных в клетке
    private int simulationCycles = 100;           //количество циклов жизни острова
    
}
