package com.kup.entities.animals.herbivore;

import com.kup.entities.animals.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(double weight, int maxOnCage, int speed, double enoughAmountOfFood) {
        super(weight, maxOnCage, speed, enoughAmountOfFood);
    }


}
