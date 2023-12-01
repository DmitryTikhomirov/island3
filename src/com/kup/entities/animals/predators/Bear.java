package com.kup.entities.animals.predators;

import com.kup.entities.animals.Animal;

public class Bear extends Predator{
    public Bear() {
        super(500, 5, 2, 80);
    }

    @Override
    public Animal reproduce() {
        return new Bear();
    }
}
