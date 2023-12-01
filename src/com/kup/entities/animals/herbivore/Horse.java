package com.kup.entities.animals.herbivore;

import com.kup.entities.animals.Animal;

public class Horse extends Herbivore{


  
    public Horse() {
        super(400, 20, 4, 60);
    }

    @Override
    public Animal reproduce() {
        return new Horse();
    }
}
