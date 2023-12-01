package com.kup.entities.animals.herbivore;

import com.kup.entities.animals.Animal;

public class Duck extends Herbivore{
    public Duck() {
        super(1, 200, 4, 0.15);
    }

    @Override
    public Animal reproduce() {
        return new Duck();
    }
}
