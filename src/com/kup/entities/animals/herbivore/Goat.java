package com.kup.entities.animals.herbivore;

import com.kup.entities.animals.Animal;

public class Goat extends Herbivore{
    public Goat() {
        super(60, 140, 3, 10);
    }

    @Override
    public Animal reproduce() {
        return new Goat();
    }
}
