package com.kup.entities.animals.herbivore;

import com.kup.entities.animals.Animal;

public class Larva extends Herbivore{
    public Larva() {
        super(0.01, 1000, 0, 0);
    }

    @Override
    public Animal reproduce() {
        return new Larva();
    }
}
