package com.kup.entities.animals.herbivore;

import com.kup.entities.animals.Animal;

public class Rabbit extends Herbivore{
    public Rabbit() {
        super(2, 150, 2, 0.45);
    }

    @Override
    public Animal reproduce() {
        return new Rabbit();
    }
}
