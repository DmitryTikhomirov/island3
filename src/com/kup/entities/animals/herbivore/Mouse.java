package com.kup.entities.animals.herbivore;

import com.kup.entities.animals.Animal;

public class Mouse extends Herbivore{
    public Mouse() {
        super(0.05, 500, 1, 0.01);
    }

    @Override
    public Animal reproduce() {
        return new Mouse();
    }
}
