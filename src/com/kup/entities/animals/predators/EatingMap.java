package com.kup.entities.animals.predators;

import lombok.Getter;

import java.util.Map;
@Getter
public class EatingMap {
    private Map<String, Map<String,Integer>> eatableIndexes;
}
