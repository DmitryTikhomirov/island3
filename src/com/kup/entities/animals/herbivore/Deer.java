package com.kup.entities.animals.herbivore;

import com.kup.annotations.Entity;
import com.kup.entities.animals.Animal;
@Entity(className = "deer")
public class Deer extends Herbivore{
    public Deer() {
        super(300, 20, 4, 50);
    }

    @Override
    public Animal reproduce() {
        return new Deer();
    }
}
