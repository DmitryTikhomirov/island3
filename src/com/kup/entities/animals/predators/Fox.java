package com.kup.entities.animals.predators;

import com.kup.entities.animals.Animal;

public class Fox extends Predator{
    public Fox() {
        super(8, 30, 2, 2);
    }

    @Override
    public Animal reproduce() {
        return new Fox();
    }
}
