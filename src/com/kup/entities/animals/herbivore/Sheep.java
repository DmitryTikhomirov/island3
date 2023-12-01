package com.kup.entities.animals.herbivore;

import com.kup.entities.animals.Animal;

public class Sheep extends Herbivore{
    public Sheep() {
        super(70, 140, 3, 15);
    }

    @Override
    public Animal reproduce() {
        return new Sheep();
    }
}
