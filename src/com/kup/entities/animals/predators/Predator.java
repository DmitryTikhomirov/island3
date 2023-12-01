package com.kup.entities.animals.predators;

import com.kup.entities.animals.Animal;

public abstract class Predator extends Animal {
    public Predator(double weight, int maxOnCage, int speed, double enoughAmountOfFood) {
        super(weight, maxOnCage, speed, enoughAmountOfFood);
    }
}
